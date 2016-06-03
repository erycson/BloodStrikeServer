package com.bloodstrike.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.*;

public abstract class DAOJPA<T> implements DAOInterface<T>  {
    protected static EntityManager manager;
    protected DAOJPA(){
        manager = getManager();
    }

    protected static EntityManager getManager(){
        if (manager == null) {
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("bloodstrike");
            manager = factory.createEntityManager();
        }
        return manager;
    }

    public void persist(T obj){
        getManager().persist(obj);
    }
    public void remove(T obj) {
        getManager().remove(obj);
    }
    public T merge(T obj){
        return getManager().merge(obj);
    }
    public void refresh(T obj){
        getManager().refresh(obj);
    }
    public void flush(){
        getManager().flush();
    }
    
    @SuppressWarnings("unchecked")
    public T find(Object chave){
        Class<T> type = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        return getManager().find(type, chave);
    }
    
    @SuppressWarnings("unchecked")
    public List<T> findAll(){
        Class<T> type = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        Query query = getManager().createQuery(String.format("select x from %s x", type.getSimpleName()));
        return (List<T>) query.getResultList();
    }
    
    @SuppressWarnings("unchecked")
    protected List<T> findByField(String campo, String valor)   {
        Class<T> type = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        Query query = getManager().createQuery(String.format("SELECT x FROM %s x WHERE x.%s = '%s'", type.getSimpleName(), campo, valor));
        return (List<T>) query.getResultList();
    }
    
    public void close(){
        if (getManager().isOpen())
            manager = null;
    }

    public void begin(){
        if(!getManager().getTransaction().isActive())
            getManager().getTransaction().begin();
    }
    
    public void commit(){
        if(getManager().getTransaction().isActive())
            getManager().getTransaction().commit();     
    }
    
    public void rollback(){
        if (getManager().getTransaction().isActive())
            getManager().getTransaction().rollback();
    }

    public Object findByQuery(String query) {
        try {
            Query q = getManager().createQuery(query);
            return (Object) q.getSingleResult();
        }
        catch (NoResultException e){
            return null;
        }
        catch (NonUniqueResultException e){
            return null;
        }
    }

    @SuppressWarnings("unchecked")
    public  List<T> findAllByQuery(String query){        
        try{
            Query q = getManager().createQuery(query);
            return q.getResultList();
        }
        catch(NoResultException e){
            return null;
        }
        catch(NonUniqueResultException e){
            return null;
        }
    }

    @SuppressWarnings("unchecked")
    public  List<T> findAgregateByQuery(String query){
        Query q = getManager().createQuery(query);
        return q.getResultList();
    }
        

    public int executeUpdate(String query) {
        Query q = getManager().createQuery(query);
        return q.executeUpdate();
    }
    
}

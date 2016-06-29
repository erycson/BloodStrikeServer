package com.bloodstrike.dao;

import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Query;

import com.bloodstrike.entity.User;

import bean.UserInfo;

public class DAOUser extends DAOJPA<User> {
    public UserInfo findByUsername(String username) {
        try {
            Query q = getManager().createQuery("SELECT u FROM User u WHERE u.username=:username");
            q.setParameter("username", username);
            return (UserInfo) q.getSingleResult();
        }
        catch (NoResultException e){
            return null;
        }
        catch (NonUniqueResultException e){
            return null;
        }
    }
}

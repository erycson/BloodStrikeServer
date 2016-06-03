package com.bloodstrike.dao;

import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Query;

import bean.UserInfo;

public class DAOUserInfo extends DAOJPA<UserInfo> {
    public UserInfo findByUsername(String username) {
        try {
            Query q = getManager().createQuery("SELECT u FROM UserInfo u WHERE u.username=:username");
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

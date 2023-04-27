package com.pvt.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.Getter;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class BaseDAO<T> implements DAO<T>{

    protected Class<T> clazz;

    @PersistenceContext
    @Getter
    protected EntityManager entityManager;

    @Override
    public T get(long id) {
        return entityManager.find(clazz,id);
    }

    @Transactional
    @Override
    public void add(T t){
        entityManager.persist(t);
    }
}

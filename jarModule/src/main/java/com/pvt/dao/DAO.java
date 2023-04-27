package com.pvt.dao;

public interface DAO<T> {

    T get (long id) ;
    void add(T t);
}

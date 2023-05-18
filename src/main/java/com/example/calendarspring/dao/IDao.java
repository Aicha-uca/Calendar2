package com.example.calendarspring.dao;

import java.util.List;

public interface    IDao<T> {
    T save(T o);

    List<T> findAll();

    T findById(int id);

    void delete(T o);
     void update(T o);

}

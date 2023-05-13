package com.example.calendarspring.dao;

import java.util.List;

public interface IDao<T> {
    T save(T o);

    List<T> findAll();

    void findById(int id);

    void delete(T o);
    public void update(T o);

}

package com.example.calendarspring.Service;

import com.example.calendarspring.Repository.CoursRepository;
import com.example.calendarspring.bean.Cours;
import com.example.calendarspring.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursService implements IDao<Cours> {
    @Autowired
    private CoursRepository coursRepository;

    @Override
    public Cours save(Cours o) {
        return coursRepository.save(o);
    }

    @Override
    public List<Cours> findAll() {
        return coursRepository.findAll();
    }

    @Override
    public Cours findById(int id) {

        return coursRepository.findById(id);
    }

    @Override
    public void delete(Cours o) {
        coursRepository.delete(o);
    }

    @Override
    public void update(Cours o) {
        coursRepository.save(o);
    }
}

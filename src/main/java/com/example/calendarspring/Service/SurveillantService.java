package com.example.calendarspring.Service;

import com.example.calendarspring.Repository.SurveillantRepository;
import com.example.calendarspring.bean.Surveillant;
import com.example.calendarspring.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurveillantService implements IDao<Surveillant> {
    @Autowired
    private SurveillantRepository surveillantRepository;


    @Override
    public Surveillant save(Surveillant o) {
        return surveillantRepository.save(o);
    }

    @Override
    public List<Surveillant> findAll() {
        return surveillantRepository.findAll();
    }

    @Override
    public Surveillant findById(int id) {
       return surveillantRepository.findById(id);
    }

    @Override
    public void delete(Surveillant o) {
        surveillantRepository.delete(o);
    }

    @Override
    public void update(Surveillant o) {
        surveillantRepository.save(o);
    }
}


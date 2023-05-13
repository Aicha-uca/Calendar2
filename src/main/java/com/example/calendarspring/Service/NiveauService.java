package com.example.calendarspring.Service;

import com.example.calendarspring.Repository.NiveauRepository;
import com.example.calendarspring.bean.Niveau;
import com.example.calendarspring.dao.IDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NiveauService implements IDao<Niveau> {
    @Autowired
    private NiveauRepository niveauRepository;


    @Override
    public Niveau save(Niveau o) {
        return niveauRepository.save(o);
    }

    @Override
    public List<Niveau> findAll() {
        return niveauRepository.findAll();
    }

    @Override
    public void findById(int id) {
        niveauRepository.findById(id);
    }

    @Override
    public void delete(Niveau o) {
        niveauRepository.delete(o);
    }

    @Override
    public void update(Niveau o) {
        niveauRepository.save(o);
    }
}

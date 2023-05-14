package com.example.calendarspring.Service;

import com.example.calendarspring.Repository.FiliereRepository;
import com.example.calendarspring.bean.Filiere;
import com.example.calendarspring.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FiliereService implements IDao<Filiere> {

    @Autowired
    private FiliereRepository filiereRepository;
    @Override
    public Filiere save(Filiere o) {
        return filiereRepository.save(o);
    }

    @Override
    public List<Filiere> findAll() {
        return filiereRepository.findAll();
    }

    @Override
    public Filiere findById(int id) {
    return filiereRepository.findById(id);

    }

    @Override
    public void delete(Filiere o) {
     filiereRepository.delete(o);
    }

    @Override
    public void update(Filiere o) {
        filiereRepository.save(o);
    }
}

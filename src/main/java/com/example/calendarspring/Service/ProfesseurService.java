package com.example.calendarspring.Service;

import com.example.calendarspring.Repository.ProfesseurRepository;
import com.example.calendarspring.bean.Professeur;
import com.example.calendarspring.dao.IDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesseurService implements IDao<Professeur> {
    @Autowired
    private ProfesseurRepository professeurRepository;


    @Override
    public  Professeur save(Professeur o) {
        return professeurRepository.save(o);
    }

    @Override
    public  List<Professeur> findAll() {
        return professeurRepository.findAll();
    }

    @Override
    public Professeur findById(int id) {
       return professeurRepository.findById(id);
    }

    @Override
    public  void delete(Professeur o) {
        professeurRepository.delete(o);
    }

    @Override
    public void update(Professeur o) {
        professeurRepository.save(o);
    }
}

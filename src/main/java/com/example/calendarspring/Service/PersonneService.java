package com.example.calendarspring.Service;

import com.example.calendarspring.Repository.PersonneRepository;
import com.example.calendarspring.bean.Personne;
import com.example.calendarspring.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonneService implements IDao<Personne> {

    @Autowired
    private PersonneRepository personneRepository;
    @Override
    public Personne save(Personne o) {
        return personneRepository.save(o);
    }

    @Override
    public List<Personne> findAll() {
        return personneRepository.findAll();
    }

    @Override
    public Personne findById(int id) {
     return personneRepository.findById(id);
    }

    @Override
    public void delete(Personne o) {
    personneRepository.delete(o);
    }

    @Override
    public void update(Personne o) {
        personneRepository.save(o);
    }
}

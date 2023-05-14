package com.example.calendarspring.Service;

import com.example.calendarspring.Repository.SalleRepository;
import com.example.calendarspring.bean.Salle;
import com.example.calendarspring.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalleService implements IDao<Salle> {
    @Autowired
    private SalleRepository salleRepository;

    @Override
    public Salle save(Salle o) {
        return salleRepository.save(o);
    }

    @Override
    public List<Salle> findAll() {
        return salleRepository.findAll();
    }

    @Override
    public Salle findById(int id) {
       return salleRepository.findById(id);
    }

    @Override
    public void delete(Salle o) {
        salleRepository.delete(o);
    }

    @Override
    public void update(Salle o) {
        salleRepository.save(o);
    }
}

package com.example.calendarspring.Service;

import com.example.calendarspring.Repository.DepartementRepository;
import com.example.calendarspring.bean.Departement;
import com.example.calendarspring.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartementService implements IDao<Departement> {
    @Autowired
    private DepartementRepository departementRepository;

    @Override
    public Departement save(Departement o) {
        return departementRepository.save(o);
    }

    @Override
    public List<Departement> findAll() {
        return departementRepository.findAll();
    }

    @Override
    public Departement findById(int id) {
        return departementRepository.findById(id);
    }

    @Override
    public void delete(Departement o) {
        departementRepository.delete(o);
    }

    @Override
    public void update(Departement o) {
        departementRepository.save(o);
    }
}

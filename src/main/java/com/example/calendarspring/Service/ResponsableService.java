package com.example.calendarspring.Service;

import com.example.calendarspring.Repository.ResponsableRepository;
import com.example.calendarspring.bean.Responsable;
import com.example.calendarspring.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResponsableService implements IDao<Responsable> {

    @Autowired
    private ResponsableRepository responsableRepository;


    @Override
    public Responsable save(Responsable o) {
        return responsableRepository.save(o);
    }

    @Override
    public List<Responsable> findAll() {
        return responsableRepository.findAll();
    }

    @Override
    public void findById(int id) {
        responsableRepository.findById(id);
    }

    @Override
    public void delete(Responsable o) {
        responsableRepository.delete(o);
    }

    @Override
    public void update(Responsable o) {
        responsableRepository.save(o);
    }
}

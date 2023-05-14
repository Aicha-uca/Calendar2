package com.example.calendarspring.Service;

import com.example.calendarspring.Repository.EtudiantRepository;
import com.example.calendarspring.bean.Etudiant;
import com.example.calendarspring.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantService implements IDao<Etudiant> {

@Autowired
private EtudiantRepository etudiantRepository;
    @Override
    public Etudiant save(Etudiant o) {
        return etudiantRepository.save(o);
    }

    @Override
    public List<Etudiant> findAll() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant findById(int id) {
        return etudiantRepository.findById(id);
    }

    @Override
    public void delete(Etudiant o) {
        etudiantRepository.delete(o);
    }

    @Override
    public void update(Etudiant o) {
         etudiantRepository.save(o);
    }
}

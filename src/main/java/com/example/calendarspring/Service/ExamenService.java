package com.example.calendarspring.Service;

import com.example.calendarspring.Repository.ExamRepository;
import com.example.calendarspring.bean.Exam;
import com.example.calendarspring.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamenService implements IDao<Exam> {
    @Autowired
    private ExamRepository examRepository;

    @Override
    public Exam save(Exam o) {
        return examRepository.save(o);
    }

    @Override
    public List<Exam> findAll() {
        return examRepository.findAll();
    }

    @Override
    public void findById(int id) {
        examRepository.findById(id);
    }

    @Override
    public void delete(Exam o) {
        examRepository.delete(o);

    }

    @Override
    public void update(Exam o) {
        examRepository.save(o);
    }
}

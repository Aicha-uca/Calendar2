package com.example.calendarspring.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.calendarspring.dao.IDao;
import com.example.calendarspring.bean.Calendar;
import com.example.calendarspring.Repository.CalendarRepository;
@Service
public class CalendarService implements IDao<Calendar>{
    @Autowired
    private CalendarRepository calendarRepository;

    @Override
    public Calendar save(Calendar p) {
        return calendarRepository.save(p);
    }

    @Override
    public List<Calendar> findAll() {
        return calendarRepository.findAll();
    }

    @Override
    public void findById(int id) {
         calendarRepository.findById(id);
    }

    @Override
    public void update(Calendar p) {
        calendarRepository.save(p);
    }

    @Override
    public void delete(Calendar p) {
        calendarRepository.delete(p);

    }


}
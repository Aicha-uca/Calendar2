package com.example.calendarspring.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.calendarspring.bean.Calendar;


public interface CalendarRepository extends JpaRepository<Calendar, Integer> {

    Calendar findById(int id);
}

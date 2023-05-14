package com.example.calendarspring.Repository;

import com.example.calendarspring.bean.Exam;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ExamRepository extends JpaRepository<Exam,Integer> {
Exam findById(int id);
}

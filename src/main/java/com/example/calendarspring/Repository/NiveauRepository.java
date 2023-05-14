package com.example.calendarspring.Repository;

import com.example.calendarspring.bean.Niveau;
import org.springframework.data.jpa.repository.JpaRepository;



public interface NiveauRepository extends JpaRepository<Niveau, Integer> {
    Niveau findById(int id);
}

package com.example.calendarspring.Repository;

import com.example.calendarspring.bean.Responsable;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ResponsableRepository extends JpaRepository<Responsable,Integer> {
    Responsable findById(int id);
}

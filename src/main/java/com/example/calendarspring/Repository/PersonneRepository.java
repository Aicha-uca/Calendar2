package com.example.calendarspring.Repository;

import com.example.calendarspring.bean.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneRepository extends JpaRepository<Personne,Integer> {
    Personne findById(int id);
}

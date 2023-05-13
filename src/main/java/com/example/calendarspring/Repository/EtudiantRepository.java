package com.example.calendarspring.Repository;

import com.example.calendarspring.bean.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;



public interface EtudiantRepository extends JpaRepository<Etudiant,Integer> {

}

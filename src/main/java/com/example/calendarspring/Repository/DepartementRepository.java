package com.example.calendarspring.Repository;

import com.example.calendarspring.bean.Departement;
import org.springframework.data.jpa.repository.JpaRepository;



public interface DepartementRepository extends JpaRepository<Departement,Integer> {
Departement findById(int id);

}

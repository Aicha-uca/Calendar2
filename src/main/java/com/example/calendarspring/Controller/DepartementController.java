package com.example.calendarspring.Controller;
import com.example.calendarspring.Service.DepartementService;
import com.example.calendarspring.bean.Departement;
import org.aspectj.apache.bcel.generic.RET;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController

@RequestMapping(value = "/api/departements")
public class DepartementController {
    @Autowired
    private DepartementService departementService;
    @PostMapping ("/save")
    public Departement save(Departement o) {
        return departementService.save(o);
    }
    @GetMapping ("/")
    public List<Departement> findAll() {
        return departementService.findAll();
    }
    @GetMapping
    public Departement findById(int id) {
       return departementService.findById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(Departement o) {
        departementService.delete(o);
    }
}

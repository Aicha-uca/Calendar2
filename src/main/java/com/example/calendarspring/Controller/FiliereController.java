package com.example.calendarspring.Controller;

import com.example.calendarspring.Service.FiliereService;
import com.example.calendarspring.bean.Filiere;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/filiers")
public class FiliereController {
@Autowired
    private FiliereService filiereService;
@PostMapping("/save")
    public Filiere save(Filiere o) {
        return filiereService.save(o);
    }
@GetMapping("/")
    public List<Filiere> findAll() {
        return filiereService.findAll();
    }
@GetMapping
    public void findById(int id) {
        filiereService.findById(id);
    }
@DeleteMapping("/delete/{id}")
    public void delete(Filiere o) {
        filiereService.delete(o);
    }
}

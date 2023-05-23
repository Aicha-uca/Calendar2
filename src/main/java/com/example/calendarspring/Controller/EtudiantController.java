package com.example.calendarspring.Controller;
import com.example.calendarspring.Service.EtudiantService;
import com.example.calendarspring.bean.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/etudiants")
public class EtudiantController {
    @Autowired
    private EtudiantService etudiantService;
    @PostMapping ("/save")
    public Etudiant save(@RequestBody Etudiant o) {
        return etudiantService.save(o);
    }
    @GetMapping ("/")
    public List<Etudiant> findAll() {
        return etudiantService.findAll();
    }
    @GetMapping("/id/{id}")
    public Etudiant findById(@PathVariable int id) {
        return etudiantService.findById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@RequestBody Etudiant o) {
        etudiantService.delete(o);
    }
}

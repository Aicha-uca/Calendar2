package com.example.calendarspring.Controller;

import com.example.calendarspring.Service.PersonneService;
import com.example.calendarspring.bean.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/personnes")
public class PersonneController {

    @Autowired
    private PersonneService personneService;

    @PostMapping("/save")
    public Personne save(@RequestBody Personne o) {
        return personneService.save(o);
    }
    @GetMapping("/all")
    public List<Personne> findAll() {
        return personneService.findAll();
    }
    @GetMapping("/id/{id}")
    public Personne findById(@RequestBody int id) {
       return personneService.findById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@RequestBody Personne o) {
        personneService.delete(o);
    }
}

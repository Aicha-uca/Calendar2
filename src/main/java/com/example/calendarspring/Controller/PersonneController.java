package com.example.calendarspring.Controller;

import com.example.calendarspring.Service.PersonneService;
import com.example.calendarspring.bean.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/personnes")
public class PersonneController {

    @Autowired
    private PersonneService personneService;

    public Personne save(Personne o) {
        return personneService.save(o);
    }

    public List<Personne> findAll() {
        return personneService.findAll();
    }

    public Personne findById(int id) {
       return personneService.findById(id);
    }

    public void delete(Personne o) {
        personneService.delete(o);
    }
}

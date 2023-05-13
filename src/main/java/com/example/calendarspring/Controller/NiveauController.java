package com.example.calendarspring.Controller;
import com.example.calendarspring.Service.NiveauService;
import com.example.calendarspring.bean.Niveau;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "/api/niveaux")
public class NiveauController {
@Autowired
private NiveauService niveauService;
    @PostMapping ("/save")
    public Niveau save(Niveau o) {
        return niveauService.save(o);
    }
    @GetMapping ("/")
    public List<Niveau> findAll() {
        return niveauService.findAll();
    }
    @GetMapping
    public void findById(int id) {
        niveauService.findById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(Niveau o) {
        niveauService.delete(o);
    }
}

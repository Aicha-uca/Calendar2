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
    public Niveau save(@RequestBody Niveau o) {
        return niveauService.save(o);
    }
    @GetMapping ("/all")
    public List<Niveau> findAll() {
        return niveauService.findAll();
    }
    @GetMapping("/id/{id}")
    public Niveau findById(@PathVariable int id) {
       return niveauService.findById(id);
    }
    @DeleteMapping("/delete")
    public void delete(@RequestBody Niveau o) {
        niveauService.delete(o);
    }
 }

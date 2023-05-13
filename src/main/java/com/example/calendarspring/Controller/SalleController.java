package com.example.calendarspring.Controller;
import com.example.calendarspring.Service.SalleService;
import com.example.calendarspring.bean.Salle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/salles")
public class SalleController {
@Autowired
private SalleService salleService;
    @PostMapping ("/save")
    public Salle save(Salle o) {
        return salleService.save(o);
    }
    @GetMapping ("/")
    public List<Salle> findAll() {
        return salleService.findAll();
    }
    @GetMapping
    public void findById(int id) {
        salleService.findById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(Salle o) {
        salleService.delete(o);
    }
}

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
    public Salle save(@RequestBody Salle o) {
        return salleService.save(o);
    }
    @GetMapping ("/all")
    public List<Salle> findAll() {
        return salleService.findAll();
    }
    @GetMapping("/update")
    public Salle findById(@PathVariable int id) {
        return salleService.findById(id);
    }
    @DeleteMapping("/delete")
    public void delete(@RequestBody Salle o) {
        salleService.delete(o);
    }
}

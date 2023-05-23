package com.example.calendarspring.Controller;
import com.example.calendarspring.Service.ProfesseurService;
import com.example.calendarspring.bean.Professeur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping(value = "/api/professeurs")
public class ProfesseurController {
@Autowired
private ProfesseurService professeurService;
    @PostMapping ("/save")
    public Professeur save(@RequestBody Professeur o) {
        return professeurService.save(o);
    }
    @GetMapping ("/all")
    public List<Professeur> findAll() {
        return professeurService.findAll();
    }
    @GetMapping("/id/{id}")
    public Professeur findById(@PathVariable int id) {
       return professeurService.findById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@RequestBody Professeur o) {
        professeurService.delete(o);
    }
}

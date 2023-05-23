package com.example.calendarspring.Controller;
import com.example.calendarspring.Service.CoursService;
import com.example.calendarspring.bean.Cours;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping (value = "/api/cours")
public class CoursController {
    @Autowired
    private CoursService coursService;

    @PostMapping("/save")

    public Cours save(@RequestBody Cours o) {
        return coursService.save(o);
    }
    @GetMapping ("/all")
    public List<Cours> findAll() {
        return coursService.findAll();
    }
    @GetMapping("/id/{id}")
    public Cours findById(@PathVariable int id) {
       return coursService.findById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@RequestBody Cours o) {
        coursService.delete(o);
    }
}
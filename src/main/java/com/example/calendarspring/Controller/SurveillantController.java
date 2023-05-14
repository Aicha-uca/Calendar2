package com.example.calendarspring.Controller;
import com.example.calendarspring.Service.SurveillantService;
import com.example.calendarspring.bean.Surveillant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/surveillants")
public class SurveillantController {

    @Autowired
    private SurveillantService surveillantService;
    @PostMapping ("/save")
    public Surveillant save(Surveillant o) {
        return surveillantService.save(o);
    }
    @GetMapping ("/")
    public List<Surveillant> findAll() {
        return surveillantService.findAll();
    }
    @GetMapping
    public Surveillant findById(int id) {
       return surveillantService.findById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(Surveillant o) {
        surveillantService.delete(o);
    }
}

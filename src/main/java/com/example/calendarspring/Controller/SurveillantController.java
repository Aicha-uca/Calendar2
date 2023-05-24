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
    public Surveillant save(@RequestBody Surveillant o) {
        return surveillantService.save(o);
    }
    @GetMapping ("/all")
    public List<Surveillant> findAll() {
        return surveillantService.findAll();
    }
    @GetMapping("/id/{id}")
    public Surveillant findById(@PathVariable int id) {
       return surveillantService.findById(id);
    }
    @PutMapping("/update")
    public void update(@RequestBody Surveillant o) {
        surveillantService.update(o);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@RequestBody Surveillant o) {
        surveillantService.delete(o);
    }
}

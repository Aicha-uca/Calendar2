package com.example.calendarspring.Controller;
import com.example.calendarspring.Service.ResponsableService;
import com.example.calendarspring.bean.Responsable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/responsables")
public class ResponsableController {
    @Autowired
    private ResponsableService responsableService;
    @PostMapping ("/save")
    public Responsable save(@RequestBody Responsable o) {
        return responsableService.save(o);
    }
    @GetMapping ("/all")
    public List<Responsable> findAll() {
        return responsableService.findAll();
    }
    @GetMapping("/id/{id}")
    public Responsable findById(@PathVariable int id) {
       return responsableService.findById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@RequestBody Responsable o) {
        responsableService.delete(o);
    }
}

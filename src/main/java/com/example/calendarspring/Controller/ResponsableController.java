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
    public Responsable save(Responsable o) {
        return responsableService.save(o);
    }
    @GetMapping ("/")
    public List<Responsable> findAll() {
        return responsableService.findAll();
    }
    @GetMapping
    public void findById(int id) {
        responsableService.findById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(Responsable o) {
        responsableService.delete(o);
    }
}

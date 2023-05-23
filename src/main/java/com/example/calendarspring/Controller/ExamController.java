package com.example.calendarspring.Controller;

import com.example.calendarspring.Service.ExamenService;
import com.example.calendarspring.bean.Exam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/exams")
public class ExamController {
    @Autowired
    private ExamenService examenService;
    @PostMapping ("/save")
    public Exam save(@RequestBody Exam o) {
        return examenService.save(o);
    }
    @GetMapping ("/all")
    public List<Exam> findAll() {
        return examenService.findAll();
    }
    @GetMapping("/id/{id}")
    public Exam findById(@PathVariable int id) {
       return examenService.findById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@RequestBody Exam o) {
        examenService.delete(o);
    }
}

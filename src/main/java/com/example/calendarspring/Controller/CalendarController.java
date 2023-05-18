package com.example.calendarspring.Controller;


import com.example.calendarspring.Service.CalendarService;
import com.example.calendarspring.bean.Calendar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/calendars")
public class CalendarController {
    @Autowired
    CalendarService calendarService;

    @PostMapping("/save")
    public Calendar save(@RequestBody Calendar p) {
        return calendarService.save(p);
    }
    @GetMapping("/all")
    public List<Calendar> findAll() {
        return calendarService.findAll();
    }
    @GetMapping("/id/{id}")
    public Calendar findById(@PathVariable int id) {
        return calendarService.findById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody Calendar p) {
        calendarService.update(p);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody Calendar p) {
        calendarService.delete(p);
    }
}

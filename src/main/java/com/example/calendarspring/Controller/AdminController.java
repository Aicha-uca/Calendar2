package com.example.calendarspring.Controller;

import com.example.calendarspring.Service.AdminService;
import com.example.calendarspring.bean.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/admin")

public class AdminController {
    @Autowired
    private AdminService adminService;
    @PostMapping ("/save")
    public Admin save(Admin o) {
        return adminService.save(o);
    }
    @GetMapping ("/")

    public List<Admin> findAll() {
        return adminService.findAll();
    }
    @GetMapping

    public void findById(int id) {
        adminService.findById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(Admin o) {
        adminService.delete(o);
    }
}

package com.example.calendarspring.Service;

import com.example.calendarspring.Repository.AdminRepository;
import com.example.calendarspring.bean.Admin;
import com.example.calendarspring.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService implements IDao<Admin> {
    @Autowired
    private AdminRepository adminRepository;


    @Override
    public Admin save(Admin o) {
        return adminRepository.save(o);
    }

    @Override
    public List<Admin> findAll() {
        return adminRepository.findAll();
    }

    @Override
    public Admin findById(int id) {
       return adminRepository.findById(id);
    }

    @Override
    public void delete(Admin o) {
        adminRepository.delete(o);
    }

    @Override
    public void update(Admin o) {
        adminRepository.save(o);
    }
}

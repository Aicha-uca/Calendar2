package com.example.calendarspring.Service;

import com.example.calendarspring.Repository.UserRepository;
import com.example.calendarspring.bean.User;
import com.example.calendarspring.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IDao<User> {


    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User save(User o) {
        return null;
    }

    @Override
    public User findById(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void update(User o) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(User o) {
        // TODO Auto-generated method stub

    }






}

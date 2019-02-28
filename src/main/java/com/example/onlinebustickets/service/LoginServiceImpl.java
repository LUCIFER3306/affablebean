package com.example.onlinebustickets.service;

import com.example.onlinebustickets.domain.Login;
import com.example.onlinebustickets.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginRepository loginRepository;
    @Override
    public Login create(Login login) {
        return loginRepository.save(login);
    }

    @Override
    public Login findById(int id) {
        return loginRepository.getOne(id);
    }

    @Override
    public List<Login> findAll() {
        return loginRepository.findAll();
    }
}

package com.example.onlinebustickets.service;

import com.example.onlinebustickets.domain.Login;

import java.util.List;

public interface LoginService {
    Login create( Login login);
    Login findById(int id);
    List<Login> findAll();
}

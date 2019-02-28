package com.example.onlinebustickets.controller;

import com.example.onlinebustickets.domain.Login;
import com.example.onlinebustickets.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;
    @GetMapping("/login/creation")
    public String create(Model model){
        model.addAttribute("login",new Login());
        return "loginForm";
    }
    @PostMapping("/login/creation")
    public String process(@Valid Login login, BindingResult result){
        if(result.hasErrors()){
            return "loginForm";
        }
        loginService.create(login);
        return "redirect:/login/all";
    }
    @GetMapping("/login/all")
    public String showAll(Model model){
        model.addAttribute("logins", loginService.findAll());
        return "logins";
    }

}

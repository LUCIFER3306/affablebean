package com.example.onlinebustickets.controller;

import com.example.onlinebustickets.domain.CustomerInfo;
import com.example.onlinebustickets.service.CustomerInfoService;
import com.example.onlinebustickets.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class CustomerInfoController {
    @Autowired
    private CustomerInfoService customerInfoService;
    @Autowired
    private LoginService loginService;

    @GetMapping("/customerInfo/creation")
    public String create(Model model){
        model.addAttribute("customers",new CustomerInfo());
        model.addAttribute("login",loginService.findAll());
        return "customerInfoForm";
    }
    @PostMapping("/customerInfo/creation")
    public String process(@Valid CustomerInfo customerInfo, BindingResult result, Model model){
        if (result.hasErrors()){
            model.addAttribute("login",loginService.findAll());
            return "customerInfoForm";
        }
        customerInfoService.create(customerInfo);
        return "redirect:/customerInfo/all";
    }
    @GetMapping("/customerInfo/all")
    public String showAll(Model model){
        model.addAttribute("customers",customerInfoService.findAll());
        return "customerInformations";
    }
}

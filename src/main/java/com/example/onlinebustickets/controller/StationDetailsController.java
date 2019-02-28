package com.example.onlinebustickets.controller;

import com.example.onlinebustickets.domain.StationDetails;
import com.example.onlinebustickets.service.StationDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class StationDetailsController {
    @Autowired
    private StationDetailsService stationDetailsService;
    @GetMapping("/stationDetails/creation")
    public String create(Model model){
        model.addAttribute("stationDetails",new StationDetails());
        return "stationDetailsForm";
    }
    @PostMapping("/stationDetails/creation")
    public String process(@Valid StationDetails stationDetails, BindingResult result){
        if (result.hasErrors()){
            return "stationDetailsForm";
        }
        stationDetailsService.create(stationDetails);
        return "redirect:/stationDetails/all";
    }
    @GetMapping("/stationDetails/all")
    public String ahowAll(Model model){
        model.addAttribute("stationDetails",stationDetailsService.findAll());
        return "stationDetails";
    }
}

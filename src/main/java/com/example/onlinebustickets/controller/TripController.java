package com.example.onlinebustickets.controller;

import com.example.onlinebustickets.domain.Trip;
import com.example.onlinebustickets.service.StationDetailsService;
import com.example.onlinebustickets.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class TripController {
    @Autowired
    private TripService tripService;
    @Autowired
    private StationDetailsService stationDetailsService;
    @GetMapping("/trip/creation")
    public String create(Model model){
        model.addAttribute("trip",new Trip());
        model.addAttribute("stationDetails", stationDetailsService.findAll());
        return "tripForm";
    }
    @PostMapping("/trip/creation")
    public String process(@Valid Trip trip, BindingResult result, Model model){
        if(result.hasErrors()){
            model.addAttribute("stationDetails", stationDetailsService.findAll());
            return "tripForm";
        }
        tripService.create(trip);
        return "redirect:/trip/all";
    }
    @GetMapping("/trip/all")
    public String showAll(Model model){
        model.addAttribute("trips", tripService.findAll());

        return "trips";
    }
}

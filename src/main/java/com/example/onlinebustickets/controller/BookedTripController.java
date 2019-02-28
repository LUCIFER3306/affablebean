package com.example.onlinebustickets.controller;

import com.example.onlinebustickets.domain.BookedTrip;
import com.example.onlinebustickets.service.BookedTripService;
import com.example.onlinebustickets.service.BookingPaymentService;
import com.example.onlinebustickets.service.CustomerInfoService;
import com.example.onlinebustickets.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class BookedTripController {
    @Autowired
    private BookedTripService bookedTripService;
    @Autowired
    private BookingPaymentService bookingPaymentService;
    @Autowired
    private TripService tripService;
    @Autowired
    private CustomerInfoService customerInfoService;
    @GetMapping("/bookedtrip/creation")
    public String create(Model model){
        model.addAttribute("bookedTrip",new BookedTrip());
        model.addAttribute("bookingpayments",bookingPaymentService.findAll());
        model.addAttribute("trips",tripService.findAll());
        model.addAttribute("customerInfo",customerInfoService.findAll());
        return "bookedtripForm";
    }
    @PostMapping("/bookedtrip/creation")
    public String process(@Valid BookedTrip bookedTrip, BindingResult result, Model model){
        if (result.hasErrors()){
            model.addAttribute("bookingpayments",bookingPaymentService.findAll());
            model.addAttribute("trips",tripService.findAll());
            model.addAttribute("customerInfo",customerInfoService.findAll());
            return "bookedtripForm";
        }
        bookedTripService.create(bookedTrip);
        return "redirect:/bookedtrip/all";
    }
    @GetMapping("/bookedtrip/all")
    public String showAll(Model model){
        model.addAttribute("bookedtrips", bookedTripService.findAll());
        return "bookedtrips";
    }
}

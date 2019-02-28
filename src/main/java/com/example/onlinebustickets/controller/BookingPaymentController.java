package com.example.onlinebustickets.controller;

import com.example.onlinebustickets.domain.BookingPayment;
import com.example.onlinebustickets.service.BookingPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class BookingPaymentController {
    @Autowired
    private BookingPaymentService bookingPaymentService;
    @GetMapping("/bookingPayment/creation")
    public String create(Model model){
        model.addAttribute("bookingpayment",new BookingPayment());
        return "bookingpaymentForm";
    }
    @PostMapping("/bookingPayment/creation")
    public String process(@Valid BookingPayment bookingPayment, BindingResult result){
        if (result.hasErrors()){
            return "bookingpaymentForm";
        }
        bookingPaymentService.create(bookingPayment);
        return "redirect:/bookingpayment/all";
    }
    @GetMapping("/bookingpayment/all")
    public String showAll(Model model){
        model.addAttribute("bookingpayments",bookingPaymentService.findAll());
        return "bookingpayments";
    }
}

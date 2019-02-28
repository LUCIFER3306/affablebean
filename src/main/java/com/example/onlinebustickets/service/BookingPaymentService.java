package com.example.onlinebustickets.service;

import com.example.onlinebustickets.domain.BookingPayment;

import java.util.List;

public interface BookingPaymentService {
    BookingPayment create(BookingPayment bookingPayment);
    BookingPayment findById(int id);
    List<BookingPayment> findAll();
}

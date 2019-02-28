package com.example.onlinebustickets.service;

import com.example.onlinebustickets.domain.BookingPayment;
import com.example.onlinebustickets.repository.BookingPaymentReposiotry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookingPaymentServiceImpl implements BookingPaymentService {
    @Autowired
    private BookingPaymentReposiotry bookingPaymentReposiotry;
    @Override
    public BookingPayment create(BookingPayment bookingPayment) {
        return bookingPaymentReposiotry.save(bookingPayment);
    }

    @Override
    public BookingPayment findById(int id) {
        return bookingPaymentReposiotry.getOne(id);
    }

    @Override
    public List<BookingPayment> findAll() {
        return bookingPaymentReposiotry.findAll();
    }
}

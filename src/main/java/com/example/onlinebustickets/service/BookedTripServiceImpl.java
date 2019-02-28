package com.example.onlinebustickets.service;

import com.example.onlinebustickets.domain.BookedTrip;
import com.example.onlinebustickets.repository.BookedTripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookedTripServiceImpl implements BookedTripService {
    @Autowired
    private BookedTripRepository bookedTripRepository;
    @Override
    public BookedTrip create(BookedTrip bookedTrip) {
        return bookedTripRepository.save(bookedTrip);
    }

    @Override
    public BookedTrip FindBookedTripById(int id) {
        return bookedTripRepository.getOne(id);
    }

    @Override
    public List<BookedTrip> findAll() {
        return bookedTripRepository.findAll();
    }
}

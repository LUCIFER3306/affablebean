package com.example.onlinebustickets.service;

import com.example.onlinebustickets.domain.BookedTrip;

import java.util.List;

public interface BookedTripService {
    BookedTrip create(BookedTrip bookedTrip);
    BookedTrip FindBookedTripById(int id);
    List<BookedTrip> findAll();
}

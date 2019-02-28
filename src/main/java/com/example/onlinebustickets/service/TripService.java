package com.example.onlinebustickets.service;

import com.example.onlinebustickets.domain.Trip;

import java.util.List;

public interface TripService {
    Trip create(Trip trip);
    Trip findById(int id);
    List<Trip> findAll();
}

package com.example.onlinebustickets.service;

import com.example.onlinebustickets.domain.Trip;
import com.example.onlinebustickets.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TripServiceImpl implements TripService {
    @Autowired
    private TripRepository tripRepository;
    @Override
    public Trip create(Trip trip) {
        return tripRepository.save(trip);
    }

    @Override
    public Trip findById(int id) {
        return tripRepository.getOne(id);
    }

    @Override
    public List<Trip> findAll() {
        return tripRepository.findAll();
    }
}

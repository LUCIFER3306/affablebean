package com.example.onlinebustickets.service;

import com.example.onlinebustickets.domain.StationDetails;

import java.util.List;

public interface StationDetailsService {
    StationDetails create(StationDetails stationDetails);
    StationDetails findById(int id);
    List<StationDetails> findAll();
}

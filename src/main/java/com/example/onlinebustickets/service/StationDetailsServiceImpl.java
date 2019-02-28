package com.example.onlinebustickets.service;

import com.example.onlinebustickets.domain.StationDetails;
import com.example.onlinebustickets.repository.StationDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StationDetailsServiceImpl implements StationDetailsService {
    @Autowired
    private StationDetailsRepository stationDetailsRepository;
    @Override
    public StationDetails create(StationDetails stationDetails) {
        return stationDetailsRepository.save(stationDetails);
    }

    @Override
    public StationDetails findById(int id) {
        return stationDetailsRepository.getOne(id);
    }

    @Override
    public List<StationDetails> findAll() {
        return stationDetailsRepository.findAll();
    }
}

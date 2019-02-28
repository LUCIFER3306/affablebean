package com.example.onlinebustickets.repository;

import com.example.onlinebustickets.domain.StationDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StationDetailsRepository extends JpaRepository<StationDetails, Integer> {
}

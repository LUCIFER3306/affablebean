package com.example.onlinebustickets.repository;

import com.example.onlinebustickets.domain.BookedTrip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookedTripRepository extends JpaRepository<BookedTrip, Integer> {
}

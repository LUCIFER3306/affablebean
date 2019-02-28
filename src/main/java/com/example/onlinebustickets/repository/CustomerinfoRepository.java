package com.example.onlinebustickets.repository;

import com.example.onlinebustickets.domain.CustomerInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerinfoRepository extends JpaRepository<CustomerInfo, Integer> {
}

package com.example.onlinebustickets.repository;

import com.example.onlinebustickets.domain.BookingPayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
@Repository
public interface BookingPaymentReposiotry extends JpaRepository<BookingPayment, Integer> {
}

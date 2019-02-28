package com.example.onlinebustickets.service;

import com.example.onlinebustickets.domain.CustomerInfo;

import java.util.List;

public interface CustomerInfoService {
    CustomerInfo create(CustomerInfo customerInfo);
    CustomerInfo findCustomerById(int id);
    List<CustomerInfo> findAll();
}

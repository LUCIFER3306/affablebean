package com.example.onlinebustickets.service;

import com.example.onlinebustickets.domain.CustomerInfo;
import com.example.onlinebustickets.repository.CustomerinfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerInfoServiceImpl implements CustomerInfoService {
    @Autowired
    private CustomerinfoRepository customerinfoRepository;
    @Override
    public CustomerInfo create(CustomerInfo customerInfo) {
        return customerinfoRepository.save(customerInfo);
    }

    @Override
    public CustomerInfo findCustomerById(int id) {
        return customerinfoRepository.getOne(id);
    }

    @Override
    public List<CustomerInfo> findAll() {
        return customerinfoRepository.findAll();
    }
}

package com.yazdi.products.service.impl;

import com.yazdi.products.domain.Customer;
import com.yazdi.products.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl extends BaseServiceImpl<Long, Customer, CustomerRepository>{
    public CustomerServiceImpl(CustomerRepository repository) {
        super(repository);
    }


}

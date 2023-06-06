package com.yazdi.products.service.impl;

import com.yazdi.products.domain.Product;
import com.yazdi.products.repository.ProductRepository;
import com.yazdi.products.service.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends BaseServiceImpl<Long, Product, ProductRepository> implements ProductService {
    public ProductServiceImpl(ProductRepository repository) {
        super(repository);
    }

}
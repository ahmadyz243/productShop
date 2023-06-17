package com.yazdi.products.service.impl;

import com.yazdi.products.service.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

@RequiredArgsConstructor
public abstract class BaseServiceImpl<ID, T, R extends JpaRepository<T, ID>> implements BaseService<T> {

    protected final R repository;

    @Override
    public T saveEntity(T entity) {
        return repository.save(entity);
    }

}

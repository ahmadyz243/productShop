package com.yazdi.products.service.impl;

import com.yazdi.products.domain.User;
import com.yazdi.products.repository.UserRepository;
import com.yazdi.products.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl extends BaseServiceImpl<Long, User, UserRepository> implements UserService {
    public UserServiceImpl(UserRepository repository) {
        super(repository);
    }


    @Override
    public Optional<User> findByEmail(String email) {
        return repository.findByEmail(email);
    }
}

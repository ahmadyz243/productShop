package com.yazdi.products.service;

import com.yazdi.products.domain.User;

import java.util.Optional;

public interface UserService extends BaseService<User> {

    public Optional<User> findByEmail(String email);

}

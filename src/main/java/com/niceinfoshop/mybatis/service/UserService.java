package com.niceinfoshop.mybatis.service;

import com.niceinfoshop.mybatis.model.User;

public interface UserService {
    User getUserById(Long id);
    void createUser(User user);
    void createUser2(User user);
    void updateUser(User user);
    void deleteUser(Long id);
}
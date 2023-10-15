package com.niceinfoshop.mybatis.service;

import java.util.List;

import com.niceinfoshop.mybatis.model.User;

public interface UserService {
	List<User> getUserAll();
	List<User> getUserAll2();
    User getUserById(Long id);
    void createUser(User user);
    void createUser2(User user);
    void updateUser(User user);
    void deleteUser(Long id);
}
package com.niceinfoshop.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.niceinfoshop.mybatis.model.User;

@Mapper
public interface UserMapper {
    User getUserById(Long id);
    void insertUser(User user);
    void insertUser2(User user);
    void updateUser(User user);
    void deleteUser(Long id);
}
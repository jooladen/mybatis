package com.niceinfoshop.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niceinfoshop.mybatis.mapper.UserMapper;
import com.niceinfoshop.mybatis.model.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	
//  private final UserMapper userMapper;
//    @Autowired
//    public UserServiceImpl(UserMapper userMapper) {
//        this.userMapper = userMapper;
//    }

    @Override
    public User getUserById(Long id) {
        return userMapper.getUserById(id);
    }

    @Override
    public void createUser(User user) {
        userMapper.insertUser(user);
    }
    
    @Override
    public void createUser2(User user) {
        userMapper.insertUser2(user);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    @Override
    public void deleteUser(Long id) {
        userMapper.deleteUser(id);
    }
}

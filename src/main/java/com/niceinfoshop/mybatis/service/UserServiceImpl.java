package com.niceinfoshop.mybatis.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    public List<User> getUserAll() {
        return userMapper.getUserAll();
    }
	
	@Override
    public List<User> getUserAll2() {
        return userMapper.getUserAll2();
    }
	
    @Override
    public User getUserById(Long id) {
        return userMapper.getUserById(id);
    }

    
//Unchecked Exception(=RuntimeException)은
//RuntimeException발생시 롤백이 발생하나
//noRollbackFor=RuntimeException.class사용하면
//롤백이 안되게한다.    
    @Override
    @Transactional(noRollbackFor=RuntimeException.class)
    public void createUser(User user) {
        userMapper.insertUser(user);
        throw new RuntimeException();
    }
    
//CheckedException은 롤백이 안되지만 되게하는 방법    
//    @Override
//    //@Transactional(rollbackFor=Exception.class)
//    @Transactional
//    public void createUser(User user) {
//        try {
//        	userMapper.insertUser(user);
//			throw new IOException();
//		} catch (IOException e) {
//			throw new RuntimeException("aaaaaaaaaaaaaaaaa");
//		}
//    }
    
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

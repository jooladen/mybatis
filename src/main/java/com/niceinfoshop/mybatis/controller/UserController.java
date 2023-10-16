package com.niceinfoshop.mybatis.controller;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niceinfoshop.mybatis.model.User;
import com.niceinfoshop.mybatis.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
//    private final UserService userService;
//    @Autowired
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }

	@PostMapping
    public void createUser(@RequestBody User user) {
        userService.createUser(user);
    }
    
    @PostMapping("create")
    public User create(@RequestBody User user) {
        userService.createUser(user);
        return user;
    }
    
    @PostMapping("create2")
    public User create2(@RequestBody User user) {
        userService.createUser2(user);
        if(user.getDt() == null) {
        	Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            System.out.println(timestamp); // 생성한 timestamp 출력
            
            SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
            System.out.println(sdf.format(timestamp)); 
            
            user.setDt(sdf.format(timestamp));
        }
        return user;
    }
    
    @GetMapping("/all")
    public List<User> getUserAll() {
        return userService.getUserAll();
    }
    
    @GetMapping("/all2")
    public List<User> getUserAll2() {
        return userService.getUserAll2();
    }
    
    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PutMapping("/{id}")
    public void updateUser(@PathVariable Long id, @RequestBody User user) {
        user.setId(id);
        userService.updateUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}

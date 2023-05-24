package com.example.managernew.controller;


import com.example.managernew.pojo.User;
import com.example.managernew.service.IUserService;
import com.example.managernew.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author admin
 * @since 2023-05-24
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserService  iUserService ;

    @PostMapping("/userInfo")
    public User getUserInfo(User user){

        User userInfo = iUserService.getById(user.getId());
        return userInfo ;
    }

    @PostMapping("/add")
    public Boolean addUserInfo(User user){

        boolean saveResoult = iUserService.save(user);
        return saveResoult ;
    }


}

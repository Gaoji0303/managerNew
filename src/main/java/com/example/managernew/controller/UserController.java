package com.example.managernew.controller;


import com.example.managernew.pojo.User;
import com.example.managernew.service.IUserService;
import com.example.managernew.service.impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserService  iUserService ;

    @PostMapping("/userInfo")
    public User getUserInfo(@RequestBody User user){

        User userInfo = iUserService.getById(user.getId());
        return userInfo ;
    }

    @PostMapping("/add")
    public Boolean addUserInfo(@RequestBody User user){

        boolean saveResoult = iUserService.save(user);
        log.info(user.toString());
        return saveResoult ;
    }


}

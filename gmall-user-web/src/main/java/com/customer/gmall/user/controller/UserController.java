package com.customer.gmall.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.gmall.beans.UmsMember;
import com.customer.gmall.service.UserService;

import com.alibaba.dubbo.config.annotation.Reference;

/**
 * UserController
 *
 * @author Zichao Zhang
 * @date 2020/4/26
 */
@RestController
public class UserController {

    @Reference
    private UserService userService;


    @GetMapping("/memberall")
    public List<UmsMember> memberall() {
        return userService.getAllUser();
    }

}

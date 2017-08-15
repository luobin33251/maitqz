package com.bin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/8/15.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("getUserInfo")
    public String getUserInfo() {
        return "luobin";
    }
}

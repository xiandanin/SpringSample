package com.example.controller;

import com.example.config.GlobalConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/home")
@Controller
public class HomeController {
    @Autowired
    GlobalConfig config;

    @RequestMapping("/profile")
    public String profile() {
        System.out.println("当前环境----->" + config.getProfilesActive()+"---->"+config.getText());
        return "profile";
    }
}

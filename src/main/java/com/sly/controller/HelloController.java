package com.sly.controller;

import com.sly.domain.User;
import com.sly.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
* @RestController
* @RequestMapping
* @GetMapping
* */

@Controller
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    UserMapper userMapper;
    @GetMapping("/index/{id}")
    public String index(@PathVariable("id") Integer id, Model model){
        List<User> users = userMapper.getUserByPojo(null);
        model.addAttribute("users",users);
        return "/views/demo";
    }
}

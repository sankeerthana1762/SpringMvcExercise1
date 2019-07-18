package com.stackroute.mvcdemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    public User user;
    @RequestMapping("/")
    public String show(Model model) {
        model.addAttribute("name",user.giveName());
        return "index";
    }

}
package com.bj.login.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
    @RequestMapping("/login")
    public String login(ModelMap model, HttpServletRequest request){
        return "login/login";
    }
    @RequestMapping("/index")
    public String index(ModelMap model, HttpServletRequest request){
        return "index/index";
    }
}

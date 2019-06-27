package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/prod")
public class ProductController {

    @ResponseBody
    @RequestMapping("/login")
    public ModelAndView login(){
        System.out.println("2121");
        ModelAndView modelAndView = new ModelAndView("../login");
        return modelAndView;
    }
}

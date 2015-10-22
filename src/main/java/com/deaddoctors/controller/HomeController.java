package com.deaddoctors.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public ModelAndView home() {
    	return new ModelAndView("search");
    }
    
    
    @RequestMapping("/index")
    public ModelAndView index() {
    	return new ModelAndView("index");
    }
    
}
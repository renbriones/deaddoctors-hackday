package com.deaddoctors;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String index() {
    	return "Greetings from Spring Boots!";
    }
    
    
    @RequestMapping("/index")
    public ModelAndView home() {
    	return new ModelAndView("index");
    }
    
}
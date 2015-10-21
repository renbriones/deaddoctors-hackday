package com.deaddoctors.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class SearchController {

    @RequestMapping("/search")
    public ModelAndView search() {
    	return new ModelAndView("search");
    }

    @RequestMapping("/search-result")
    public ModelAndView searchResult() {
    	return new ModelAndView("result");
    }

    
    @RequestMapping("/doctor")
    public ModelAndView searchResultDoctor() {
    	return new ModelAndView("doctor");
    }    
}

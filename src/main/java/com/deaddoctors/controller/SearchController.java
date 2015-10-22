package com.deaddoctors.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.deaddoctors.elasticsearch.DeadDoctor;
import com.deaddoctors.service.DeadDoctorEsService;

@Controller
public class SearchController {

	@Autowired
	private DeadDoctorEsService service;
	
    @RequestMapping("/search")
    public ModelAndView search() {
    	return new ModelAndView("search");
    }

    @RequestMapping("/search-result")
    public ModelAndView searchResult(
            @RequestParam(value = "searchTerm", required = false) String searchTerm) {
    	ModelAndView view = new ModelAndView("result");
    	//List<DeadDoctor> result = service.findByName(searchTerm);
    	//view.addObject("doctors", service.findByName(searchTerm));
    	view.addObject("doctors", service.findAll());
    	view.addObject("searchTerm", searchTerm);
    	return view;
    }

    
    @RequestMapping("/doctor")
    public ModelAndView searchResultDoctor() {
    	return new ModelAndView("doctor");
    }    
}

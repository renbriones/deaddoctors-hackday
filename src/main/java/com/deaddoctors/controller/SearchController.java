package com.deaddoctors.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.deaddoctors.elasticsearch.DeadDoctor;
import com.deaddoctors.service.DeadDoctorTempService;

@Controller
public class SearchController {

	@Autowired
	private DeadDoctorTempService service;
	
    @RequestMapping("/search")
    public ModelAndView search() {
    	return new ModelAndView("search");
    }

    @RequestMapping("/search-result")
    public ModelAndView searchResult(
            @RequestParam(value = "searchName", required = false) String searchName) {
    	ModelAndView view = new ModelAndView("result");
    	List<DeadDoctor> result = service.findByName(searchName);
    	view.addObject("doctors", "");
    	
    	return view;
    }

    
    @RequestMapping("/doctor")
    public ModelAndView searchResultDoctor() {
    	return new ModelAndView("doctor");
    }    
}

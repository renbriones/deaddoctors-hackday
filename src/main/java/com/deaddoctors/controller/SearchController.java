package com.deaddoctors.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.deaddoctors.service.DeadDoctorEsService;
import com.deaddoctors.service.DeadDoctorTempService;

@Controller
public class SearchController {

	@Autowired
	private DeadDoctorEsService esService;
	
	@Autowired
	private DeadDoctorTempService service;
	
    @RequestMapping("/search")
    public ModelAndView search() {
    	return new ModelAndView("search");
    }

    @RequestMapping("/search-result")
    public ModelAndView searchResult(
            @RequestParam(value = "searchTerm", required = false) String searchTerm,
            @RequestParam(value = "searchType", required = false) String searchType) {
    	ModelAndView view = new ModelAndView("result");
    	//List<DeadDoctor> result = service.findByName(searchTerm);
    	//view.addObject("doctors", service.findByName(searchTerm));
    	
    	if ("deadName".equals(searchType))
    	{
    		view.addObject("doctors", service.findByName(searchTerm));	
    	}
    	else if ("causeOfDeath".equals(searchType))
    	{
    		view.addObject("doctors", service.findByCauseOfDeath(searchTerm));
    	}
    	else if ("age".equals(searchType))
    	{
    		view.addObject("doctors", service.findByAge(searchTerm));
    	}
    	else if ("role".equals(searchType))
    	{
    		view.addObject("doctors", service.findByRole(searchTerm));
    	}    	
    	
    	view.addObject("searchTerm", searchTerm);
    	view.addObject("searchType", searchType);
    	
    	return view;
    }

    
    @RequestMapping("/doctor")
    public ModelAndView searchResultDoctor() {
    	return new ModelAndView("doctor");
    }    
}

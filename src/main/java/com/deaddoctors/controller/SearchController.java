package com.deaddoctors.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.deaddoctors.service.DeadDoctorEsService;
import com.deaddoctors.service.DeadDoctorTempService;
import com.deaddoctors.service.RandomDoctorService;

@Controller
public class SearchController {

	@Autowired
	private DeadDoctorEsService esService;
	
	@Autowired
	private DeadDoctorTempService service;
	
	@Autowired
	private RandomDoctorService randomService;
	
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
    		view.addObject("searchType", "Name");
    	}
    	else if ("causeOfDeath".equals(searchType))
    	{
    		view.addObject("doctors", service.findByCauseOfDeath(searchTerm));
    		view.addObject("searchType", "Cause of death");
    	}
    	else if ("age".equals(searchType))
    	{
    		view.addObject("doctors", service.findByAge(searchTerm));
    		view.addObject("searchType", "Age at death");
    	}
    	else if ("role".equals(searchType))
    	{
    		view.addObject("doctors", service.findByRole(searchTerm));
    		view.addObject("searchType", "Specialty");
    	}    	
    	else if ("qualifiedPlace".equals(searchType))
    	{
    		view.addObject("doctors", service.findByMedicalSchool(searchTerm));
    		view.addObject("searchType", "Medical school");
    	}    	
    	
    	view.addObject("searchTerm", searchTerm);
    	view.addObject("randomDoctor", randomService.getRandom());
    	
    	return view;
    }

    
    @RequestMapping("/doctor")
    public ModelAndView searchResultDoctor() {
    	return new ModelAndView("doctor");
    }    
}

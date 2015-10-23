package com.deaddoctors.service;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.deaddoctors.elasticsearch.DeadDoctor;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

@Service
public interface DeadDoctorService {

	List<DeadDoctor> findByName(String name) 
			throws JsonParseException, JsonMappingException, IOException;

	List<DeadDoctor> findByCauseOfDeath(String causeOfDeath);
	
	List<DeadDoctor> findByAge(String age);
	
	List<DeadDoctor> findByRole(String role);

	List<DeadDoctor> findByMedicalSchool(String medicalSchool);
	
}

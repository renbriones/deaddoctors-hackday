package com.deaddoctors.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.deaddoctors.elasticsearch.DeadDoctor;
import com.deaddoctors.elasticsearch.DeadDoctorRepository;


public class DeadDoctorEsService implements DeadDoctorService{

	@Autowired
	private DeadDoctorRepository repository;
	
	@Override
	public List<DeadDoctor> findByName(String name) {
		return repository.findByName(name);
	}

}

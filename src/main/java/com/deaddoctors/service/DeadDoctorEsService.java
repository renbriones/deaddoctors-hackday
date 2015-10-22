package com.deaddoctors.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deaddoctors.elasticsearch.DeadDoctor;
import com.deaddoctors.elasticsearch.DeadDoctorRepository;

@Service
public class DeadDoctorEsService {//implements DeadDoctorService {

	@Autowired
	private DeadDoctorRepository repository;
	
	public Iterable<DeadDoctor> findAll()
	{
		return repository.findAll();
	}
	
	//@Override
	public Iterable<DeadDoctor> findByName(String name) {
		return repository.findByDeadName(name);
	}

}

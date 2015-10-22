package com.deaddoctors.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deaddoctors.elasticsearch.DeadDoctor;
import com.deaddoctors.elasticsearch.DeadDoctorRepository;

@Service
public class DeadDoctorEsService implements DeadDoctorService {

	@Autowired
	private DeadDoctorRepository repository;
	
	public Iterable<DeadDoctor> findAll()
	{
		return repository.findAll();
	}
	
	public List<DeadDoctor> findByName(String name) {
		return repository.findByDeadName(name);
	}

	public List<DeadDoctor> findByCauseOfDeath(String causeOfDeath) {
		return repository.findByCauseOfDeath(causeOfDeath);
	}
	
	public List<DeadDoctor> findByAge(String age) {
		return repository.findByAge(age);
	}
	
	public List<DeadDoctor> findByRole(String role) {
		return repository.findByRole(role);
	}

	@Override
	public List<DeadDoctor> findByMedicalSchool(String medicalSchool) {
		return repository.findByMedicalSchool(medicalSchool);
	}

}

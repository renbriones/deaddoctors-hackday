package com.deaddoctors.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.deaddoctors.elasticsearch.DeadDoctor;

@Service
public interface DeadDoctorService {

	List<DeadDoctor> findByName(String name);
}

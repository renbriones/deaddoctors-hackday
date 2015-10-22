package com.deaddoctors.service;

import java.util.List;

import com.deaddoctors.elasticsearch.DeadDoctor;

public interface DeadDoctorService {

	List<DeadDoctor> findByName(String name);
}

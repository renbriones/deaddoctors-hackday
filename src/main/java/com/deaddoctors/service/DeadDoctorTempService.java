package com.deaddoctors.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.deaddoctors.elasticsearch.DeadDoctor;


@Service
public class DeadDoctorTempService implements DeadDoctorService{

	@Override
	public List<DeadDoctor> findByName(String name) {
		List<DeadDoctor> doctors = new ArrayList<DeadDoctor>();
		DeadDoctor doctor = new DeadDoctor();
		doctor.setId("10.1136/bmj.d7515");
		doctor.setElocation("d7515");
		doctor.setName("Robin Turner Donald");
		doctor.setDeathInfo("Former general practitioner (b 1928; q 1951; DRCOG, DPM), died after a myocardial infraction on 17 October 2011");
		
		doctors.add(doctor);
		doctors.add(doctor);
		doctors.add(doctor);
		doctors.add(doctor);
		doctors.add(doctor);
		doctors.add(doctor);
		
		return doctors;
	}

}

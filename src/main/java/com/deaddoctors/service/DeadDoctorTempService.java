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
		doctor.setDeadName("Robin Turner Donald");
		doctor.setNotes("Former general practitioner (b 1928; q 1951; DRCOG, DPM), died after a myocardial infraction on 17 October 2011");
		
		doctors.add(doctor);
		doctors.add(doctor);
		doctors.add(doctor);
		doctors.add(doctor);
		doctors.add(doctor);
		doctors.add(doctor);
		
		return doctors;
	}

	@Override
	public List<DeadDoctor> findByCauseOfDeath(String causeOfDeath) {
		List<DeadDoctor> doctors = new ArrayList<DeadDoctor>();
		DeadDoctor doctor = new DeadDoctor();
		doctor.setId("10.1136/bmj.d7515");
		doctor.setElocation("d7515");
		doctor.setDeadName("Robin Turner Donald");
		doctor.setNotes("Former general practitioner (b 1928; q 1951; DRCOG, DPM), died after a myocardial infraction on 17 October 2011");
		
		doctors.add(doctor);
		doctors.add(doctor);
		doctors.add(doctor);

		
		return doctors;
	}

	@Override
	public List<DeadDoctor> findByAge(String age) {
		List<DeadDoctor> doctors = new ArrayList<DeadDoctor>();
		DeadDoctor doctor = new DeadDoctor();
		doctor.setId("10.1136/bmj.d7515");
		doctor.setElocation("d7515");
		doctor.setDeadName("Robin Turner Donald");
		doctor.setNotes("Former general practitioner (b 1928; q 1951; DRCOG, DPM), died after a myocardial infraction on 17 October 2011");
		
		doctors.add(doctor);
		doctors.add(doctor);
		doctors.add(doctor);
		doctors.add(doctor);
		doctors.add(doctor);
		doctors.add(doctor);
		
		return doctors;
	}

	@Override
	public List<DeadDoctor> findByRole(String role) {
		List<DeadDoctor> doctors = new ArrayList<DeadDoctor>();
		DeadDoctor doctor = new DeadDoctor();
		doctor.setId("10.1136/bmj.d7515");
		doctor.setElocation("d7515");
		doctor.setDeadName("Robin Turner Donald");
		doctor.setNotes("Former general practitioner (b 1928; q 1951; DRCOG, DPM), died after a myocardial infraction on 17 October 2011");
		
		doctors.add(doctor);
		doctors.add(doctor);
		doctors.add(doctor);
		doctors.add(doctor);
		doctors.add(doctor);
		doctors.add(doctor);
		
		return doctors;
	}

	
	@Override
	public List<DeadDoctor> findByMedicalSchool(String medicalSchool) {
		List<DeadDoctor> doctors = new ArrayList<DeadDoctor>();
		DeadDoctor doctor = new DeadDoctor();
		doctor.setId("10.1136/bmj.d7515");
		doctor.setElocation("d7515");
		doctor.setDeadName("Robin Turner Donald");
		doctor.setNotes("Former general practitioner (b 1928; q 1951; DRCOG, DPM), died after a myocardial infraction on 17 October 2011");
		
		doctors.add(doctor);
		doctors.add(doctor);
		doctors.add(doctor);
		doctors.add(doctor);
		doctors.add(doctor);
		doctors.add(doctor);
		
		return doctors;
	}
	
}

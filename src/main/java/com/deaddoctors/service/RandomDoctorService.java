package com.deaddoctors.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.deaddoctors.elasticsearch.DeadDoctor;

@Service
public class RandomDoctorService {

	public DeadDoctor getRandom()
	{
		List<DeadDoctor> doctors = new ArrayList<DeadDoctor>();
		DeadDoctor doctor = new DeadDoctor();
		doctor.setDeadName("Graham Neale");
		doctor.setNotes("Graham Neale Early campaigner for clinical safety (b 1929; q Bristol Medical School 1960; AKC, FRCP), died from motor neurone disease on 5 October 2013.");
		doctor.setVolume("http://www.bmj.com/content/347/bmj.f6712");
		
		
		DeadDoctor doctor1 = new DeadDoctor();
		doctor1.setDeadName("Arthur Maxwell House");
		doctor1.setNotes("Telemedicine and distance education pioneer, (b 1926; q Dalhousie University, Halifax, Canada, 1952), d 17 October 2013.");
		doctor1.setVolume("http://www.bmj.com/content/347/bmj.f7188");
		
		DeadDoctor doctor2 = new DeadDoctor();
		doctor2.setDeadName("Ian Douglas Wilson");
		doctor2.setNotes("Editor of the Lancet, Ian Douglas-Wilson (b 1912; q University of Edinburgh 1936), died from heart failure on 15 October 2013.");
		doctor2.setVolume("http://www.bmj.com/content/347/bmj.f7187");
		
		
		doctors.add(doctor);
		doctors.add(doctor1);
		doctors.add(doctor2);
		
		int index = (int)(Math.random()*doctors.size());
		return doctors.get(index);
	}
	
}

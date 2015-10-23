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
		
		DeadDoctor doctor3 = new DeadDoctor();
		doctor3.setDeadName("Stanley Shaldon");
		doctor3.setNotes("Pioneering nephrologist who wanted to make dialysis the “insulin” of end stage kidney disease, Nephrologist and scientist (b 1931; q Queens’ College, Cambridge, 1952; MD, FRCP), d 21 December 2013.");
		doctor3.setVolume("http://www.bmj.com/content/348/bmj.g1468");
		
		DeadDoctor doctor4 = new DeadDoctor();
		doctor4.setDeadName("Martin Barratt");
		doctor4.setNotes("Paediatric nephrologist who helped develop children’s kidney services in the UK Thomas Martin Barratt, paediatric nephrologist, London (b 1936; q Cambridge University, 1960; FRCP, CBE), died from complications of muscular dystrophy on 17 January 2014.");
		doctor4.setVolume("http://www.bmj.com/content/348/bmj.g1938");
		
		DeadDoctor doctor5 = new DeadDoctor();
		doctor5.setDeadName("Els Borst Eilers");
		doctor5.setNotes("Patient centred doctor and politician whose work led to the Netherlands’ progressive euthanasia legislation,Els Borst-Eilers (b 1932; q Universiteit van Amsterdam 1958), d 10 February 2014.");
		doctor5.setVolume("http://www.bmj.com/content/348/bmj.g1917");
		
		doctors.add(doctor);
		doctors.add(doctor1);
		doctors.add(doctor2);
		doctors.add(doctor3);
		doctors.add(doctor4);
		doctors.add(doctor5);
		
		int index = (int)(Math.random()*doctors.size());
		return doctors.get(index);
	}
	
}

package com.deaddoctors.service;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.deaddoctors.elasticsearch.Container1;
import com.deaddoctors.elasticsearch.Container3;
import com.deaddoctors.elasticsearch.DeadDoctor;
import com.deaddoctors.elasticsearch.DeadDoctorList;
import com.deaddoctors.elasticsearch.DeadDoctorRepository;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class DeadDoctorEsService implements DeadDoctorService {

	@Autowired
	private DeadDoctorRepository repository;
	
	public Iterable<DeadDoctor> findAll()
	{
		return repository.findAll();
	}
	
	public List<DeadDoctor> findByName(String name) 
			throws JsonParseException, JsonMappingException, IOException 
	{
		String endpoint = "http://10.1.110.82:9200/obituaries1/_search";
	    RestTemplate restTemplate = new RestTemplate();
	    HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    String query = "{\"query\" : {\"match\" : {\"deadName\" : \"" + name +"\"} } }";
	    HttpEntity<String> entity = new HttpEntity<String>(query);
	    System.out.println(query);

	    ResponseEntity<DeadDoctorList> result = restTemplate.exchange(endpoint, HttpMethod.GET, entity, DeadDoctorList.class);
	    DeadDoctorList list = result.getBody();
	    System.out.println(list.getDeadDoctors() != null ? list.getDeadDoctors().size(): "null");
	    return list.getDeadDoctors();

	}

	
//	public List<Container3> findByName1(String name) throws JsonParseException, JsonMappingException, IOException {
//		String endpoint = "http://10.1.110.82:9200/obituaries1/_search";
//	    RestTemplate restTemplate = new RestTemplate();
//	    HttpHeaders headers = new HttpHeaders();
//	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//	    String query = "{\"query\" : {\"match\" : {\"deadName\" : \"" + name +"\"} } }";
//	    HttpEntity<String> entity = new HttpEntity<String>(query);
//	    System.out.println(query);
//
//	    ResponseEntity<String> result = restTemplate.exchange(endpoint, HttpMethod.GET, entity, String.class);
//	    System.out.println(result);
//	    String jsonString = result.getBody();
//	    ObjectMapper objectMapper = new ObjectMapper();
//	    objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//	    Container1 deaddoctors = objectMapper.readValue(jsonString, Container1.class);
//	    System.out.println(deaddoctors.getHits().getHits().size());
//	    return deaddoctors.getHits().getHits();
//	    	}
	
	public List<DeadDoctor> findByCauseOfDeath(String causeOfDeath) {
		return repository.findByCauseOfDeath(causeOfDeath);
	}
	
	public List<DeadDoctor> findByAge(String age) {
		return repository.findByAge(age);
	}
	
	public List<DeadDoctor> findByRole(String role) {
		return repository.findByRole(role);
	}

	
	public List<DeadDoctor> findByMedicalSchool(String medicalSchool) {
		return repository.findByMedicalSchool(medicalSchool);
	}

}

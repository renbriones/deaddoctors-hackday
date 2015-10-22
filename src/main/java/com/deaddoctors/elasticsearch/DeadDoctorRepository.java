package com.deaddoctors.elasticsearch;

import org.springframework.data.elasticsearch.repository.support.SimpleElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public class DeadDoctorRepository extends SimpleElasticsearchRepository {

	public Iterable<DeadDoctor> findByDeadName(String deadName)
	{
		
		return super.findAll();
	}



}

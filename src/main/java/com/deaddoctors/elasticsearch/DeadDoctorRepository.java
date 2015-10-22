package com.deaddoctors.elasticsearch;

import java.util.List;

import org.springframework.data.elasticsearch.repository.support.SimpleElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.deaddoctors.utils.ConverterUtil;

@Repository
public class DeadDoctorRepository extends SimpleElasticsearchRepository<DeadDoctor> {

	public List<DeadDoctor> findByDeadName(String deadName)
	{
		
		return ConverterUtil.toList(super.findAll());
	}


	public List<DeadDoctor> findByCauseOfDeath(String causeOfDeath)
	{
		
		return  ConverterUtil.toList(super.findAll());
	}

	public List<DeadDoctor> findByAge(String age)
	{
		
		return  ConverterUtil.toList(super.findAll());
	}
	
	public List<DeadDoctor> findByRole(String role)
	{
		
		return  ConverterUtil.toList(super.findAll());
	}
	
}

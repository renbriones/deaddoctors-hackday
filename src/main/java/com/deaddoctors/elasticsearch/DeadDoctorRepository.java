package com.deaddoctors.elasticsearch;

import java.util.List;

public interface DeadDoctorRepository {//extends ElasticsearchRepository<DeadDoctor, String> {

	public List<DeadDoctor> findByName(String name);

}

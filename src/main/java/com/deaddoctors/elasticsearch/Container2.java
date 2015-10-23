package com.deaddoctors.elasticsearch;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Container2 {

	private List<Container3> hits;

	public List<Container3> getHits() {
		return hits;
	}

	public void setHits(List<Container3> hits) {
		this.hits = hits;
	}
	
	
}

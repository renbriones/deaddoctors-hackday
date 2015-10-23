package com.deaddoctors.elasticsearch;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Container1 {
	
	private Container2 hits;

	public Container2 getHits() {
		return hits;
	}

	public void setHits(Container2 hits) {
		this.hits = hits;
	}

}

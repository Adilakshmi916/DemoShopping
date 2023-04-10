package com.shopping.user.serviceimpl;

import org.springframework.http.ResponseEntity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.shopping.user.service.PostOfficeResponse;

public class PostDivisionDetails {

	@JsonProperty("Name")
	private String name;
	
	@JsonProperty("Division")
	private String division;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	
	
	}

	
	

	
	


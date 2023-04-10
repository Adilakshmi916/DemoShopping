package com.shopping.user.service;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;


public class PostOfficeResponse {
	@JsonProperty("Message")
	private String message;
	
	@JsonProperty("Status")
	private String status;
	
	@JsonProperty("PostOffice")
	private List<PostOfficeDetails> postOffice ;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<PostOfficeDetails> getPostOffice() {
		return postOffice;
	}

	public void setPostOffice(List<PostOfficeDetails> postOffice) {
		this.postOffice = postOffice;
	}

	
	
	}
	
	
	



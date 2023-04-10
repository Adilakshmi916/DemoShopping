package com.shopping.user.postservice;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.shopping.user.service.PostOfficeResponse;
import com.shopping.user.serviceimpl.PostDivisionDetails;

public interface PostService {
	public ResponseEntity<PostOfficeResponse[]> fetchPostOfficeDetailsByCity(String cityname);

	List<PostDivisionDetails> fetchdivisionDetailsByCity(String cityValue);
}



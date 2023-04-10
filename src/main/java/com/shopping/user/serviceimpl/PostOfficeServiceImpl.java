package com.shopping.user.serviceimpl;



import java.util.ArrayList;
import java.util.List;

import javax.crypto.spec.PSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.shopping.user.postservice.PostService;
import com.shopping.user.service.PostOfficeDetails;
import com.shopping.user.service.PostOfficeResponse;
@Service("PostOfficeServiceImpl")
public class PostOfficeServiceImpl implements PostService {
	
	@Autowired
	RestTemplate restTemplate;

	public ResponseEntity<PostOfficeResponse[]> fetchPostOfficeDetailsByCity(String cityValue) {
		String url="https://api.postalpincode.in/postoffice/"+cityValue;
		
		System.out.println("Url is:"+url);
		
		ResponseEntity<PostOfficeResponse[]>postalResponseEntity=
				restTemplate.getForEntity(url, PostOfficeResponse[].class);
		
		System.out.println("Response Status Code is; "+postalResponseEntity.getBody());
		return postalResponseEntity;
	}
	
	public List<PostDivisionDetails>fetchDivisionDetailsByCity(String cityValue) {
		String url="https://api.postalpincode.in/postoffice/"+cityValue;
		
		System.out.println("Url is:"+url);
		
		ResponseEntity<PostOfficeResponse[]>postalResponseEntity=
				restTemplate.getForEntity(url, PostOfficeResponse[].class);
		
		System.out.println("Response is; "+postalResponseEntity.getBody());
		PostOfficeResponse[] postofficeResponse = postalResponseEntity.getBody();
		System.out.println(postofficeResponse[0].getPostOffice());
		
		List<PostDivisionDetails> postDivisionDetails = new ArrayList<PostDivisionDetails>();
		
		for(int i=0 ; i< postofficeResponse[0].getPostOffice().size();i++) {
			PostDivisionDetails postDivisonSingle = new PostDivisionDetails();
			postDivisonSingle.setDivision(postofficeResponse[0].getPostOffice().get(i).getDivision());
			postDivisonSingle.setName(postofficeResponse[0].getPostOffice().get(i).getName());
			postDivisionDetails.add(postDivisonSingle);
		}
        return postDivisionDetails;
		}
}

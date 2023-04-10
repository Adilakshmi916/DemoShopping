package com.shopping.user.serviceimpl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.shopping.user.postservice.PostService;

import com.shopping.user.service.PostOfficeResponse;
@Service("PostOfficeServiceImpl")
public class PostOfficeServiceImpl implements PostService {
	
	@Autowired
	RestTemplate restTemplate;

	@Override
	public ResponseEntity<PostOfficeResponse[]> fetchPostOfficeDetailsByCity(String cityValue) {
		String url="https://api.postalpincode.in/postoffice/"+cityValue;
		
		System.out.println("Url is:"+url);
		
		ResponseEntity<PostOfficeResponse[]>postalResponseEntity=
				restTemplate.getForEntity(url, PostOfficeResponse[].class);
		
		System.out.println("Response Status Code is; "+postalResponseEntity.getBody());
//		PostOfficeResponse responseBeanArray=postalResponseEntity.getBody();
//		
//		for(PostOfficeResponse responseBean :responseBeanArray) {
//			List<PostOfficeDetails>posyOfficeListBean=responseBean.getPostOffice();
//			for(PostOfficeDetails prob :posyOfficeListBean) {
//				System.out.println(prob.getName()+"***"+prob.getCountry()+"***"+prob.getPincode());
//			}
//		}
		return postalResponseEntity;
			}
	
	@Override
	public List<PostDivisionDetails>fetchdivisionDetailsByCity(String cityValue) {
		String url="https://api.postalpincode.in/postoffice/"+cityValue;
		
		System.out.println("Url is:"+url);
		
		ResponseEntity<PostOfficeResponse[]>postalResponseEntity=
				restTemplate.getForEntity(url, PostOfficeResponse[].class);
		
		System.out.println("Response Status Code is; "+postalResponseEntity.getBody());
//		PostOfficeResponse responseBeanArray=postalResponseEntity.getBody();
//		
//		for(PostOfficeResponse responseBean :responseBeanArray) {
//			List<PostOfficeDetails>posyOfficeListBean=responseBean.getPostOffice();
//			for(PostOfficeDetails prob :posyOfficeListBean) {
//				System.out.println(prob.getName()+"***"+prob.getCountry()+"***"+prob.getPincode());
//			}
//		}
		
		for (int i=0; i<2;i++) {
			System.out.println("Hii Laxmi" + i);
		}
        return postalResponseEntity;
		

	
		}
}

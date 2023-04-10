package com.shopping.user.controller;

import java.awt.PageAttributes.MediaType;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.user.postservice.PostService;
import com.shopping.user.service.PostOfficeResponse;
import com.shopping.user.serviceimpl.PostDivisionDetails;
import com.shopping.user.serviceimpl.PostOfficeServiceImpl;



//@RestController
//@RequestMapping("/postal")
//public class PostOfficeController {
////	
//	 @Autowired
//     PostService PostOfficeServiceImpl;
//     
//     @RequestMapping(value="/byCity",method=RequestMethod.GET,
//    		      produces=org.apache.tomcat.util.http.parser.MediaType
//     public PostOfficeResponse getPostalbyCity(@RequestParam String city) {
//    	 PostOfficeResponse postResponse;
//    	 postResponse=PostOfficeServiceImpl.fetchPostOfficeDetailsByCity(city);
//    	 return postResponse;
//    	 
//     }


@RestController
@RequestMapping("/postal")

public class PostOfficeController {

	Logger logger = LoggerFactory.getLogger(PostOfficeController.class);

	@Autowired
	PostOfficeServiceImpl postOfficeServiceImpl;
   
   /*
    * @RequestParam String cityName
    * Will take cityName as input and returns city predictions along with future temperatures.
    */
   @GetMapping(value = "/byCity")
   
   public ResponseEntity<PostOfficeResponse[]> getPostalCity(@RequestParam("cityname") String cityName) {
	   logger.info("The City Name in getPostalCity is {}", cityName);
       //return ResponseEntity.status(HttpStatus.OK).body(postOfficeServiceImpl.fetchPostOfficeDetailsByCity(cityName));
   return postOfficeServiceImpl.fetchPostOfficeDetailsByCity(cityName);
   
   }
  
  /*
   * @RequestParam String cityName
   * Will take cityName as input and returns city predictions along with future temperatures.
   */
  @GetMapping(value = "/getCity")
  
  public List<PostDivisionDetails> getPostal(@RequestParam("cityname") String cityName) {
	   logger.info("The City Name in getPostalCity is {}", cityName);
      //return ResponseEntity.status(HttpStatus.OK).body(postOfficeServiceImpl.fetchPostOfficeDetailsByCity(cityName));
  return postOfficeServiceImpl.fetchDivisionDetailsByCity(cityName);

}
}

  
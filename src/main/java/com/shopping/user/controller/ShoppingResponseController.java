package com.shopping.user.controller;

import java.awt.PageAttributes.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.user.postservice.PostService;
import com.shopping.user.service.PostOfficeResponse;
import com.shopping.user.service.Shopping;





@RestController
public class ShoppingResponseController {
     @GetMapping("/shopping")
     public ResponseEntity<Shopping>getShopping(){
    	 Shopping s=new Shopping("Shopping 1","India");
    	 HttpHeaders headers=new HttpHeaders();
    	 headers.add("token","token value");
    	 return ResponseEntity.status(HttpStatus.NOT_FOUND).headers(headers).body(s);
     }
     
     
    
     
     }


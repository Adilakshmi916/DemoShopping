package com.shopping.user.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.user.service.Item;
import com.shopping.user.service.PostMappingService;
import com.shopping.user.service.ShoppingService;







@RestController
public class ShoppingController {
	
	@Autowired
	ShoppingService shoppingService;
	private Item items;
	@GetMapping("/get/{name}")
	public String getValue1(@PathVariable String name) {
		return shoppingService.getName(name);
	}



@GetMapping("/getname")
public String getValue(@RequestParam(name="firstName") String firstName) {
	return shoppingService.getName(firstName);
	
}

@GetMapping("/difference")
public int getdiff1(@RequestParam int num1,
                  @RequestParam int num2){
	return shoppingService.getDiff(num1, num2);
}
@GetMapping("/devide")
public int getdevide(@RequestParam int num1,
                  @RequestParam int num2){
	return shoppingService.getDevide(num1, num2);
}
@GetMapping("/getAllItems")
public List<Item>getAllItems(){
	return PostMappingService.getAllItems();
}
@PostMapping("/addItems")
public String addItems(@RequestBody Item item) {
	
	return PostMappingService.addItems(item);
}
@GetMapping(value = "/getValue")
public ResponseEntity<String> getName1(@RequestParam("firstName") String firstName) {
	   return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ShoppingService.getName(firstName));

}
@GetMapping(value = "/getdiff")
public ResponseEntity<Integer> getnum(@RequestParam int num3,
                                   @RequestParam int num4) {
	   return ResponseEntity.status(HttpStatus.ACCEPTED).body(ShoppingService.getDiff(num3,num4));

}
@GetMapping(value = "/getdiv")
public ResponseEntity<Integer> getdev(@RequestParam int num1,
                                   @RequestParam int num2) {
	   return ResponseEntity.status(HttpStatus.ACCEPTED).body(ShoppingService.getDevide(num1,num2));
}
}

package com.shopping.user.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PostMappingService {
	private static List<Item>loadItemsFromDb(){
		List<Item>itmObject=new ArrayList<Item>();
		itmObject.add(new Item(1,"Item1 Desc",100));
		itmObject.add(new Item(2,"Item2 Desc",200));
		itmObject.add(new Item(3,"Item3 Desc",300));
		return itmObject;
		
	}
	private static  List<Item> items=loadItemsFromDb();
	 public static List<Item> getAllItems(){
		return items;
	}
	public static  String addItems(Item item) {
		items.add(item);
		return "Item added successfully";
	}

}

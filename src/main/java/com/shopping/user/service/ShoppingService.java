package com.shopping.user.service;

import org.springframework.stereotype.Service;

@Service
public class ShoppingService{

	public static String getName(String firstName) {
		return  "Hi " + firstName + " how is lifeee";
		
	}
	public static int getDiff(int num3,int num4) {
		int difference = num3-num4;
		return difference ;
	}
	public static int getDevide(int num1, int num2) {
		
		try {
			return num1/num2;
					
		}catch(ArithmeticException e) {
			System.out.println(e);
			return -1;
		}
			catch(Exception e) {
				return -1;
			}
			
		}
		
		
	}


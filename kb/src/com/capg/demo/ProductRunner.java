package com.capg.demo;

import java.util.ArrayList;

public class ProductRunner {

	public static void main(String[] args) {
		
		ArrayList<Product> list =new ArrayList<>();
		
		
		list.add(new Product(1, "redmi", 10000));
		list.add(new Product(2, "ios", 50000));
		list.add(new Product(3, "samsung", 20000));
		System.out.println(list.size());
		System.out.println(list);
		
		System.out.println("Highest price is: "+FindTopProduct(list));
	}

	private static String FindTopProduct(ArrayList<Product> list) {
		
		double highest=list.get(0).getPrice();
		
		for(int i=0;i<list.size();i++) {
			if(highest<list.get(i).getPrice()) {
				 highest=list.get(i).getPrice();
			}
		}	
		String max=String.valueOf(highest);
		
		return max;
		
		
	}
}

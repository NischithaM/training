package com.cruds.collections;

import java.util.HashSet;
import java.util.Set;

public class ProductDemo {

	public static void main(String[] args) {
		Set<Product> products=new HashSet<>();
		
		products.add(new Product(101," tv ",20000));
		products.add(new Product(102," mobile ",12000));
		products.add(new Product(103," cycle ",15000));
		products.add(new Product(103," cycle atlas ",16000));
		
		
		for(Product p:products)
		{
			System.out.println(p);
		}
		
		
	}

}

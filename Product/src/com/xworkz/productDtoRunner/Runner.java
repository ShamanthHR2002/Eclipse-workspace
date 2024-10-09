package com.xworkz.productDtoRunner;

import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;

import com.xworkz.productDTO.ProductDTO;

public class Runner {
	public static void main(String[] args) {
		ProductDTO product1 = new ProductDTO(1, "TV", "tvsoft", 20000.00);
		ProductDTO product2 = new ProductDTO(2, "Mobile", "mobilesoft", 30000.00);
		ProductDTO product3 = new ProductDTO(3, "Laptop", "laptopsoft", 25000.00);
		ProductDTO product4 = new ProductDTO(4, "Book", "classm", 200.00);
		ProductDTO product5 = new ProductDTO(5, "Pen", "ball", 30.00);
		ProductDTO product6 = new ProductDTO(6, "Watch", "fastrack", 2500.00);

		Collection<ProductDTO> collection = new LinkedList<>();
		collection.add(product1);
		collection.add(product2);
		collection.add(product3);
		collection.add(product4);
		collection.add(product5);
		collection.add(product6);

		collection.forEach(product -> System.out.println(product));

		System.out.println("*******************");

		collection.stream().sorted().forEach(product -> System.out.println(product));

	}
}

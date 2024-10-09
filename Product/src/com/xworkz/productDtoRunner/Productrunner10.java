package com.xworkz.productDtoRunner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.productDTO.Productdto10;

public class Productrunner10 {

    public static void main(String[] args) {
        Collection<Productdto10> info = new ArrayList<>();
        Productdto10 dto1 = new Productdto10(1, "Laptop", 55000, "Dell");
        Productdto10 dto2 = new Productdto10(2, "Smartphone", 30000, "Samsung");
        Productdto10 dto3 = new Productdto10(3, "Headphones", 2000, "Sony");
        Productdto10 dto4 = new Productdto10(4, "Monitor", 15000, "LG");
        Productdto10 dto5 = new Productdto10(5, "Keyboard", 1500, "Logitech");
        Productdto10 dto6 = new Productdto10(6, "Mouse", 800, "HP");
        Productdto10 dto7 = new Productdto10(7, "Smartwatch", 10000, "Apple");
        Productdto10 dto8 = new Productdto10(8, "Tablet", 25000, "Lenovo");
        Productdto10 dto9 = new Productdto10(9, "Camera", 45000, "Canon");
        Productdto10 dto10 = new Productdto10(10, "Speaker", 5000, "JBL");
        Productdto10 dto11 = new Productdto10(11, "Printer", 12000, "Epson");

        info.add(dto1);
        info.add(dto2);
        info.add(dto3);
        info.add(dto4);
        info.add(dto5);
        info.add(dto6);
        info.add(dto7);
        info.add(dto8);
        info.add(dto9);
        info.add(dto10);
        info.add(dto11);

        info.forEach((product) -> System.out.println(product));

        System.out.println("*******************************");

        info.stream()
            .sorted()
            .forEach((ref) -> System.out.println(ref));

        System.out.println("****************************");

        info.stream()
            .filter(product -> product.getCost() > 5000)
            .collect(Collectors.toList())
            .forEach((ref) -> System.out.println(ref));

        System.out.println("****************************");

        info.stream()
            .filter(product -> product.getCost() > 5000 && product.getCost() < 30000)
            .collect(Collectors.toList())
            .forEach((ref) -> System.out.println(ref));

        System.out.println("*****************************");

        info.stream()
            .sorted((ref1, ref2) -> ref2.compareTo(ref1))
            .collect(Collectors.toList())
            .forEach((ref) -> System.out.println(ref));

        System.out.println("****************************");

        info.stream()
            .filter(product -> product.getVendor().startsWith("S"))
            .sorted()
            .collect(Collectors.toList())
            .forEach((ref) -> System.out.println(ref));

        System.out.println("********************************");

        info.stream()
            .map(product -> product.getName())
            .collect(Collectors.toList())
            .forEach((ref) -> System.out.println(ref));

        System.out.println("******************************");

        info.stream()
            .map(product -> product.getId())
            .collect(Collectors.toList())
            .forEach((ref) -> System.out.println(ref));

        System.out.println("*********************************");

        info.stream()
            .map(product -> product.getName().toUpperCase())
            .collect(Collectors.toList())
            .forEach((ref) -> System.out.println(ref));
    }
}

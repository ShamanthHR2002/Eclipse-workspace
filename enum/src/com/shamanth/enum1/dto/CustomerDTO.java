package com.shamanth.enum1.dto;

import com.shamanth.enum1.constants.ProductType;

public class CustomerDTO {
    private String name;
    private String email;
    private ProductType productType;

    
    public CustomerDTO(String name, String email, ProductType productType) {
        this.name = name;
        this.email = email;
        this.productType = productType;
    }

  
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public ProductType getProductType() {
        return productType;
    }

    
    public void printDetails() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer Email: " + email);
        System.out.println("Product Type: " + productType);
    }
}

package com.java8.practice.demo.examples_4262020;

import java.util.ArrayList;
import java.util.List;

public class JavaStreamExample55 {  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        // count number of products based on the filter  
        long count = productsList.stream()  
                    .filter(product->product.price<30000)  
                    .count();  
        System.out.println(count);  
    }  
}  
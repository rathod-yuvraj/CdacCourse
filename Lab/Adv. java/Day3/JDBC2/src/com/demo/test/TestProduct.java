package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

public class TestProduct {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductService pservice = new ProductServiceImpl();

        int choice = 0;
        do {
            System.out.println("\n=== Product Menu ===");
            System.out.println("1. Add New Product");
            System.out.println("2. Delete Product ");
            System.out.println("3.Modify Product");
            System.out.println("4. Display All Products");
            System.out.println("5. Delete by ID");
            System.out.println("6. Sort by ID");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    boolean status = pservice.addNewProduct();
                    if (status) {
                        System.out.println("New Product added successfully.");
                    } else {
                        System.out.println(" Product not added.");
                    }
                }
                case 2 -> {
                	System.out.println("enter the id");
                int id =sc.nextInt();
                boolean status = pservice.deletebyId(id);
                if(status) {
                	System.out.println("successfully delete");
                }else {
                	System.out.println("Not Deleted");
                }
//                   
                }
                case 3 -> {
                System.out.println("Enter the id");
                int id =sc.nextInt();
                System.out.println("Enter the quanty ");
                int qty =sc.nextInt();
                System.out.println("enter the price ");
                 double price =sc.nextDouble();
                 boolean status =pservice.modifybyId(id,qty,price);
                 if(status) {
                	 System.out.println("modified successfully");
                 }else {
                	 System.out.println("not modified");
                 }
                
                
//                  
                }
                case 4 -> {
                	List<Product> plist=pservice.getAllDisplay();
                	plist.forEach(System.out::print);
//                  
                }
                case 5 -> {
                    System.out.print("Enter product ID to delete: ");
//                    int id = sc.nextInt();
////                    boolean deleted = pservice.deleteById(id);
//                    if (deleted) {
//                        System.out.println(" Product deleted successfully.");
//                    } else {
//                        System.out.println(" Product not found.");
//                    }
                }
                case 6 -> {
//                   
                }
                case 7 -> {
                    System.out.println(" Thank you for visiting!");
                }
                default -> {
                    System.out.println("Invalid choice. Please try again.");
                }
            }
        } while (choice != 7);

        sc.close();
    }
}

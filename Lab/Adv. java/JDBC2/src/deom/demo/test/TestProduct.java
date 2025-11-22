package deom.demo.test;

import java.util.Scanner;

import com.demo.services.ProductService;
import com.demo.services.ProductServiceImpl;

public class TestProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int choice = 0;
		
		ProductService  pservice = new ProductServiceImpl();
		
		do { 
			System.out.println("1. Add New Product\n2 2.Delete the the product \n 3. modify the Product "   );
		    System.out.println("4. Find by Id\n5. display all\n6. Display in sorted order \n7. exit  "); 
			System.out.println("choice:");
			choice=sc.nextInt();
			switch(choice) 
			{
			case 1 ->{
				boolean status = pservice.addNewProuct();
				if(status) {
					System.out.println("Product added Successfully");
					
				}else {
					System.out.println("Not added ");
				}
				
			}
			case 7 ->{
				System.out.println("Thank you my friend for visiting my friends ");
				sc.close();
				
			}
			
			}
		
		}
		while(choice!=7);

	}

}

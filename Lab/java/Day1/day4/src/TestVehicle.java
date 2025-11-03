import java.util.*;

public class TestVehicle {

	public static void main(String[] args) {
		System.out.println("This ");
		Scanner dc=new Scanner(System.in);
		int choice=0;
		
		do {
			
			System.out.println("1.acceptData\n2.Display\n3.Change the id\n4\n5.change name\n6.Change Type of Vehicle");
			System.out.println("7.Change the Data of Purchase\n8.exit");
			System.out.println("Enter the Choice");
			choice=dc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("*************************");
				boolean valid= VehicleService.addVehicle();
				break;
			case 2:
				
				break;
			case 3:
	
				break;
			case 4:
	
				break;
	
			case 5:
	
				break;
			case 6:
	
				break;
			case 7:
	
				break;
			case 8:
				
				break;
			case 9:
				
				break;
			case 10:
				System.out.println("thank you for visiting");
				break;
			
				
				
			}
			
			
		}while(choice!=10);
		
		

	}

}

package test;
import service.EmployeeService;

import java.util.Date;
import java.util.Scanner;


import bean.Employee;
import bean.SalariedEmp;
public class TestEmployeeMgntSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("1. add new Employee\n 2. Display all");
			System.out.println("3. Display by id\n 4. change sal or charges");
			System.out.println("5. Display Salaried Employee\n 6. Display Contract Employee");
			System.out.println("7. Search By Name\n 8. calculate net salary\n9. exit\n Choice :");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("1. salaried\n2.Contract\n3.Vendor\n choice: ");
				int ch=sc.nextInt();
				boolean status=EmployeeService.addNewEmployee(ch);
				if(status) {
					System.out.println("added successfully");
					
				}else {
					System.out.println("Error :not added");
				}
				break;
			case 2:
				EmployeeService.displayAll();
				
				break;
			case 3:
				System.out.println("enter Id");
				String id=sc.next();
				Employee e=EmployeeService.searchById(id);
				if(e!=null) {
					System.out.println(e);
				}else {
					System.out.println("not found");
				}
				break;
			case 4:
				System.out.println("enter Id");
				id=sc.next();
				System.out.println("enetr new sal/charges");
				double charges=sc.nextDouble();
				status=EmployeeService.modifyById(id,charges);
				if(status) {
					System.out.println("Updated successfully");
				}else {
					System.out.println("not found");
				}
				break;
			case 5:
				EmployeeService.displayOnlySalariedEmp();
				break;
			case 6:
				EmployeeService.displayOnlyContractEmp();
				break;
			case 7:
				System.out.println("Enter the Name:");
				String name=sc.next();
				Employee e1=EmployeeService.searchByName(name);
				if(e1!=null)
				{
					System.out.println("Name are found : " +e1);
				}else {
					System.out.println("not found!");
				}
				
			
				break;
						
			case 8:
				System.out.println("Calculate Salary!...");
//				Employee e3=null;
				Employee e3=new SalariedEmp("Rajan",new Date(2000,04,23),"HR","Designer",88888);
				System.out.println("Salary of Employee: "+e3.calculateSal());
				System.out.println("Enter the choice for salary: ");
				int n=sc.nextInt();
				System.out.println("Salary of Employee: "+e3.calculateSal());
				break;
			case 9:
				System.out.println("Thank you for visiting......");
				sc.close();
				break;	
			
			default:
				System.out.println("wrong choice");
				break;
			}
		}while(choice!=10);
	}

}

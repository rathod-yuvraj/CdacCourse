package com.yuvraj.test;

import java.util.List;
import java.util.Scanner;

import com.yuvraj.beans.Employee;
import com.yuvraj.service.EmployeeService;
import com.yuvraj.service.EmployeeServiceImpl;



public class EmployeeTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 EmployeeService eservice=new EmployeeServiceImpl();
		 
		 
		 int choice=0;
		do {
			System.out.println("1.Add Employee to list\n2.Remove Employee list\n3.Show all Employee");
			System.out.println("4.Show all Employee in sorted order\n5.Find Employee with empName\n6.Save all Employees into file");
			System.out.println("7.Quit");
			System.out.println("Enter Choice: ");
			choice=sc.nextInt();
			 switch(choice) {
			 case 1->{
				 boolean status=eservice.AddNewEmployee();
				 if(status) {
					 System.out.println("New Employee Add successfully!..");
				 }else {
					 System.out.println("Not Added ......");
				 }
				 System.out.println("Add Employee to list");
			 }
			 case 2->{
				 System.out.println("Enter Id");
				 int id=sc.nextInt();
				 boolean status=eservice.RemoveById(id);
				 if(status) {
					 System.out.println("Remove By Id Employee successfully!..");
				 }else {
					 System.out.println(" are Employee Not Found ......");
				 }
			 }
			 case 3->{
				 System.out.println("Show all Employee");
				 List <Employee> elist=eservice.DisplayAll();
				 elist.forEach(System.out::println);
			 }
			 case 4->{
				 System.out.println("Show all Employee in sorted order");
				  System.out.println("\n Employees Sorted by ID:");
                    employees.stream()
                             .sorted(Comparator.comparingInt(Employee::getEmpID))
                             .forEach(System.out::println);
                   
			 }
			 case 5->{
				 System.out.println("Find Employee with empName");
				  System.out.print("Enter Employee Name to search: ");
                    String searchName = sc.nextLine();
                    boolean found = false;
                    for (Employee emp : employees) {
                        if (emp.getEmpName().equalsIgnoreCase(searchName)) {
                            System.out.println("Found: " + emp);
                            found = true;
                        }
                    }
                    if (!found)
                        System.out.println("❌ No employee found with that name!");
                   
			 }
			 case 6->{
				 System.out.println("Save all Employees into file");
				  try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employees.dat"))) {
                        oos.writeObject(employees);
                        System.out.println("Employee list saved to employees.dat");
                    } catch (IOException ex) {
                        System.out.println("Error saving file: " + ex.getMessage());
                    }
			 }
			 case 7->{
				 System.out.println("Think you For Visiting.......");
				 sc.close();
			 }
			 default->{
				System.out.println("Invalid choice! Try again.");

			 }
                    
            }
			 
			 }
		}while(choice!=7);

	}

}

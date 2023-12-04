package com.demo.test;

import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.beans.EmployeeLinkedList;

public class TestEmployeeSingleLinkedList {

	public static void main(String[] args) {
		EmployeeLinkedList employeeList = new EmployeeLinkedList();
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("------------------------");
			System.out.println("1.Add new Employee"
					+ "\n2.Delete Employee by Id \n3.Search Employee by Id"
					+ "\n4.Display All Employees \n5.Exit");
			System.out.println("------------------------");
			int choice=sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Enter Employee Id : ");
				int empId=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Employee Name : ");
				String empName=sc.nextLine();
				System.out.println("Enter Employee Salary : ");
				double salary=sc.nextDouble();
				Employee newEmployee = new Employee(empId,empName,salary);
				employeeList.addEmployee(newEmployee);
				break;
				
			case 2:
				System.out.println("Enter Employee ID to delete : ");
				int deleteId=sc.nextInt();
				employeeList.deleteEmployeeById(deleteId);
				break;
			case 3:
				System.out.println("Enter Employee ID to Search : ");
				int searchId=sc.nextInt();
				employeeList.searchEmployeeById(searchId);
				break;
			case 4:
				employeeList.displayAllEmployees();
				break;
			case 5:
				System.out.println("Thanks for visiting...");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice");
			}
			
			
		}
		
		
		
	}
}

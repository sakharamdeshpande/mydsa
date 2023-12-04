package com.demo.test;

import java.util.Scanner;

import com.demo.beans.Customer;
import com.demo.beans.CustomerQueue;

public class TestCarWaitingList {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		CustomerQueue waitingList = new CustomerQueue();
		
		while(true)
		{
			System.out.println("------------------------");
			System.out.println("1. Add customer to waiting list");
            System.out.println("2. Remove customer from waiting list");
            System.out.println("3. Display waiting list");
            System.out.println("4. Exit");
			System.out.println("------------------------");

            int choice = sc.nextInt();
            
            switch (choice) {
			case 1:		
				System.out.println("Enter customer Id : ");
				int customerId=sc.nextInt();
				sc.nextLine();
				System.out.print("Enter customer's name: ");				
				String customerName = sc.next();
				System.out.println("Enter customer's email : ");
				String customerEmail =sc.next();
				System.out.println("Enter customer's phone number : ");
				String customerNumber=sc.next();
				Customer newCustomer = new Customer(customerId,customerName,customerEmail,customerNumber); 
				waitingList.enqueue(newCustomer);
				break;
			case 2:
				waitingList.dequeue();
				break;
			case 3:
				waitingList.displayWaitingList();
				break;
			case 4:
				System.out.println("Thanks for visiting");
				System.exit(0);
				break;
			default:
				break;
			}
            
		}
	}

}

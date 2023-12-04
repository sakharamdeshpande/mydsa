package com.demo.beans;

public class EmployeeLinkedList {

	private Node head;
	class Node
	{
		Employee data;
		Node next;
		
		public Node(Employee data)
		{
			this.data=data;
			next=null;
		}
	}
	
	public EmployeeLinkedList()
	{
		head=null;
	}

	public void addEmployee(Employee employee) {

		Node newNode = new Node(employee);
		
		//if the linked list is empty
		if(head==null)
		{
			head=newNode;
		}
		//else adding emp info into the existing linked list
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newNode;
		}
		System.out.println("Employee added successfully");
	}

	public void deleteEmployeeById(int deleteId) {

		//if list is empty
		if(head==null)
		{
			System.out.println("List is empty. Cannot delete employee");
			return;//ends the execution and returns control to the calling function
		}
		
		//if empID found at first node itself
		if(head.data.getEmpId()==deleteId)
		{
			head=head.next;
			System.out.println("Employee with ID : "+deleteId+" deleted successfully");
			return;
		}
		//else 
		
		Node temp=head;
		Node prev=null;
		while(temp!=null && temp.data.getEmpId()!=deleteId)
		{
			prev=temp;
			temp=temp.next;
		}
		//reached till the end and still not found 
		if(temp==null)
		{
			System.out.println("Employee with ID : "+deleteId+" not found");
		}
		//FOUND and deleting the respective node	
		else
		{
			prev.next=temp.next;
			temp.next=null;
			temp=null;
			
			System.out.println("Employee with ID : "+deleteId+" deleted successfully");
			
		}
		
	}

	public void searchEmployeeById(int searchId) {

		Node temp=head;
		while(temp!=null && temp.data.getEmpId()!=searchId)
		{
			temp=temp.next;
		}
		//found
		if(temp!=null)
		{
			System.out.println("Employee with ID : "+searchId+" found : \n"+temp.data);

		}
		//not found
		else
		{
			System.out.println("Employee with ID : "+searchId+" not found");
		}
	}

	public void displayAllEmployees() {

		if(head==null)
		{
			System.out.println("No Employees to display");
			return;
		}
		
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
		
	}
	
	
	
	
	
	
	
	
}

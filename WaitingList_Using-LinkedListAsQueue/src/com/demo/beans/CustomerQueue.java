package com.demo.beans;

public class CustomerQueue {

	private Node front,rear;	
	class Node
	{
		Customer data;
		Node next;
		public Node(Customer data)
		{
			this.data=data;
			this.next=null;
		}
	}
	public CustomerQueue() {
		super();
		this.front=this.rear=null;
	}
	public void enqueue(Customer newCustomer) {

		Node newNode = new Node(newCustomer);
		
		//if waiting list is empty
		if(rear==null)
		{
			front=rear=newNode;
		}
		//else adding newcustomer from rear end
		else
		{
			rear.next=newNode;
			rear=newNode;
		}
        System.out.println("Customer " + newCustomer.getCustomerName() + " added to the waiting list.");

	}
	public void dequeue() {

		//if empty
		if(front == null)
		{
			System.out.println("Waiting list is empty.");
            return;
		}
		//else removing customer from front 
		
			Customer removedCustomer = front.data;
			front = front.next;
			
			//none left
			if(front == null)
			{
				rear = null;
			}
		
		System.out.println("Customer "+removedCustomer.getCustomerName()+" removed from the waiting list");
	}
	public void displayWaitingList() {

		if(front == null)
		{
			System.out.println("Waiting list is empty.");
            return;
		}
		
		Node temp=front;
		System.out.println("WAITING LIST :- ");
		
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	
	
}

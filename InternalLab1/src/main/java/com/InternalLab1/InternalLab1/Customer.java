package com.InternalLab1.InternalLab1;

//create a cutomer bean class
public class Customer {
	String name, address;
	
	//the Customer bean class is dependent on the ticket bean class
	//setter and getter method for ticket also
	//java bean object - instance of java bean class
	Ticket ticket;

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", ticket=" + ticket + "]";
	}
	
	
	  
	
}

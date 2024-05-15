package com.InternalLab1.InternalLab1;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ScannedGenericBeanDefinition;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class InternalLab1Application {

	public static void main(String[] args) {
		SpringApplication.run(InternalLab1Application.class, args);
		ApplicationContext ac = new ClassPathXmlApplicationContext("custtick.xml");

		
		Scanner sc = new Scanner(System.in);
		// Retrieving the 'customer' bean from the application context and casting it to Customer class
		Customer c = (Customer) ac.getBean("customer", Customer.class);
		// Retrieving the 'ticket' bean from the application context and casting it to Ticket class
		Ticket t = (Ticket) ac.getBean("ticket", Ticket.class);		
		
		//create a menudriven program to  accept the details and display the same;
		int choice;
		while(true) {
			System.out.println("Select a Option........");
			System.out.println("1. Insert\n2. Display\n3. Exit\nEnter Your Choice: ");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter Cusomer Name: ");
				c.setName(sc.next());
				System.out.println("Enter Cusomer Address: ");
				c.setName(sc.next());
				System.out.println("Enter Ticket Number: ");
				t.setTicno(sc.nextInt());
				System.out.println("Enter Ticket Price: ");
				t.setPrice(sc.nextInt());
				System.out.println("Enter Seat Number: ");
				t.setSeatno(sc.nextInt());
				System.out.println("Enter Ticket Type(GOLD/PLATINUM/ECONOMY :");
				t.setTicktype(sc.next());
				System.out.println("Thanks for your Input");
			case 2:
				System.out.println("Details are......");
				System.out.println("Customer Name :" + c.getName() + 
						"\nCusomer Address: " + c.getAddress()+
						"\nTicket Number: " + t.getTicno() +
						"\nTicket Price: "+t.getPrice() + 
						"\nSeat Number: " + t.getSeatno() +
						"\nTicket Type: " + t.getTicktype());
				break;
			case 3:
				System.exit(0);
				
			}
			
		}
		
		
		 
		
	}

}

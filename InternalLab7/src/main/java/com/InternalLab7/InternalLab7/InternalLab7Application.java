package com.InternalLab7.InternalLab7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ScannedGenericBeanDefinition;

@SpringBootApplication
public class InternalLab7Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(InternalLab7Application.class, args);
		CusomerServices cs = context.getBean(CusomerServices.class);
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. Insert"
					+ "\n2. Display"
					+ "\n3. Update"
					+ "\n4. Delete"
					+ "\n5 Exit"
					+ "\nEnter Your Option");
			int ch = sc.nextInt();
			switch(ch){
			case 1:
				System.out.print("Enter Fname: ");
				String fn = sc.next();
				System.out.print("Enter Lname: ");
				String ln = sc.next();
				cs.insert(fn, ln);
				break;
			case 2:
				List<Customer> customer = new ArrayList<Customer>();
				customer = cs.getAllData();
				System.out.print(customer);	
				break;
			case 3:
				System.out.print("Enter id: ");
				long id = sc.nextInt();
				System.out.print("Enter Fname: ");
				String fn1 = sc.next();
				System.out.print("Enter Lname: ");
				String ln1 = sc.next();
				cs.update(id, fn1, ln1);
				break;
			case 4:
				System.out.print("Enter id: ");
				long id1 = sc.nextInt();
				cs.delete(id1);
				break;
			case 5:
				System.out.print("Thank YOu);"
						+ " ");
				context.close();
				System.exit(0);
			}
			
		}
		
	}

}

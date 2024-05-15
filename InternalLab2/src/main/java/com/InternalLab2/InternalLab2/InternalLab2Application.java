package com.InternalLab2.InternalLab2;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ScannedGenericBeanDefinition;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class InternalLab2Application {

	public static void main(String[] args) {
		SpringApplication.run(InternalLab2Application.class, args);
		ApplicationContext ac = new ClassPathXmlApplicationContext("DeptCol.xml");
		Department d = (Department) ac.getBean("department");
		Scanner sc = new Scanner(System.in);
		
		//menu driven
		while(true) {
			System.out.println("1 Insert the Department Details:\n"
					+ "2. Display Departmetn Details\n"
					+ "3. Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:/*	int id;
				String name, description;*/
				System.out.print("Enter Department id: ");
				//use setter methods to store data
				d.setId(sc.nextInt());
				System.out.println("Enter Department name: ");
				d.setName(sc.next());
				System.out.println("Enter Description: ");
				d.setDescription(sc.next());
				System.out.println("Thanks for your input");
				break;
			case 2:
				System.out.println("Displaying the Details");
				System.out.println("Department Id: " + d.getId()+
						"\nDepartment name: " + d.getName()+
						"\nDescription :" + d.getDescription());
				break;
			case 3:
				System.exit(0);
			}
		}
	}

}

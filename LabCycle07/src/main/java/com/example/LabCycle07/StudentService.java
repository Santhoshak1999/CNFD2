package com.example.LabCycle07;

//CustomerService.java

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public void addCustomer(String fname, String lname) {
		Student customer = new Student();
		customer.setFirstName(fname);
		customer.setLastName(lname);
		studentRepository.save(customer);
	}

	public List<Student> getAllCustomers() {
		return studentRepository.findAll();
	}

	public void updateCustomer(long id, String fname, String lname) {
		Student customer = studentRepository.findById(id).orElse(null);
		if (customer != null) {
			customer.setFirstName(fname);
			customer.setLastName(lname);
			studentRepository.save(customer);
		}
	}

	public void deleteCustomer(long id) {
		studentRepository.deleteById(id);
	}

}
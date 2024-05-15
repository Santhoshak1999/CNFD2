package com.InternalLab7.InternalLab7;

import java.util.List;

import org.hibernate.mapping.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CusomerServices {

	@Autowired
	private CustomerRepository cr;
	
	public void insert(String fname, String lname) {
		Customer c = new Customer();
		c.setFname(fname);
		c.setLname(lname);
		cr.save(c);
	}
	
	public List<Customer> getAllData(){
		return cr.findAll();
	}
	
	public void update(Long id, String fname, String lname) {
		Customer customer = cr.findById(id).orElse(null);
		if(customer != null) {
			customer.setFname(fname);
			customer.setLname(lname);
		}
		cr.save(customer);
	}
	public void delete(Long id) {
		Customer customer = cr.findById(id).orElse(null);
		if(customer!=null) {
			cr.delete(customer);
		}
	}
	
	
}

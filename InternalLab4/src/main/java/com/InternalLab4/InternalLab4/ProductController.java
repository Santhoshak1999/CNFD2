package com.InternalLab4.InternalLab4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
	List<Product> plist = new ArrayList<Product>();	
	
	@GetMapping 
	public List<Product> getProduct(){
		return plist;
	}
	
	@PostMapping //user to create a new resource on the server
	public List<Product> postProduct(@RequestBody Product product){
		plist.add(product);
		return plist;
	}
	
	@DeleteMapping("/{id}")
	public List<Product> deleteProduct(@PathVariable int id){
		for(Product p : plist) {
			if(p.getId() == id) {
				plist.remove(p);
			}
		}
		return plist;	
	}
	
	@PutMapping //user to update or replace the existing resource on server
	public List<Product> putproduct(@RequestBody Product product){
		for(Product p:plist) {
			if(p.getId() == product.getId()) {
				p.setName(product.getName());
				p.setPrice(product.getPrice());
			}
			
		}
		return plist;	
	}
}

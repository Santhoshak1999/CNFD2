package com.Internallab5.internalLab5;



import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/product")
public class ProductConroller {
	List<Product> plist = new ArrayList<Product>();

//	@GetMapping
//	public List<Product> getproduct(){
//		return plist;
//	}
	
	@PostMapping 
	public ResponseEntity<?> postproduct(@Valid @RequestBody Product product, BindingResult  result){
		List<String> errors = new ArrayList<String>();
		if(result.hasErrors()) {
			for(FieldError error: result.getFieldErrors()) {
				errors.add(error.getField()+ " " + error.getDefaultMessage());
			}
			return ResponseEntity.badRequest().body(errors);
		}else {
		plist.add(product);
		return ResponseEntity.ok(plist);
		}
	}
	@PutMapping
	public ResponseEntity<?> putproduct(@Valid @RequestBody Product product, BindingResult result){
		List<String> errors = new ArrayList<String>();
		if(result.hasErrors()) {
			for(FieldError error: result.getFieldErrors()) {
				errors.add(error.getField()+ " " + error.getDefaultMessage());
			}
			return ResponseEntity.badRequest().body(errors);
		}else {
		for(Product p : plist) {
			if(p.getId() == product.getId()) {
				p.setName(product.getName());
				p.setPrice(product.getPrice());
			}
		}
		return ResponseEntity.ok(plist);
	}
}

	
	
//	@DeleteMapping("/{id}")
//	public List<Product> deleteproduct(@PathVariable int id){
//		for(Product p:plist) {
//			if(id == p.getId()) {
//				plist.remove(p);
//			}
//		}
//		return plist;
//	}
	

	
}

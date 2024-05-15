package com.InternalLab3.InternalLab3;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//create a rest controller
@RestController
@RequestMapping("/book")
public class BookController {
	List<Book> blist = new ArrayList<Book>();
	
	@PostMapping
	public List<Book> postBook(@RequestBody Book book) {
		blist.add(book);
		return blist;		
	}
	
	@GetMapping("/get")
	public List<Book> getBook(){
		return blist;
	}
}

package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Models.Book;
import com.example.demo.service.ApiService;

public class ApiController {
	@Autowired
	ApiService sser;
	
	@PostMapping("addnew")
	public List<Book>add(@RequestBody List<Book>  ss)
	{
	   return sser.saveinfo(ss);
	}
	
	@GetMapping("showdetails")
	public List<Book> show()
	{
		return sser.showinfo();
	}
	
	@PutMapping("changedetails")
	public Book change(@RequestBody Book ss)
	{
		return sser.changeinfo(ss);
	}
	
	@DeleteMapping("deletedetails")
	public String delete(@RequestBody Book ss)
	{
	    return sser.deleteinfo(ss);
	}
	
	@DeleteMapping("delid/{id}")
	public void delbyid(@PathVariable int id)
	{
	    sser.deleteId(id);
	}
	
	@DeleteMapping("delbyid")
	public void delbyparam(@RequestParam int id)
	{
		sser.delete(id);
	}
}

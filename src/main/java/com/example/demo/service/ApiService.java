package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Book;
import com.example.demo.Repositories.BookRepo;

@Service
public class ApiService {
    
	@Autowired
	BookRepo sr;
	
	public List<Book> saveinfo(List<Book> ss)
	{
		return(List<Book>)sr.saveAll(ss);
	}
	public List<Book> showinfo()
	{
		return sr.findAll();
	}
	
	public Book changeinfo(Book ss)
	{
		return sr.saveAndFlush(ss);
	}
	
	public String deleteinfo(Book ss)
	{
		sr.delete(ss);
		return "You have successfully deleted the record ";
	}
	
	public void deleteId(int id)
	{
		sr.deleteById(id);
	}
	 public void delete(int id)
	 {
		 sr.deleteById(id);
	 }
}

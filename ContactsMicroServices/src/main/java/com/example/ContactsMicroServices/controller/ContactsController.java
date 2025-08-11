package com.example.ContactsMicroServices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ContactsMicroServices.entities.Contacts;
import com.example.ContactsMicroServices.service.ContactsService;

@RestController
@RequestMapping("/contacts")
public class ContactsController {
	@Autowired 
	ContactsService service;
	
	@GetMapping("/{userId}") //@sarfaraza: if I change this to id ? do I need to change in function too ?
	public Contacts getContactByUserId(@PathVariable int userId) {
		return service.getContactByUserId(userId);
	}
	
	@PostMapping("/add")
	public Contacts createContact(@RequestBody Contacts contact) {
		return service.createContact(contact);
	}
}

package com.example.ContactsMicroServices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ContactsMicroServices.entities.Contacts;
import com.example.ContactsMicroServices.repository.ContactsRepo;
@Service
public class ContactsService {

	@Autowired 
	ContactsRepo repo;
	
	public Contacts getContactByUserId(int userId) {
		return repo.findById(userId).get();
		
	}
	
	public Contacts createContact(Contacts contact) {
		return repo.save(contact);
		
	}

}

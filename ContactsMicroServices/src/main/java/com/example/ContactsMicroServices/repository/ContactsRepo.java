package com.example.ContactsMicroServices.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ContactsMicroServices.entities.Contacts;

public interface ContactsRepo extends JpaRepository<Contacts, Integer>{
	List<Contacts> findByUserId(int userId);
}

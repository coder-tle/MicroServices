package com.example.ContactsMicroServices.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contacts {
	@Id
	private int conId;
	private int userId;
	private String phone;
	private String email;
}

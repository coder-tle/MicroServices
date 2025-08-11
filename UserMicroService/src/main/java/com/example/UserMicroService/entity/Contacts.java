package com.example.UserMicroService.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contacts {
	
	private int conId;
	private int userId;
	private String phone;
	private String email;
}

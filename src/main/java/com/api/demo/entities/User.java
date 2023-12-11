package com.api.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class User {
	
	@Id
	private Integer id;
	
	@Column(nullable=false, length=50)
	private String nombre;
	
	@Column(nullable=false, length=50)
	private String email;
	
	   public User(String email, String password) {
	        this.email = email;
	        this.nombre = password;
	    }
	

}

package com.api.demo.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;



@Data
@Entity
public class Usuario {
	
	@Id
	@SequenceGenerator(name="usuario_id_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="usuario_id_seq")
	private Integer id;
	private String nombre;
	private String email;
	
	


}

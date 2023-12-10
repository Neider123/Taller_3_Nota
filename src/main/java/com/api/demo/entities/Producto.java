package com.api.demo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;



@Data
@Entity
@Table(name = "producto")
public class Producto implements Serializable {
    
	@Id
	@SequenceGenerator(name="producto2_id_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="producto2_id_seq")
	private Integer id;
	
	private String nombre;
	
	private String descripcion;
	
	

	
	@ManyToOne
	@JoinColumn(name="categoria_id")
	private Categoria categoria;





	

}

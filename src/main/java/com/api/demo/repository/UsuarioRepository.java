package com.api.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.demo.entities.Categoria;
import com.api.demo.entities.Producto;
import com.api.demo.entities.Usuario;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	
	
}

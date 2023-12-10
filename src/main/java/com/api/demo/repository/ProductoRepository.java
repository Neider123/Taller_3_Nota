package com.api.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.demo.entities.Producto;


@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}

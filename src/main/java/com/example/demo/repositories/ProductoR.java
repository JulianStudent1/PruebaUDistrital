package com.example.demo.repositories;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.models.*;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoR extends CrudRepository<ProductoM, Long> {

	public abstract ProductoM findByidProducto(Long idProducto);
	
	//public List<ProductoM> findByidProducto(String idProducto);
	
}

package com.example.demo.repositories;

import com.example.demo.models.*;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientesR extends CrudRepository<ClientesM, Long>  {

	public abstract ClientesM findByidCliente(Long idCliente);
	
}

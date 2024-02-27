package com.example.demo.repositories;

import com.example.demo.models.*;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaProductoR extends CrudRepository<FacturaProductoM, Long> {

	public abstract ArrayList<FacturaProductoM> findByidDetalleFactura(Long idDetalleFactura);
	
	public abstract ArrayList<FacturaProductoM> findByidFactura(Long idFactura);

}

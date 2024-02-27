package com.example.demo.repositories;

import java.util.ArrayList;

import com.example.demo.models.*;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaR extends CrudRepository<FacturaM, Long> {

    public abstract ArrayList<FacturaM> findByIdFactura(Long idFactura);

}

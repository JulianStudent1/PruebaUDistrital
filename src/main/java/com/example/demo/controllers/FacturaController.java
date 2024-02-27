package com.example.demo.controllers;

import com.example.demo.dto.FacturaConProductosDTO;
import com.example.demo.models.*;
import com.example.demo.services.*;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@RestController
@RequestMapping("/v1/facturas")
public class FacturaController {

    @Autowired
    FacturaS facturaS;

    @GetMapping()
    public ArrayList<FacturaM> obtenerFacturas(){
        return facturaS.obtenerFacturas();
    }
        
    @PostMapping()
    public FacturaM guardarFactura(@RequestBody FacturaM factura){
        return this.facturaS.guardarFactura(factura);
    }
    
    @PostMapping("/facturasProductos")
    public ResponseEntity<FacturaM> guardarFacturaConProductos(@RequestBody FacturaConProductosDTO facturaConProductosDTO) {
    	System.out.println(facturaConProductosDTO.getFactura());
    	System.out.println(facturaConProductosDTO.getProductos());
        FacturaM facturaGuardada = facturaS.guardarFacturaConProductos(facturaConProductosDTO.getFactura(), facturaConProductosDTO.getProductos());
        return new ResponseEntity<>(facturaGuardada, HttpStatus.CREATED);
    }    
    
}

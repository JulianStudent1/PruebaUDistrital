package com.example.demo.services;

import com.example.demo.models.*;
import com.example.demo.repositories.*;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacturaS {

    @Autowired
    FacturaR facturaR;

    @Autowired
    private FacturaProductoR facturaProductoR;
    
    public ArrayList<FacturaM> obtenerFacturas(){
        return (ArrayList<FacturaM>) facturaR.findAll();
    }
    
    public FacturaM guardarFactura(FacturaM factura){
        return facturaR.save(factura);
    }

    public FacturaM guardarFacturaConProductos(FacturaM factura, List<FacturaProductoM> productos) {
    	System.out.println(factura);
    	FacturaM facturaGuardada = facturaR.save(factura);

        for (FacturaProductoM producto : productos) {
            producto.setIdFactura(facturaGuardada.getIdFactura());
            System.out.println(producto);
            
            facturaProductoR.save(producto);
        }

        return facturaGuardada;
    }
    
}

package com.example.demo.services;

import com.example.demo.dto.FacturaConProductosDTO;
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
    
    @Autowired
    private ProductoR productoR;
    
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
    
    public List<FacturaConProductosDTO> obtenerFacturasConDetalles() {
        List<FacturaM> facturas = (List<FacturaM>) facturaR.findAll();
        List<FacturaConProductosDTO> facturasConDetalles = new ArrayList<>();

        for (FacturaM factura : facturas) {
            List<FacturaProductoM> detalles = facturaProductoR.findByidFactura(factura.getIdFactura());
            facturasConDetalles.add(new FacturaConProductosDTO(factura, detalles));
        }

        return facturasConDetalles;
    }
    
    public List<FacturaConProductosDTO> obtenerFacturasConDetallesDos() {
        List<FacturaM> facturas = (List<FacturaM>) facturaR.findAll();
        List<FacturaConProductosDTO> facturasConDetalles = new ArrayList<>();

        for (FacturaM factura : facturas) {
            List<FacturaProductoM> detalles = facturaProductoR.findByidFactura(factura.getIdFactura());
            List<ProductoM> productos = new ArrayList<>(); 
            
            for (FacturaProductoM detalle : detalles) {
            	ProductoM producto = productoR.findByidProducto(detalle.getIdProducto());
                System.out.println(producto.getNombreProducto());
            }
            
            
            facturasConDetalles.add(new FacturaConProductosDTO(factura, detalles));
        }

        return facturasConDetalles;
    }
    
}

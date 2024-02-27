package com.example.demo.dto;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.models.*;

public class FacturaConProductosDTO {

	private FacturaM factura;
    private List<FacturaProductoM> productos;
    private List<ProductoM> detalles;
    private List<String> nombresProductos;
    private String nombreCliente;

    public FacturaConProductosDTO() {
    }
    
    public FacturaConProductosDTO(FacturaM factura, List<FacturaProductoM> productos) {
        this.factura = factura;
        this.productos = productos;
    }

    public FacturaConProductosDTO(FacturaM factura, List<FacturaProductoM> productos, List<String> nombresProductos,String nombreCliente) {
        this.factura = factura;
        this.productos = productos;
        this.nombresProductos = nombresProductos;
        this.nombreCliente =  nombreCliente;
    }

    
    public FacturaM getFactura() {
        return factura;
    }

    public void setFactura(FacturaM factura) {
        this.factura = factura;
    }

    public List<FacturaProductoM> getProductos() {
        return productos;
    }

    public void setProductos(List<FacturaProductoM> productos) {
        this.productos = productos;
    }
    
    public List<ProductoM> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<ProductoM> detalles) {
        this.detalles = detalles;
    }

    public List<String> getNombresProductos() {
        return nombresProductos;
    }

    public void setNombresProductos(List<String> nombresProductos) {
        this.nombresProductos = nombresProductos;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
}

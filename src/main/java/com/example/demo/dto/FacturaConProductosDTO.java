package com.example.demo.dto;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.models.*;

public class FacturaConProductosDTO {

	private FacturaM factura;
    private List<FacturaProductoM> productos;
    private List<ProductoM> detalles;

    public FacturaConProductosDTO() {
    }
    
    public FacturaConProductosDTO(FacturaM factura, List<FacturaProductoM> productos) {
        this.factura = factura;
        this.productos = productos;
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
	
}

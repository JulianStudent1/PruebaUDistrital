package com.example.demo.dto;

import java.util.List;

import com.example.demo.models.*;

public class FacturaConProductosDTO {

	private FacturaM factura;
    private List<FacturaProductoM> productos;

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
	
}

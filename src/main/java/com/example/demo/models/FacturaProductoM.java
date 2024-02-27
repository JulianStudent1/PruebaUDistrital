package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "DETALLE_FACTURAS")
public class FacturaProductoM {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDDETALLEFACTURA")
    private Long idDetalleFactura;

    @Column(name = "IDFACTURA")
    private Long idFactura;

    @Column(name = "IDPRODUCTO")
    private Long idProducto;
    
    @Column(name = "CANTIDADPRODUCTOS")
    private Long cantidadProductos;


    /*public FacturaProductoM(Long idDetalleFactura) {
        this.idDetalleFactura = idDetalleFactura;
    }*/

    public Long getIdDetalleFactura() {
        return idDetalleFactura;
    }

    public void setIdDetalleFactura(Long idDetalleFactura) {
        this.idDetalleFactura = idDetalleFactura;
    }

    public Long getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Long idFactura) {
        this.idFactura = idFactura;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public Long getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(Long cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }
}

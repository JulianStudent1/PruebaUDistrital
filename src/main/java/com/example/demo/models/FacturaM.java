package com.example.demo.models;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name = "FACTURAS")
public class FacturaM {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDFACTURA")
    private Long idFactura;

    @Column(name = "IDCLIENTE")
    private Long idCliente;
    
    @Column(name = "TOTAL")
    private Integer total;

    @Column(name = "DATE")
    private LocalDate date;

    public Long getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Long idFactura) {
        this.idFactura = idFactura;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
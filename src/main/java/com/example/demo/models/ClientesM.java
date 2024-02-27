package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "CLIENTES")
public class ClientesM {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDCLIENTE")
    private Long idCliente;

    @Column(name = "NOMBRE")
    private String nombre;
    
    @Column(name = "EMAIL")
    private String email;

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

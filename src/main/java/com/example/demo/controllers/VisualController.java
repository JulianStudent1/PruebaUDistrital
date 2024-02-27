package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.FacturaConProductosDTO;
import com.example.demo.services.FacturaS;

@Controller
@RequestMapping("")
public class VisualController {

	private final FacturaS facturaS;

    @Autowired
    public VisualController(FacturaS facturaService) {
        this.facturaS = facturaService;
    }

    @GetMapping("")
    public String mostrarFacturas(Model model) {
        List<FacturaConProductosDTO> facturasConDetalles = facturaS.obtenerFacturasConDetallesDos();
        
        model.addAttribute("facturasConDetalles", facturasConDetalles);

        return "consulta-facturas";
    }
	
}

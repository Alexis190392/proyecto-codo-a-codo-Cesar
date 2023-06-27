package com.pineda.TF.controller;

import com.pineda.TF.Interface.VentasRepository;
import com.pineda.TF.Model.VentaTicket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class VentasController {

    public final VentasRepository ventasRepository;

    @Autowired
    public VentasController(VentasRepository ventasRepository) {
        this.ventasRepository = ventasRepository;
    }

    @PostMapping("/ventas")
    public ModelAndView guardarPago(@Validated @ModelAttribute("venta") VentaTicket ventas) {
        // Guardar la entidad en la base de datos
        ventasRepository.save(ventas);

        return new ModelAndView("redirect:/index.html");
    }
}

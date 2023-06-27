package com.pineda.TF.controller;

import com.pineda.TF.Interface.OradorRepository;
import com.pineda.TF.Model.Orador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/oradores")
public class OradorController {
    private final OradorRepository oradorRepository;

    @Autowired
    public OradorController(OradorRepository oradorRepository) {
        this.oradorRepository = oradorRepository;
    }

   @PostMapping("/create")
   public ModelAndView guardarOrador(@Validated @ModelAttribute("orador") Orador orador) {
       oradorRepository.save(orador);
       return new ModelAndView("redirect:/index.html");
   }
}

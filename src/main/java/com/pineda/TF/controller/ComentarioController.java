package com.pineda.TF.controller;

import com.pineda.TF.Interface.ComentarioRepository;
import com.pineda.TF.Model.Comentario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/")
public class ComentarioController {
    private final ComentarioRepository comentarioRepository;

    @Autowired
    public ComentarioController(ComentarioRepository comentarioRepository) {
        this.comentarioRepository = comentarioRepository;
    }


    @GetMapping(value = "/list", produces = "application/json")
    @ResponseBody
    public List<Comentario> obtenerComentarios() {
        return comentarioRepository.findAll();
    }


    @PostMapping("/create")
    public ModelAndView guardarComentario(@Validated @ModelAttribute("comentario") Comentario comentario) {
        comentarioRepository.save(comentario);
        return new ModelAndView("redirect:/index.html");
    }
    @GetMapping(value = "/list/{usuario}", produces = "application/json")
    @ResponseBody
    public List<Comentario> obtenerComentariosPorUsuario(@PathVariable("usuarios") String usuario) {
        return comentarioRepository.findByUsuarios(usuario);
    }

    @PostMapping("/edit")
    public ModelAndView editarComentario(@RequestParam("usuarios") String usuario, @RequestParam("comentarios") String nuevoComentario) {
        List<Comentario> comentariosUsuario = comentarioRepository.findByUsuarios(usuario);
        if (!comentariosUsuario.isEmpty()) {
            Comentario comentarioExistente = comentariosUsuario.get(0); // Tomar el primer comentario del usuario
            comentarioExistente.setComentarios(nuevoComentario);
            comentarioRepository.save(comentarioExistente);
        }
        return new ModelAndView("redirect:/index.html");
    }
    @PostMapping("/delete")
    public ModelAndView eliminarComentario(@RequestParam("usuarios") String usuario) {
        List<Comentario> comentariosUsuario = comentarioRepository.findByUsuarios(usuario);
        if (!comentariosUsuario.isEmpty()) {
            Comentario comentarioExistente = comentariosUsuario.get(0); // Tomar el primer comentario del usuario
            comentarioRepository.delete(comentarioExistente);
        }
        return new ModelAndView("redirect:/index.html");
    }

}

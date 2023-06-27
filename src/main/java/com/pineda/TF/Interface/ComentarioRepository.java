package com.pineda.TF.Interface;

import com.pineda.TF.Model.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComentarioRepository extends JpaRepository<Comentario, Long> {
    List<Comentario> findByUsuarios(String usuarios);
}

package com.pineda.TF.Model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "comentarios")
public class Comentario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombreCompleto;

    @Column(nullable = false)
    private String usuarios;

    @Column(nullable = false)
    private String comentarios;

    @Column(nullable = false)
    private LocalDateTime fecha;

    public Comentario() {
        this.fecha = LocalDateTime.now(); // Establecer la fecha actual en la hora local
    }

    public Comentario(Long id, String nombreCompleto, String usuarios, String comentarios, LocalDateTime fecha) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.usuarios = usuarios;
        this.comentarios = comentarios;
        this.fecha = fecha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(String usuarios) {
        this.usuarios = usuarios;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Comentario{" +
                "id=" + id +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", usuarios='" + usuarios + '\'' +
                ", comentarios='" + comentarios + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
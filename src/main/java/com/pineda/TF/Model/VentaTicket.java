package com.pineda.TF.Model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "venta")
public class VentaTicket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = true)
    private String nombre;

    @Column(nullable = true)
    private String apellido;

    @Column(nullable = true)
    private String correo;

    @Column(nullable = true)
    private Integer cantidad;

    @Column(nullable = true)
    private String categoria;

    @Column(nullable = true)
    private String pagoTotal;

    @Column(nullable = true)
    private String tipoTarjeta;

    @Column(nullable = true)
    private String nombreTitular;

    @Column(nullable = true)
    private Long numeroTarjeta;

    @Column(nullable = true)
    private String cuotas;

    @Column(nullable = true)
    private String tipoDocumento;

    @Column(nullable =true)
    private Long numeroDocumento;

    @Column(nullable = true)
    private LocalDateTime fecha;

    public VentaTicket() {
        this.fecha = LocalDateTime.now(); // Establecer la fecha actual en la hora local
    }

    public VentaTicket(Long id, String nombre, String apellido, String correo, Integer cantidad, String categoria, String pagoTotal, String tipoTarjeta, String nombreTitular, Long numeroTarjeta, String cuotas, String tipoDocumento, Long numeroDocumento, LocalDateTime fecha) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.cantidad = cantidad;
        this.categoria = categoria;
        this.pagoTotal = pagoTotal;
        this.tipoTarjeta = tipoTarjeta;
        this.nombreTitular = nombreTitular;
        this.numeroTarjeta = numeroTarjeta;
        this.cuotas = cuotas;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.fecha = fecha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPagoTotal() {
        return pagoTotal;
    }

    public void setPagoTotal(String pagoTotal) {
        this.pagoTotal = pagoTotal;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public Long getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(Long numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getCuotas() {
        return cuotas;
    }

    public void setCuotas(String cuotas) {
        this.cuotas = cuotas;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Long getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(Long numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "VentaTicket{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", correo='" + correo + '\'' +
                ", cantidad=" + cantidad +
                ", categoria='" + categoria + '\'' +
                ", pagoTotal='" + pagoTotal + '\'' +
                ", tipoTarjeta='" + tipoTarjeta + '\'' +
                ", nombreTitular='" + nombreTitular + '\'' +
                ", numeroTarjeta=" + numeroTarjeta +
                ", cuotas='" + cuotas + '\'' +
                ", tipoDocumento='" + tipoDocumento + '\'' +
                ", numeroDocumento=" + numeroDocumento +
                ", fecha=" + fecha +
                '}';
    }
}

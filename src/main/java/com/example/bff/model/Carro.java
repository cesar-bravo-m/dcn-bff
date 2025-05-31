package com.example.bff.model;

import java.time.LocalDate;

public class Carro {
    private Long carroId;
    private Long usuarioId;
    private Long productoId;
    private Long cantidad;
    private LocalDate registroFecha;
    private Integer vigenciaFlag;

    // Getters and Setters
    public Long getCarroId() {
        return carroId;
    }

    public void setCarroId(Long carroId) {
        this.carroId = carroId;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Long getProductoId() {
        return productoId;
    }

    public void setProductoId(Long productoId) {
        this.productoId = productoId;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    public LocalDate getRegistroFecha() {
        return registroFecha;
    }

    public void setRegistroFecha(LocalDate registroFecha) {
        this.registroFecha = registroFecha;
    }

    public Integer getVigenciaFlag() {
        return vigenciaFlag;
    }

    public void setVigenciaFlag(Integer vigenciaFlag) {
        this.vigenciaFlag = vigenciaFlag;
    }
} 
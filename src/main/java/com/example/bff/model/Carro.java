package com.example.bff.model;

import java.sql.Date;

public class Carro {
    private Long carroId;
    private String usuarioId;
    private Long productoId;
    private Long cantidad;
    private Date registroFecha;
    private int vigenciaFlag;

    // Getters and Setters
    public Long getCarroId() {
        return carroId;
    }
    public void setCarroId(Long carroId) {
        this.carroId = carroId;
    }
    public String getUsuarioId() {
        return usuarioId;
    }
    public void setUsuarioId(String usuarioId) {
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
    public Date getRegistroFecha() {
        return registroFecha;
    }
    public void setRegistroFecha(Date registroFecha) {
        this.registroFecha = registroFecha;
    }
    public int getVigenciaFlag() {
        return vigenciaFlag;
    }
    public void setVigenciaFlag(int vigenciaFlag) {
        this.vigenciaFlag = vigenciaFlag;
    }
    
} 
package com.example.bff.model;

import java.time.LocalDate;

public class Producto {
    private Long productoId;
    private String nombre;
    private String descripcion;
    private Long stockActual;
    private LocalDate registroFecha;
    private Long valorCosto;
    private Long valorVenta;
    private String imagenUri;

    // Getters and Setters
    public Long getProductoId() {
        return productoId;
    }

    public void setProductoId(Long productoId) {
        this.productoId = productoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getStockActual() {
        return stockActual;
    }

    public void setStockActual(Long stockActual) {
        this.stockActual = stockActual;
    }

    public LocalDate getRegistroFecha() {
        return registroFecha;
    }

    public void setRegistroFecha(LocalDate registroFecha) {
        this.registroFecha = registroFecha;
    }

    public Long getValorCosto() {
        return valorCosto;
    }

    public void setValorCosto(Long valorCosto) {
        this.valorCosto = valorCosto;
    }

    public Long getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(Long valorVenta) {
        this.valorVenta = valorVenta;
    }

    public String getImagenUri() {
        return imagenUri;
    }

    public void setImagenUri(String imagenUri) {
        this.imagenUri = imagenUri;
    }
} 
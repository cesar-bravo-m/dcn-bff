package com.example.bff.model;

import java.time.LocalDateTime;

public class Usuario {
    private Long usuarioId;
    private String email;
    private String nombre;
    private LocalDateTime loginUltimo;

    // Getters and Setters
    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getLoginUltimo() {
        return loginUltimo;
    }

    public void setLoginUltimo(LocalDateTime loginUltimo) {
        this.loginUltimo = loginUltimo;
    }
} 
package com.example.bff.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.bff.model.Usuario;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private final WebClient webClient;

    public UsuarioController(WebClient webClient) {
        this.webClient = webClient;
    }

    @GetMapping("/{id}")
    public Mono<Usuario> getUsuario(@PathVariable Long id) {
        return webClient.get()
                .uri("/usuario/{id}", id)
                .retrieve()
                .bodyToMono(Usuario.class);
    }
} 
package com.example.bff.controller;

import com.example.bff.model.Producto;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    private final WebClient webClient;

    public ProductoController(WebClient webClient) {
        this.webClient = webClient;
    }

    @GetMapping
    public Mono<List<Producto>> getAllProductos() {
        return webClient.get()
                .uri("/producto")
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<Producto>>() {});
    }

    @GetMapping("/{id}")
    public Mono<Producto> getProducto(@PathVariable Long id) {
        return webClient.get()
                .uri("/producto/{id}", id)
                .retrieve()
                .bodyToMono(Producto.class);
    }
} 
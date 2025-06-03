package com.example.bff.controller;

import com.example.bff.model.Carro;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import java.util.List;

@RestController
@RequestMapping("/carro")
public class CarroController {

    private final WebClient webClient;

    public CarroController(WebClient webClient) {
        this.webClient = webClient;
    }

    @GetMapping("/{id}")
    public Mono<List<Carro>> getCarro(@PathVariable String id) {
        return webClient.get()
                .uri("/carro/{id}", id)
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<Carro>>() {});
    }

    @PostMapping
    public Mono<Carro> createCarro(@RequestBody Carro carro) {
        return webClient.post()
                .uri("/carro")
                .bodyValue(carro)
                .retrieve()
                .bodyToMono(Carro.class);
    }
} 
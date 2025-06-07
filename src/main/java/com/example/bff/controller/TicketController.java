package com.example.bff.controller;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import java.util.List;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    private final WebClient webClient;

    public TicketController(WebClient webClient) {
        this.webClient = webClient;
    }

    @GetMapping
    public Mono<List<JsonNode>> getAllTickets() {
        return webClient.get()
                .uri("/ticket")
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<JsonNode>>() {});
    }

    @GetMapping("/{id}")
    public Mono<JsonNode> getTicket(@PathVariable String id) {
        return webClient.get()
                .uri("/ticket/{id}", id)
                .retrieve()
                .bodyToMono(JsonNode.class);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<JsonNode> createTicket(@RequestBody JsonNode ticket) {
        return webClient.post()
                .uri("/ticket")
                .bodyValue(ticket)
                .retrieve()
                .bodyToMono(JsonNode.class);
    }

    @PutMapping("/{id}")
    public Mono<JsonNode> updateTicket(@PathVariable String id, @RequestBody JsonNode ticket) {
        return webClient.put()
                .uri("/ticket/{id}", id)
                .bodyValue(ticket)
                .retrieve()
                .bodyToMono(JsonNode.class);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Mono<Void> deleteTicket(@PathVariable String id) {
        return webClient.delete()
                .uri("/ticket/{id}", id)
                .retrieve()
                .bodyToMono(Void.class);
    }
} 
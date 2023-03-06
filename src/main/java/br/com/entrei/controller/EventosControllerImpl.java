package br.com.entrei.controller;

import br.com.entrei.api.EventosApi;
import br.com.entrei.model.EventoModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@RestController
public class EventosControllerImpl implements EventosApi {

    @Override
    public Mono<ResponseEntity<Void>> deleteEvento(UUID id, ServerWebExchange exchange) {
        return null;
    }

    @Override
    public Mono<ResponseEntity<EventoModel>> getEvento(UUID id, ServerWebExchange exchange) {
        return null;
    }

    @Override
    public Mono<ResponseEntity<Flux<EventoModel>>> getEventos(ServerWebExchange exchange) {
        return null;
    }

    @Override
    public Mono<ResponseEntity<EventoModel>> postEvento(Mono<EventoModel> eventoModel, ServerWebExchange exchange) {
        return null;
    }
}

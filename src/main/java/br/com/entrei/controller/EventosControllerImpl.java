package br.com.entrei.controller;

import br.com.entrei.api.EventosApi;
import br.com.entrei.entity.EventoModel;
import br.com.entrei.mapper.EventoMapper;
import br.com.entrei.service.EventoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class EventosControllerImpl implements EventosApi {

    private final EventoService eventoService;
    private final EventoMapper eventoMapper;

    @Override
    public Mono<ResponseEntity<Void>> deleteEvento(String id, ServerWebExchange exchange) {
        return eventoService.delete(id).map(evento -> ResponseEntity.ok(null));
    }

    @Override
    public Mono<ResponseEntity<EventoModel>> getEvento(String id, ServerWebExchange exchange) {
        return eventoService.findById(id)
                .map(evento -> ResponseEntity.ok(eventoMapper.toResponse(evento)));
    }

    @Override
    public Mono<ResponseEntity<Flux<EventoModel>>> getEventos(ServerWebExchange exchange) {
        return Mono.just(ResponseEntity.ok(eventoService.findAll().map(eventoMapper::toResponse)));
    }

    @Override
    public Mono<ResponseEntity<EventoModel>> postEvento(Mono<EventoModel> eventoModel, ServerWebExchange exchange) {
        return eventoModel
                .flatMap(eventoService::save)
                .map(evento -> ResponseEntity.status(HttpStatus.CREATED)
                        .body(eventoMapper.toResponse(evento)));
    }
}

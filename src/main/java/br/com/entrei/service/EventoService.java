package br.com.entrei.service;

import br.com.entrei.entity.Evento;
import br.com.entrei.entity.EventoModel;
import br.com.entrei.mapper.EventoMapper;
import br.com.entrei.repository.EventoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class EventoService {

    private final EventoRepository eventoRepository;
    private final EventoMapper eventoMapper;

    public Mono<Evento> save(final EventoModel eventoModel) {
        return eventoRepository.save(eventoMapper.toEntity(eventoModel));
    }

    public Flux<Evento> findAll(){
        return eventoRepository.findAll();
    }

    public Mono<Evento> findById(final String id){
        return eventoRepository.findById(id);
    }

    public Mono<Evento> delete(final String id) {
        return eventoRepository.findAndRemove(id);
    }
}

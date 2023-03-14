package br.com.entrei.repository;

import br.com.entrei.entity.Evento;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
@RequiredArgsConstructor
public class EventoRepository {

    private final ReactiveMongoTemplate mongoTemplate;

    public Mono<Evento> save(final Evento evento){
        return mongoTemplate.save(evento);
    }

    public Mono<Evento> findById(String id){
        return mongoTemplate.findById(id, Evento.class);
    }

    public Flux<Evento> findAll(){
        return mongoTemplate.findAll(Evento.class);
    }

    public Mono<Evento> findAndRemove(String id){
        Query query = new Query();
        Criteria where = Criteria.where("id").is(id);
        return mongoTemplate.findAndRemove(query.addCriteria(where), Evento.class);
    }
}

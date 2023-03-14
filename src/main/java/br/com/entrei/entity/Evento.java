package br.com.entrei.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.OffsetDateTime;
import java.util.List;

@Data
@Builder
@Document
public class Evento {

    @Id
    private String id;
    private String nome;
    private String descricao;

    private OffsetDateTime dataHora;
    private List<Pessoa> responsaveis;

}

package br.com.entrei.mapper;

import br.com.entrei.entity.Evento;
import br.com.entrei.entity.EventoModel;
import org.mapstruct.*;

@Mapper(
        componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
)
public interface EventoMapper {

    @Mapping(target = "id", ignore = true)
    Evento toEntity(final EventoModel eventoModel);

    @Mapping(target = "id", ignore = true)
    Evento toEntity(final EventoModel eventoModel, @MappingTarget final Evento evento);

    EventoModel toResponse(final Evento entity);
}

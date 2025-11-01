package com.priv.co.paciente.historial_pacientes.model.mapper;

import com.priv.co.paciente.historial_pacientes.model.dto.PacienteDTO;
import com.priv.co.paciente.historial_pacientes.model.entity.PacienteEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface PacienteMapper {

    PacienteMapper INSTANCE = Mappers.getMapper(PacienteMapper.class);

    PacienteEntity toEntity(PacienteDTO dto);

    PacienteDTO toDTO(PacienteEntity entity);
}

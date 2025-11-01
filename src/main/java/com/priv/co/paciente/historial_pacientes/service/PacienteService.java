package com.priv.co.paciente.historial_pacientes.service;

import com.priv.co.paciente.historial_pacientes.model.dto.PacienteDTO;
import com.priv.co.paciente.historial_pacientes.model.entity.PacienteEntity;
import com.priv.co.paciente.historial_pacientes.model.mapper.PacienteMapper;
import com.priv.co.paciente.historial_pacientes.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {

    private final PacienteRepository pacienteRepository;
    private final PacienteMapper pacienteMapper;

    @Autowired
    public PacienteService(PacienteRepository pacienteRepository, PacienteMapper pacienteMapper) {
        this.pacienteRepository = pacienteRepository;
        this.pacienteMapper = pacienteMapper;
    }

    public List<PacienteEntity> getAllPacientes() {
        return pacienteRepository.findAll();
    }

    public PacienteDTO crearPaciente(PacienteDTO pacienteDTO) {
        PacienteEntity entity = pacienteMapper.toEntity(pacienteDTO);
        PacienteEntity saved = pacienteRepository.save(entity);
        return pacienteMapper.toDTO(saved);
    }



}

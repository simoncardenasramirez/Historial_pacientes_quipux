package com.priv.co.paciente.historial_pacientes.repository;

import com.priv.co.paciente.historial_pacientes.model.entity.PacienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<PacienteEntity,Long> {
}

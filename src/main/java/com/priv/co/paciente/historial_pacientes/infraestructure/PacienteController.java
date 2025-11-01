package com.priv.co.paciente.historial_pacientes.infraestructure;

import com.priv.co.paciente.historial_pacientes.model.dto.PacienteDTO;
import com.priv.co.paciente.historial_pacientes.model.entity.PacienteEntity;
import com.priv.co.paciente.historial_pacientes.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/paciente")
public class PacienteController {

    private PacienteService pacienteService;

    @Autowired
    public PacienteController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    @GetMapping
    public ResponseEntity<List<PacienteEntity>> getAllPacientes() {
        return ResponseEntity.ok(pacienteService.getAllPacientes());
    }

    @PostMapping
    public ResponseEntity<PacienteDTO> crearPaciente(@RequestBody PacienteDTO pacienteDTO) {
        PacienteDTO creado = pacienteService.crearPaciente(pacienteDTO);
        return ResponseEntity.ok(creado);
    }
}

package com.priv.co.paciente.historial_pacientes.model.dto;


import lombok.Data;

import java.time.LocalDate;

@Data
public class PacienteDTO {


    private Long id;

    private String nombre;

    private Integer edad;

    private String historial;

    private String tratamiento;

    private LocalDate fechaRegistro;



}

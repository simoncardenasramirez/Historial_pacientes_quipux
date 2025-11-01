package com.priv.co.paciente.historial_pacientes.model.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "pacientes")
public class PacienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nombre;  

    @Column(nullable = false)
    private Integer edad;

    @Column(columnDefinition = "TEXT")
    private String historial;

    @Column(columnDefinition = "TEXT")
    private String tratamiento;

    @Column(name = "fecha_registro")
    private LocalDate fechaRegistro;

    public PacienteEntity() {

    }

    public PacienteEntity(String nombre, Integer edad, String historial, String tratamiento, LocalDate fechaRegistro) {
        this.nombre = nombre;
        this.edad = edad;
        this.historial = historial;
        this.tratamiento = tratamiento;
        this.fechaRegistro = fechaRegistro;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Integer getEdad() { return edad; }
    public void setEdad(Integer edad) { this.edad = edad; }

    public String getHistorial() { return historial; }
    public void setHistorial(String historial) { this.historial = historial; }

    public String getTratamiento() { return tratamiento; }
    public void setTratamiento(String tratamiento) { this.tratamiento = tratamiento; }

    public LocalDate getFechaRegistro() { return fechaRegistro; }
    public void setFechaRegistro(LocalDate fechaRegistro) { this.fechaRegistro = fechaRegistro; }
}


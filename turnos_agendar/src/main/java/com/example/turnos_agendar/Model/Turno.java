package com.example.turnos_agendar.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@Entity
public class Turno {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private  Long id_turno;
    @Temporal(TemporalType.DATE)
    private LocalDate fecha;
    private  String tratamiento;
    private  String nombreCompletoPaciente;

    public Turno() {
    }

    public Turno(Long id_turno, LocalDate fecha, String tratamiento, String nombreCompletoPaciente) {
        this.id_turno = id_turno;
        this.fecha = fecha;
        this.tratamiento = tratamiento;
        this.nombreCompletoPaciente = nombreCompletoPaciente;
    }

    public Long getId_turno() {
        return id_turno;
    }

    public void setId_turno(Long id_turno) {
        this.id_turno = id_turno;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getNombreCompletoPaciente() {
        return nombreCompletoPaciente;
    }

    public void setNombreCompletoPaciente(String nombreCompletoPaciente) {
        this.nombreCompletoPaciente = nombreCompletoPaciente;
    }
}

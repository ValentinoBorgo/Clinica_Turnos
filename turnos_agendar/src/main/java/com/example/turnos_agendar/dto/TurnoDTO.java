package com.example.turnos_agendar.dto;

import java.time.LocalDate;

public class TurnoDTO {

    private LocalDate fecha;
    private String tratamiento;
    private String dniPaciente;

    public TurnoDTO() {
    }

    public TurnoDTO(LocalDate fecha, String tratamiento, String dniPaciente) {
        this.fecha = fecha;
        this.tratamiento = tratamiento;
        this.dniPaciente = dniPaciente;
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

    public String getDniPaciente() {
        return dniPaciente;
    }

    public void setDniPaciente(String dniPaciente) {
        this.dniPaciente = dniPaciente;
    }
}

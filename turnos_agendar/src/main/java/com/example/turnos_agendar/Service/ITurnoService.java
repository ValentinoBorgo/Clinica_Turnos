package com.example.turnos_agendar.Service;

import com.example.turnos_agendar.Model.Turno;

import java.time.LocalDate;
import java.util.List;

public interface ITurnoService {

    public List<Turno> getShifts();

    public Turno saveShift(LocalDate fecha, String tratamiento, String dniPaciente);

    public String deleteShift(Long id);

    public  Turno findShift(Long id);

    public  Turno editShift(Long id, Turno turno);

}

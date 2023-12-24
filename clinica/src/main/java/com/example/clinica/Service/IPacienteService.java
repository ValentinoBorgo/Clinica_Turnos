package com.example.clinica.Service;

import com.example.clinica.Model.Paciente;

import java.util.List;

public interface IPacienteService {

    public List<Paciente> getPatients();

    public Paciente savePatient(Paciente paciente);

    public String deletePatient(Long id);

    public Paciente getPatient(Long id);

    public Paciente editPatient(Long id, Paciente paciente);

    public Paciente getPatientByDni(String dni);

}

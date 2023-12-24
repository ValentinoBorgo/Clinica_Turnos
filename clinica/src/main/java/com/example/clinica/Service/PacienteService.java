package com.example.clinica.Service;

import com.example.clinica.Model.Paciente;
import com.example.clinica.Repository.IPacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService implements IPacienteService{

    @Autowired
    private IPacienteRepository pacienteRepository;


    @Override
    public List<Paciente> getPatients() {
        return pacienteRepository.findAll();
    }

    @Override
    public Paciente savePatient(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    @Override
    public String deletePatient(Long id) {
        pacienteRepository.deleteById(id);
        return "Paciente Eliminado";
    }

    @Override
    public Paciente getPatient(Long id) {
        return pacienteRepository.findById(id).orElse(null);
    }

    @Override
    public Paciente editPatient(Long id, Paciente paciente) {
        Paciente editPatient = this.getPatient(id);
        editPatient.setApellido(paciente.getApellido());
        editPatient.setDni(paciente.getDni());
        editPatient.setFechaNac(paciente.getFechaNac());
        editPatient.setNombre(paciente.getNombre());
        editPatient.setTelefono(paciente.getTelefono());
        this.savePatient(editPatient);
        return editPatient;
    }

    @Override
    public Paciente getPatientByDni(String dni) {
        return pacienteRepository.findByDni(dni);
    }
}

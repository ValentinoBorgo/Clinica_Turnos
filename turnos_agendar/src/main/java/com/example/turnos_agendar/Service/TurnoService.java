package com.example.turnos_agendar.Service;

import com.example.turnos_agendar.Model.Paciente;
import com.example.turnos_agendar.Model.Turno;
import com.example.turnos_agendar.Repository.ITurnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.List;

@Service
public class TurnoService implements ITurnoService{

    @Autowired
    private ITurnoRepository turnoRepository;

    @Autowired
    private RestTemplate apiPatients;


    @Override
    public List<Turno> getShifts() {
        return turnoRepository.findAll();
    }

    @Override
    public Turno saveShift(LocalDate fecha, String tratamiento, String dniPaciente) {

        //I am getting the patient by dni from the service_patients microservice
        Paciente searchPatientByDni = apiPatients.getForObject("http://localhost:4001/patients/getByDni/"+dniPaciente, Paciente.class);
        String nombreCompleto = searchPatientByDni.getNombre() + " " + searchPatientByDni.getApellido();

        Turno turno = new Turno();
        turno.setFecha(fecha);
        turno.setTratamiento(tratamiento);
        turno.setNombreCompletoPaciente(nombreCompleto);

        return turnoRepository.save(turno);
    }

    @Override
    public String deleteShift(Long id) {
        turnoRepository.deleteById(id);
        return "Turno Eliminado";
    }

    @Override
    public Turno findShift(Long id) {
        return turnoRepository.findById(id).orElse(null);
    }

    @Override
    public Turno editShift(Long id, Turno turno) {
        Turno newTurno = this.findShift(id);

        newTurno.setFecha(turno.getFecha());
        newTurno.setTratamiento(turno.getTratamiento());
        newTurno.setNombreCompletoPaciente(turno.getNombreCompletoPaciente());

        turnoRepository.save(newTurno);
        return newTurno;
    }
}
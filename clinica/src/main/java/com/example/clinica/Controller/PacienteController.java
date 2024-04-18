package com.example.clinica.Controller;

import com.example.clinica.Model.Paciente;
import com.example.clinica.Service.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.http.HttpHeaders;

@RestController
@RequestMapping("/api/clinic")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = {RequestMethod.DELETE, RequestMethod.GET,
    RequestMethod.OPTIONS, RequestMethod.POST, RequestMethod.PUT})
public class PacienteController {

    @Autowired
    private IPacienteService pacienteService;

    @Value("${server.port}")
    private int puerto;

    @GetMapping("/patients/get")
    public List<Paciente> getPatients(){
        System.out.println("------------------- Estoy en el puerto " + puerto);
        return pacienteService.getPatients();
    }

    @GetMapping("/patients/get/{id}")
    public Paciente getPatient(@PathVariable Long id){
        return pacienteService.getPatient(id);
    }

    @GetMapping("patients/getByDni/{dni}")
    public ResponseEntity<?> getPatientByDni(@PathVariable String dni){

        Paciente paciente = pacienteService.getPatientByDni(dni);

        if(paciente == null){
            return new ResponseEntity<>("Paciente no encontrado", HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<>(paciente, HttpStatus.OK);
        }
    }

    @PostMapping("/patients/create")
    public Paciente savePatient(@RequestBody Paciente paciente){
        return pacienteService.savePatient(paciente);
    }

    @DeleteMapping("/patients/delete/{id}")
    public String deletePatient(@PathVariable Long id){
        return pacienteService.deletePatient(id);
    }

    @PutMapping("/patients/edit/{id}")
    public Paciente editPatient(@RequestBody Paciente paciente, @PathVariable Long id){
        return pacienteService.editPatient(id, paciente);
    }
    
}

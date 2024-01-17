package com.example.turnos_agendar.Controller;

import com.example.turnos_agendar.Model.Turno;
import com.example.turnos_agendar.Service.ITurnoService;
import com.example.turnos_agendar.dto.TurnoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/shifts")
public class TurnoController {

    @Autowired
    private ITurnoService turnoService;

    @Value("${server.port}")
    private int puerto;

    @GetMapping("/get")
    public List<Turno> getShifts(){
        System.out.println("------------------- Estoy en el puerto " + puerto);
        return turnoService.getShifts();
    }

    @GetMapping("/get/{id}")
    public Turno getShift(@PathVariable Long id){
        return turnoService.findShift(id);
    }

    @PostMapping("/create")
    public Turno saveShift(@RequestBody TurnoDTO turnoDTO){
        return turnoService.saveShift(turnoDTO.getFecha(), turnoDTO.getTratamiento(), turnoDTO.getDniPaciente());
    }

    @DeleteMapping("/delete/{id}")
    public String deleteShift(@PathVariable Long id){
        return turnoService.deleteShift(id);
    }

    @PutMapping("/edit/{id}")
    public Turno editShift(@PathVariable Long id,
                           @RequestBody Turno turnoEdit){
        return turnoService.editShift(id, turnoEdit);
    }

}

package com.dh.ClinicaDefinitivo.controller;
import com.dh.ClinicaDefinitivo.entity.dto.PacienteDTO;
import com.dh.ClinicaDefinitivo.service.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/paciente")
public class PacienteController {
    @Autowired
    private IPacienteService pacienteService;

    @PostMapping
    public ResponseEntity<?> crearPaciente(@RequestBody PacienteDTO pacienteDTO) {
        pacienteService.crearPaciente(pacienteDTO);
        return ResponseEntity.ok("Paciente creado exitosamente.");
    }

    @GetMapping("/{id}")
    public PacienteDTO buscarPacientePorId(@PathVariable Long id) {
        return pacienteService.leerPaciente(id);
    }

    @GetMapping
    public Collection<PacienteDTO> listarTodosLosPacientes() {
        return pacienteService.listarTodos();
    }

    @PutMapping
    public ResponseEntity<?> modificarPaciente(@RequestBody PacienteDTO pacienteDTO){
        pacienteService.modificarPaciente(pacienteDTO);
        return ResponseEntity.ok("Paciente modificado exitosamente.");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarPacientePorId(@PathVariable Long id){
        pacienteService.eliminarPaciente(id);
        return ResponseEntity.ok("Paciente eliminado.");
    }
}

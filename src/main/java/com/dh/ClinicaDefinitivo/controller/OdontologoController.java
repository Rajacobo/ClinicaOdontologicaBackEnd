package com.dh.ClinicaDefinitivo.controller;
import com.dh.ClinicaDefinitivo.entity.dto.OdontologoDTO;
import com.dh.ClinicaDefinitivo.service.IOdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;

@RestController
@RequestMapping("/odontologo")
public class OdontologoController {
    @Autowired
    private IOdontologoService odontologoService;

    @PostMapping()
    public ResponseEntity<?> crearOdontologo(@RequestBody OdontologoDTO odontologoDTO) {
        odontologoService.crearOdontologo(odontologoDTO);
        return ResponseEntity.ok("Odontologo creado exitosamente.");
    }

    @GetMapping("/{id}")
    public OdontologoDTO buscarOdontologoPorId(@PathVariable Long id) {
        return odontologoService.leerOdontologo(id);
    }

    @GetMapping
    public Collection<OdontologoDTO> listarTodosLosOdontologos() {
        return odontologoService.listarTodos();
    }

    @PutMapping
    public ResponseEntity<?> modificarOdontologo(@RequestBody OdontologoDTO odontologoDTO){
        odontologoService.modificarOdontologo(odontologoDTO);
        return ResponseEntity.ok("Odontologo modificado exitosamente.");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarOdontologoPorId(@PathVariable Long id){
        odontologoService.eliminarOdontologo(id);
        return ResponseEntity.ok("Odontologo eliminado.");
    }
}

package com.dh.ClinicaDefinitivo.service;
import com.dh.ClinicaDefinitivo.entity.dto.TurnoDTO;
import java.util.Set;

public interface ITurnoService {
    void crearTurno(TurnoDTO turnoDTO);
    TurnoDTO leerTurno(Long id);
    void modificarTurno(TurnoDTO turnoDTO);
    void eliminarTurno(Long id);
    Set<TurnoDTO> listarTodos();
}

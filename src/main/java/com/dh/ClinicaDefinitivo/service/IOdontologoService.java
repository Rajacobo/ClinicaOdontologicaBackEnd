package com.dh.ClinicaDefinitivo.service;
import com.dh.ClinicaDefinitivo.badExceptions.BadRequestException;
import com.dh.ClinicaDefinitivo.entity.dto.OdontologoDTO;
import java.util.Set;

public interface IOdontologoService {
    void crearOdontologo(OdontologoDTO odontologoDTO) throws BadRequestException;
    OdontologoDTO leerOdontologo(Long id);
    void modificarOdontologo(OdontologoDTO odontologoDTO);
    void eliminarOdontologo(Long id);
    Set<OdontologoDTO> listarTodos();
}

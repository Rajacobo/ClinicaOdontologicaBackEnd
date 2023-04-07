package com.dh.ClinicaDefinitivo.service.impl;
import com.dh.ClinicaDefinitivo.badExceptions.BadRequestException;
import com.dh.ClinicaDefinitivo.entity.Odontologo;
import com.dh.ClinicaDefinitivo.entity.dto.OdontologoDTO;
import com.dh.ClinicaDefinitivo.repository.IOdontologoRepository;
import com.dh.ClinicaDefinitivo.service.IOdontologoService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class OdontologoService implements IOdontologoService {

    private static final Logger logger = Logger.getLogger(OdontologoService.class);
    @Autowired
    private IOdontologoRepository odontologoRepository;
    @Autowired
    ObjectMapper mapper;

    private void guardarOdontologo(OdontologoDTO odontologoDTO) {
        Odontologo odontologo = mapper.convertValue(odontologoDTO, Odontologo .class);
        odontologoRepository.save(odontologo);
    }

    @Override
    public void crearOdontologo(OdontologoDTO odontologoDTO) throws BadRequestException {
        logger.info("Creando Odontologo...");
        guardarOdontologo(odontologoDTO);
    }

    @Override
    public OdontologoDTO leerOdontologo(Long id) {
        logger.info("Buscando odontologo por ID...");
        Optional<Odontologo> odontologo = odontologoRepository.findById(id);
        OdontologoDTO odontologoDTO = null;
        if(odontologo.isPresent()){
            logger.info("Odontologo encontrado con el ID: " + id);
            odontologoDTO = mapper.convertValue(odontologo, OdontologoDTO.class);
        }
        return odontologoDTO;
    }

    @Override
    public void modificarOdontologo(OdontologoDTO odontologoDTO) {
        logger.info("Actualizando Odontologo: " + odontologoDTO);
        guardarOdontologo(odontologoDTO);
    }

    @Override
    public void eliminarOdontologo(Long id) {
        logger.info("Odontologo con ID: " + id + " eliminando.");
        odontologoRepository.deleteById(id);
    }

    @Override
    public Set<OdontologoDTO> listarTodos() {
        List<Odontologo> odontologos = odontologoRepository.findAll();
        Set<OdontologoDTO> odontologosDTO = new HashSet<>();
        for (Odontologo odontologo : odontologos){
            odontologosDTO.add(mapper.convertValue(odontologo, OdontologoDTO.class));
        }
        logger.info("lista de odontologos.");
        return odontologosDTO;
    }
}

package com.dh.ClinicaDefinitivo.service.impl;
import com.dh.ClinicaDefinitivo.entity.dto.OdontologoDTO;
import com.dh.ClinicaDefinitivo.service.IOdontologoService;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OdontologoServiceTest {

    @Autowired
    private IOdontologoService odontologoService;

    @Test
    public void crearOdontologoTest() {


        OdontologoDTO odontologoDTO = new OdontologoDTO();

        odontologoDTO.setApellido("Perez");
        odontologoDTO.setMatricula(123);
        odontologoDTO.setNombre("Agustin");

        odontologoService.crearOdontologo(odontologoDTO);
        Assert.assertNotNull(odontologoDTO);
    }
}
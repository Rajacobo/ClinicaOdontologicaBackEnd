package com.dh.ClinicaDefinitivo.entity.dto;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.Date;

@Getter
@Setter
@ToString
public class PacienteDTO {
    private Long id;
    private String nombre;
    private String apellido;
    private int dni;
    private String FechaIngreso;
}

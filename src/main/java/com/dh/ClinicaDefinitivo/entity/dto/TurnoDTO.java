package com.dh.ClinicaDefinitivo.entity.dto;
import com.dh.ClinicaDefinitivo.entity.Odontologo;
import com.dh.ClinicaDefinitivo.entity.Paciente;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.Date;

@Getter
@Setter
@ToString
public class TurnoDTO {
    private long id;
    private Date fecha;
    private Odontologo odontologo;
    private Paciente paciente;

}

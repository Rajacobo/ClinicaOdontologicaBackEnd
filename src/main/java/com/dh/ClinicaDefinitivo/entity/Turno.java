package com.dh.ClinicaDefinitivo.entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Builder
@Entity
@Table(name = "Turnos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Turno {
    @Id
    @SequenceGenerator(name = "turno_sequence", sequenceName = "turno_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "turno_sequence")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "paciente_id", nullable = false)
    private Paciente paciente;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "odontologo_id", nullable = false)
    private Odontologo odontologo;
    private Date fecha;
}

package com.dh.ClinicaDefinitivo.entity;
import jakarta.persistence.*;
import lombok.*;

@Builder
@Entity
@Table(name = "Domicilios")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Domicilio {

    @Id
    @SequenceGenerator(name = "domicilio_sequence", sequenceName = "domicilio_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "domicilio_sequence")
    private Long id;
    private String calle;
    private Integer numero;
    private String localidad;
    private String provincia;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;
}
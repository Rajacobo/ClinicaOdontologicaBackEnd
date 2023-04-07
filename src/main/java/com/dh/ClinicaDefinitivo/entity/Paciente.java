package com.dh.ClinicaDefinitivo.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;


import java.util.HashSet;
import java.util.Set;
@Builder
@Entity
@Table(name = "Pacientes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Paciente {
    @Id
    @SequenceGenerator(name = "paciente_sequence", sequenceName = "paciente_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "paciente_sequence")
    private Long id;
    private String nombre;
    private String apellido;
    private int dni;
    private String fechaIngreso;

    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Turno> turnos = new HashSet<>();

    @OneToMany(mappedBy = "paciente", fetch = FetchType.LAZY)
    private Set<Domicilio> domicilios = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "odontologo_id")
    private Odontologo odontologo;
}

package com.dh.ClinicaDefinitivo.repository;

import com.dh.ClinicaDefinitivo.entity.Odontologo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOdontologoRepository extends JpaRepository<Odontologo, Long> {

}

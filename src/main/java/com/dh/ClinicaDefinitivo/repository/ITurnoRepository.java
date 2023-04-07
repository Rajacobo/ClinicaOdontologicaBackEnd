package com.dh.ClinicaDefinitivo.repository;
import com.dh.ClinicaDefinitivo.entity.Turno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITurnoRepository extends JpaRepository<Turno, Long> {

}

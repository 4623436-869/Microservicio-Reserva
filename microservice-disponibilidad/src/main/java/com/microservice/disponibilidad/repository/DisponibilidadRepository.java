package com.microservice.disponibilidad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.microservice.disponibilidad.entity.Disponibilidad;

@Repository
public interface DisponibilidadRepository extends JpaRepository<Disponibilidad,Long> {
}

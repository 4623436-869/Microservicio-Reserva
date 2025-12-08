package com.microservice.disponibilidad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.microservice.disponibilidad.entity.Excepcion_Disponibilidad;

@Repository
public interface Excepcion_DisponibilidadRepository extends JpaRepository<Excepcion_Disponibilidad,Long> {
}

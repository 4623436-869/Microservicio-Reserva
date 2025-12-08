package com.microservice.disponibilidad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.microservice.disponibilidad.entity.Bloqueo_Temporal;

@Repository
public interface Bloqueo_TemporalRepository extends JpaRepository<Bloqueo_Temporal,Long> {
}

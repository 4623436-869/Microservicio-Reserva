package com.microservice.disponibilidad.service;

import com.microservice.disponibilidad.entity.Bloqueo_Temporal;

import java.util.List;
import java.util.Optional;

public interface Bloqueo_TemporalService {
    Bloqueo_Temporal create(Bloqueo_Temporal c);
    Bloqueo_Temporal update(Bloqueo_Temporal c);
    void delete(Long id);
    Optional<Bloqueo_Temporal> read(Long id);
    List<Bloqueo_Temporal> readAll();
}

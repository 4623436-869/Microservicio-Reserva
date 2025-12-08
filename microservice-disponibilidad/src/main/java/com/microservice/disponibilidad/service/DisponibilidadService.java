package com.microservice.disponibilidad.service;

import com.microservice.disponibilidad.entity.Disponibilidad;

import java.util.List;
import java.util.Optional;

public interface DisponibilidadService {
    Disponibilidad create(Disponibilidad c);
    Disponibilidad update(Disponibilidad c);
    void delete(Long id);
    Optional<Disponibilidad> read(Long id);
    List<Disponibilidad> readAll();
}

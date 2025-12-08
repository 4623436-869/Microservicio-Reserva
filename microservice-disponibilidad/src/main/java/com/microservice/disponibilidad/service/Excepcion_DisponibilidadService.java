package com.microservice.disponibilidad.service;

import com.microservice.disponibilidad.entity.Excepcion_Disponibilidad;

import java.util.List;
import java.util.Optional;

public interface Excepcion_DisponibilidadService {
    Excepcion_Disponibilidad create(Excepcion_Disponibilidad c);
    Excepcion_Disponibilidad update(Excepcion_Disponibilidad c);
    void delete(Long id);
    Optional<Excepcion_Disponibilidad> read(Long id);
    List<Excepcion_Disponibilidad> readAll();
}

package com.microservice.recursos.service;

import com.microservice.recursos.entity.Recurso;

import java.util.List;
import java.util.Optional;

public interface RecursoService {
    Recurso create(Recurso c);
    Recurso update(Recurso c);
    void delete(Long id);
    Optional<Recurso> read(Long id);
    List<Recurso> readAll();
}
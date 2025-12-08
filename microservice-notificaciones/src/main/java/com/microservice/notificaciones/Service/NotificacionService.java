package com.microservice.notificaciones.Service;

import com.microservice.notificaciones.Entity.Notificacion;

import java.util.List;
import java.util.Optional;

public interface NotificacionService {
    Notificacion save(Notificacion notificacion);
    List<Notificacion> findAll();
    Optional<Notificacion> findById(Long id);
    Notificacion update(Notificacion notificacion);
    void delete(Long id);
}

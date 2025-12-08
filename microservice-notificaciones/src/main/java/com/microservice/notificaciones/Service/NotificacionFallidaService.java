package com.microservice.notificaciones.Service;

import com.microservice.notificaciones.Entity.NotificacionFallida;

import java.util.List;
import java.util.Optional;

public interface NotificacionFallidaService {

    NotificacionFallida save(NotificacionFallida notificacionFallida);

    List<NotificacionFallida> findAll();

    Optional<NotificacionFallida> findById(Long id);

    NotificacionFallida update(NotificacionFallida notificacionFallida);

    void delete(Long id);
}



package com.microservice.notificaciones.Service;

import com.microservice.notificaciones.Entity.NotificacionPlantilla;

import java.util.List;
import java.util.Optional;

public interface NotificacionPlantillaService {
    NotificacionPlantilla save(NotificacionPlantilla plantilla);
    List<NotificacionPlantilla> findAll();
    Optional<NotificacionPlantilla> findById(Long id);
    NotificacionPlantilla update(NotificacionPlantilla plantilla);
    void delete(Long id);
}


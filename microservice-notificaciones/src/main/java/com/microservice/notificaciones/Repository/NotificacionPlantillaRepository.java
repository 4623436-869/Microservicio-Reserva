package com.microservice.notificaciones.Repository;

import com.microservice.notificaciones.Entity.NotificacionPlantilla;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificacionPlantillaRepository extends JpaRepository<NotificacionPlantilla, Long> {
}

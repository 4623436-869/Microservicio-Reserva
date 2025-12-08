package com.microservice.notificaciones.Repository;

import com.microservice.notificaciones.Entity.NotificacionFallida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificacionFallidaRepository extends JpaRepository<NotificacionFallida, Long> {
}


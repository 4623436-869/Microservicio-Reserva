package com.microservice.notificaciones.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "notificacion_fallidas")
public class NotificacionFallida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "destinatario")
    private String destinatario;

    private LocalDateTime fechaFallo;

    @Column(name = "motivoFallo")
    private String motivoFallo;

    @Column(name = "payloadOriginal")
    private String payloadOriginal;

    @Column(name = "tipo")
    private String tipo;

    public NotificacionFallida() {
        this.fechaFallo = LocalDateTime.now();
    }
}

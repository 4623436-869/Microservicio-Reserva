package com.microservice.notificaciones.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@Table(name = "notificaciones")
public class Notificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "asunto")
    private String asunto;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "destinatario")
    private String destinatario;

    @Column(name = "estado")
    private String estado;

    private LocalDateTime fechaEnvio;

    @Column(name = "mensaje")
    private String mensaje;

    @Column(name = "tipo")
    private String tipo;


}

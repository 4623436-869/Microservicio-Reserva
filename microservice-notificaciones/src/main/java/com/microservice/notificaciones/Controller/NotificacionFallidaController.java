package com.microservice.notificaciones.Controller;

import com.microservice.notificaciones.Entity.NotificacionFallida;
import com.microservice.notificaciones.Service.NotificacionFallidaService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/notificacion-fallidas")
public class NotificacionFallidaController {

    private final NotificacionFallidaService service;

    public NotificacionFallidaController(NotificacionFallidaService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<NotificacionFallida>> findAll() {
        try {
            List<NotificacionFallida> list = service.findAll();
            if (list.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(list, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<NotificacionFallida> save(@Valid @RequestBody NotificacionFallida notificacionFallida) {
        try {
            NotificacionFallida nf = service.save(notificacionFallida);
            return new ResponseEntity<>(nf, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<NotificacionFallida> findById(@PathVariable("id") Long id) {
        try {
            Optional<NotificacionFallida> nf = service.findById(id);
            if (nf.isPresent()) {
                return new ResponseEntity<>(nf.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id, @Valid @RequestBody NotificacionFallida notificacionFallida) {
        try {
            Optional<NotificacionFallida> existing = service.findById(id);
            if (existing.isPresent()) {
                notificacionFallida.setId(id);
                NotificacionFallida updated = service.update(notificacionFallida);
                return new ResponseEntity<>(updated, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable("id") Long id) {
        try {
            service.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

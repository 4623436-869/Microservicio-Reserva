package com.microservice.notificaciones.Controller;

import com.microservice.notificaciones.Entity.NotificacionPlantilla;
import com.microservice.notificaciones.Service.NotificacionPlantillaService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/notificacion-plantillas")
public class NotificacionPlantillaController {

    private final NotificacionPlantillaService service;

    public NotificacionPlantillaController(NotificacionPlantillaService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<NotificacionPlantilla>> findAll() {
        try {
            List<NotificacionPlantilla> list = service.findAll();
            if (list.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(list, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<NotificacionPlantilla> save(@Valid @RequestBody NotificacionPlantilla plantilla) {
        try {
            NotificacionPlantilla saved = service.save(plantilla);
            return new ResponseEntity<>(saved, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<NotificacionPlantilla> findById(@PathVariable("id") Long id) {
        try {
            Optional<NotificacionPlantilla> plantilla = service.findById(id);
            if (plantilla.isPresent()) {
                return new ResponseEntity<>(plantilla.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id, @Valid @RequestBody NotificacionPlantilla plantilla) {
        try {
            Optional<NotificacionPlantilla> existing = service.findById(id);
            if (existing.isPresent()) {
                plantilla.setId(id);
                NotificacionPlantilla updated = service.update(plantilla);
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


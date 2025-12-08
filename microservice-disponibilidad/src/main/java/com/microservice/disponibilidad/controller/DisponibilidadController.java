package com.microservice.disponibilidad.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import com.microservice.disponibilidad.entity.Disponibilidad;
import com.microservice.disponibilidad.service.DisponibilidadService;

@RestController
@RequestMapping("/api/disponibilidades")
public class DisponibilidadController {
    @Autowired
    private DisponibilidadService disponibilidadService;

    @GetMapping
    public ResponseEntity<List<Disponibilidad>> readAll(){
        try {
            List<Disponibilidad> disponibilidads = disponibilidadService.readAll();
            if(disponibilidads.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(disponibilidads, HttpStatus.OK);
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @PostMapping
    public ResponseEntity<Disponibilidad> crear(@Valid @RequestBody Disponibilidad cat){
        try {
            Disponibilidad c = disponibilidadService.create(cat);
            return new ResponseEntity<>(c, HttpStatus.CREATED);
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @GetMapping("/{id}")
    public ResponseEntity<Disponibilidad> getDisponibilidadId(@PathVariable("id") Long id){
        try {
            Disponibilidad c = disponibilidadService.read(id).get();
            return new ResponseEntity<>(c, HttpStatus.CREATED);
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Disponibilidad> delDisponibilidad(@PathVariable("id") Long id){
        try {
            disponibilidadService.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @PutMapping("/{id}")
    public ResponseEntity<?> updateDisponibilidad(@PathVariable("id") Long id, @Valid @RequestBody Disponibilidad cat){

        Optional<Disponibilidad> c = disponibilidadService.read(id);
        if(c.isEmpty()) {
            return new ResponseEntity<>(disponibilidadService.update(cat), HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

    }
}

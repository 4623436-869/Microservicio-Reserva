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
import com.microservice.disponibilidad.entity.Bloqueo_Temporal;
import com.microservice.disponibilidad.service.Bloqueo_TemporalService;

@RestController
@RequestMapping("/api/Bloqueo_Temporals")
public class Bloqueo_TemporalController {
    @Autowired
    private Bloqueo_TemporalService bloqueo_temporalService;

    @GetMapping
    public ResponseEntity<List<Bloqueo_Temporal>> readAll(){
        try {
            List<Bloqueo_Temporal> bloqueo_temporals = bloqueo_temporalService.readAll();
            if(bloqueo_temporals.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(bloqueo_temporals, HttpStatus.OK);
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @PostMapping
    public ResponseEntity<Bloqueo_Temporal> crear(@Valid @RequestBody Bloqueo_Temporal cat){
        try {
            Bloqueo_Temporal c = bloqueo_temporalService.create(cat);
            return new ResponseEntity<>(c, HttpStatus.CREATED);
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @GetMapping("/{id}")
    public ResponseEntity<Bloqueo_Temporal> getBloqueo_TemporalId(@PathVariable("id") Long id){
        try {
            Bloqueo_Temporal c = bloqueo_temporalService.read(id).get();
            return new ResponseEntity<>(c, HttpStatus.CREATED);
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Bloqueo_Temporal> delBloqueo_Temporal(@PathVariable("id") Long id){
        try {
            bloqueo_temporalService.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @PutMapping("/{id}")
    public ResponseEntity<?> updateBloqueo_Temporal(@PathVariable("id") Long id, @Valid @RequestBody Bloqueo_Temporal cat){

        Optional<Bloqueo_Temporal> c = bloqueo_temporalService.read(id);
        if(c.isEmpty()) {
            return new ResponseEntity<>(bloqueo_temporalService.update(cat), HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

    }
}

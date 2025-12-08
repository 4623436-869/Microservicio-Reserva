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
import com.microservice.disponibilidad.entity.Excepcion_Disponibilidad;
import com.microservice.disponibilidad.service.Excepcion_DisponibilidadService;

@RestController
@RequestMapping("/api/excepcion_disponibilidades")
public class Excepcion_DisponibilidadController {
    @Autowired
    private Excepcion_DisponibilidadService excepcion_disponibilidadService;

    @GetMapping
    public ResponseEntity<List<Excepcion_Disponibilidad>> readAll(){
        try {
            List<Excepcion_Disponibilidad> excepcion_disponibilidads = excepcion_disponibilidadService.readAll();
            if(excepcion_disponibilidads.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(excepcion_disponibilidads, HttpStatus.OK);
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @PostMapping
    public ResponseEntity<Excepcion_Disponibilidad> crear(@Valid @RequestBody Excepcion_Disponibilidad cat){
        try {
            Excepcion_Disponibilidad c = excepcion_disponibilidadService.create(cat);
            return new ResponseEntity<>(c, HttpStatus.CREATED);
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @GetMapping("/{id}")
    public ResponseEntity<Excepcion_Disponibilidad> getExcepcion_DisponibilidadId(@PathVariable("id") Long id){
        try {
            Excepcion_Disponibilidad c = excepcion_disponibilidadService.read(id).get();
            return new ResponseEntity<>(c, HttpStatus.CREATED);
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Excepcion_Disponibilidad> delExcepcion_Disponibilidad(@PathVariable("id") Long id){
        try {
            excepcion_disponibilidadService.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @PutMapping("/{id}")
    public ResponseEntity<?> updateExcepcion_Disponibilidad(@PathVariable("id") Long id, @Valid @RequestBody Excepcion_Disponibilidad cat){

        Optional<Excepcion_Disponibilidad> c = excepcion_disponibilidadService.read(id);
        if(c.isEmpty()) {
            return new ResponseEntity<>(excepcion_disponibilidadService.update(cat), HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

    }
}

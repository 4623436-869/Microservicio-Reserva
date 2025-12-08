package com.microservice.reserva.controller;

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
import com.microservice.reserva.entity.Reserva;
import com.microservice.reserva.service.ReservaService;

@RestController
@RequestMapping("/api/reservas")
public class ReservaController {
	@Autowired
	private ReservaService reservaService;

	@GetMapping
	public ResponseEntity<List<Reserva>> readAll(){
		try {
			List<Reserva> Reservas = reservaService.readAll();
			if(Reservas.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(Reservas, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	@PostMapping
	public ResponseEntity<Reserva> crear(@Valid @RequestBody Reserva cat){
		try {
			Reserva c = reservaService.create(cat);
			return new ResponseEntity<>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	@GetMapping("/{id}")
	public ResponseEntity<Reserva> getReservaId(@PathVariable("id") Long id){
		try {
			Reserva c = reservaService.read(id).get();
			return new ResponseEntity<>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Reserva> delReserva(@PathVariable("id") Long id){
		try {
			reservaService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	@PutMapping("/{id}")
	public ResponseEntity<?> updateReserva(@PathVariable("id") Long id, @Valid @RequestBody Reserva cat){

		Optional<Reserva> c = reservaService.read(id);
		if(c.isEmpty()) {
			return new ResponseEntity<>(reservaService.update(cat), HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}

	}
}
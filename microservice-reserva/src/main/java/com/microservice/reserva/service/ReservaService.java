package com.microservice.reserva.service;

import java.util.List;
import java.util.Optional;

import com.microservice.reserva.entity.Reserva;

public interface ReservaService {
	Reserva create(Reserva c);
	Reserva update(Reserva c);
	void delete(Long id);
	Optional<Reserva> read(Long id);
	List<Reserva> readAll();
}

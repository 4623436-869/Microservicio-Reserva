package com.microservice.reserva.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.microservice.reserva.dao.ReservaDao;
import com.microservice.reserva.entity.Reserva;
import com.microservice.reserva.repository.ReservaRepository;
@Component
public class ReservaDaoImpl implements ReservaDao {

	@Autowired
	private ReservaRepository reservaRepository;
	
	@Override
	public Reserva create(Reserva c) {
		// TODO Auto-generated method stub
		return reservaRepository.save(c);
	}

	@Override
	public Reserva update(Reserva c) {
		// TODO Auto-generated method stub
		return reservaRepository.save(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		reservaRepository.deleteById(id);
	}

	@Override
	public Optional<Reserva> read(Long id) {
		// TODO Auto-generated method stub
		return reservaRepository.findById(id);
	}

	@Override
	public List<Reserva> readAll() {
		// TODO Auto-generated method stub
		return reservaRepository.findAll();
	}

}

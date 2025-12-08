package com.microservice.reserva.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.reserva.dao.ReservaDao;
import com.microservice.reserva.entity.Reserva;
import com.microservice.reserva.service.ReservaService;
@Service
public class
ReservaServiceImpl implements ReservaService {

	@Autowired
	private ReservaDao dao;
	
	@Override
	public Reserva create(Reserva c) {
		// TODO Auto-generated method stub
		return dao.create(c);
	}

	@Override
	public Reserva update(Reserva c) {
		// TODO Auto-generated method stub
		return dao.update(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Reserva> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Reserva> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}

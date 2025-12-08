package com.microservice.disponibilidad.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.microservice.disponibilidad.entity.Disponibilidad;
import com.microservice.disponibilidad.repository.DisponibilidadRepository;
import com.microservice.disponibilidad.service.DisponibilidadService;

import java.util.List;
import java.util.Optional;

@Service
public class DisponibilidadServiceImpl implements DisponibilidadService {

    @Autowired
    private DisponibilidadRepository disponibilidadRepository;

    @Override
    public Disponibilidad create(Disponibilidad c) {
        return disponibilidadRepository.save(c);
    }

    @Override
    public Disponibilidad update(Disponibilidad c) {
        return disponibilidadRepository.save(c);
    }

    @Override
    public void delete(Long id) {
        disponibilidadRepository.deleteById(id);
    }

    @Override
    public Optional<Disponibilidad> read(Long id) {
        return disponibilidadRepository.findById(id);
    }

    @Override
    public List<Disponibilidad> readAll() {
        return disponibilidadRepository.findAll();
    }
}

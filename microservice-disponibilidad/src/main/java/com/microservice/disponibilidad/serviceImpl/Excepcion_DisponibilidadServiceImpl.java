package com.microservice.disponibilidad.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.microservice.disponibilidad.entity.Excepcion_Disponibilidad;
import com.microservice.disponibilidad.repository.Excepcion_DisponibilidadRepository;
import com.microservice.disponibilidad.service.Excepcion_DisponibilidadService;

import java.util.List;
import java.util.Optional;

@Service
public class Excepcion_DisponibilidadServiceImpl implements Excepcion_DisponibilidadService {

    @Autowired
    private Excepcion_DisponibilidadRepository excepcion_disponibilidadRepository;

    @Override
    public Excepcion_Disponibilidad create(Excepcion_Disponibilidad c) {
        return excepcion_disponibilidadRepository.save(c);
    }

    @Override
    public Excepcion_Disponibilidad update(Excepcion_Disponibilidad c) {
        return excepcion_disponibilidadRepository.save(c);
    }

    @Override
    public void delete(Long id) {
        excepcion_disponibilidadRepository.deleteById(id);
    }

    @Override
    public Optional<Excepcion_Disponibilidad> read(Long id) {
        return excepcion_disponibilidadRepository.findById(id);
    }

    @Override
    public List<Excepcion_Disponibilidad> readAll() {
        return excepcion_disponibilidadRepository.findAll();
    }
}

package com.microservice.disponibilidad.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.microservice.disponibilidad.entity.Bloqueo_Temporal;
import com.microservice.disponibilidad.repository.Bloqueo_TemporalRepository;
import com.microservice.disponibilidad.service.Bloqueo_TemporalService;

import java.util.List;
import java.util.Optional;

@Service
public class Bloqueo_TemporalServiceImpl implements Bloqueo_TemporalService {

    @Autowired
    private Bloqueo_TemporalRepository bloqueo_temporalRepository;

    @Override
    public Bloqueo_Temporal create(Bloqueo_Temporal c) {
        return bloqueo_temporalRepository.save(c);
    }

    @Override
    public Bloqueo_Temporal update(Bloqueo_Temporal c) {
        return bloqueo_temporalRepository.save(c);
    }

    @Override
    public void delete(Long id) {
        bloqueo_temporalRepository.deleteById(id);
    }

    @Override
    public Optional<Bloqueo_Temporal> read(Long id) {
        return bloqueo_temporalRepository.findById(id);
    }

    @Override
    public List<Bloqueo_Temporal> readAll() {
        return bloqueo_temporalRepository.findAll();
    }
}

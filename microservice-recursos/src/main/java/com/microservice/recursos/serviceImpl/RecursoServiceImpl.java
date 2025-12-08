package com.microservice.recursos.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.microservice.recursos.entity.Recurso;
import com.microservice.recursos.repository.RecursoRepository;
import com.microservice.recursos.service.RecursoService;

import java.util.List;
import java.util.Optional;

@Service
public class
RecursoServiceImpl implements RecursoService {

    @Autowired
    private RecursoRepository recursoRepository;

    @Override
    public Recurso create(Recurso c) {
        return recursoRepository.save(c);
    }

    @Override
    public Recurso update(Recurso c) {
        return recursoRepository.save(c);
    }

    @Override
    public void delete(Long id) {
        recursoRepository.deleteById(id);
    }

    @Override
    public Optional<Recurso> read(Long id) {
        return recursoRepository.findById(id);
    }

    @Override
    public List<Recurso> readAll() {
        return recursoRepository.findAll();
    }
}
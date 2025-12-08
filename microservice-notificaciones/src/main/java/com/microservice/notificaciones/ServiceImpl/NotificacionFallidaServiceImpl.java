package com.microservice.notificaciones.ServiceImpl;

import com.microservice.notificaciones.Entity.NotificacionFallida;
import com.microservice.notificaciones.Repository.NotificacionFallidaRepository;
import com.microservice.notificaciones.Service.NotificacionFallidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotificacionFallidaServiceImpl implements NotificacionFallidaService {

    @Autowired
    private NotificacionFallidaRepository repository;

    @Override
    public NotificacionFallida save(NotificacionFallida notificacionFallida) {
        return repository.save(notificacionFallida);
    }

    @Override
    public List<NotificacionFallida> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<NotificacionFallida> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public NotificacionFallida update(NotificacionFallida notificacionFallida) {
        return repository.save(notificacionFallida);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}


package com.microservice.notificaciones.ServiceImpl;

import com.microservice.notificaciones.Entity.NotificacionPlantilla;
import com.microservice.notificaciones.Repository.NotificacionPlantillaRepository;
import com.microservice.notificaciones.Service.NotificacionPlantillaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotificacionPlantillaServiceImpl implements NotificacionPlantillaService {

    @Autowired
    private NotificacionPlantillaRepository repository;

    @Override
    public NotificacionPlantilla save(NotificacionPlantilla plantilla) {
        return repository.save(plantilla);
    }

    @Override
    public List<NotificacionPlantilla> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<NotificacionPlantilla> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public NotificacionPlantilla update(NotificacionPlantilla plantilla) {
        return repository.save(plantilla);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}

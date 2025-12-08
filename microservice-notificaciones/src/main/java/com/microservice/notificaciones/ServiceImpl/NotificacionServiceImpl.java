package com.microservice.notificaciones.ServiceImpl;

import com.microservice.notificaciones.Entity.Notificacion;
import com.microservice.notificaciones.Repository.NotificacionRepository;
import com.microservice.notificaciones.Service.NotificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotificacionServiceImpl implements NotificacionService {

    @Autowired
    private NotificacionRepository repository;

    @Override
    public Notificacion save(Notificacion notificacion) {
        return repository.save(notificacion);
    }

    @Override
    public List<Notificacion> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Notificacion> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Notificacion update(Notificacion notificacion) {
        // Para actualizar, se espera que el objeto ya tenga el ID seteado
        return repository.save(notificacion);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}

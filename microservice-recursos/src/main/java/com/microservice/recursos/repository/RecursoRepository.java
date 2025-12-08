package com.microservice.recursos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.microservice.recursos.entity.Recurso;

public interface RecursoRepository extends JpaRepository<Recurso
        , Long> {
}

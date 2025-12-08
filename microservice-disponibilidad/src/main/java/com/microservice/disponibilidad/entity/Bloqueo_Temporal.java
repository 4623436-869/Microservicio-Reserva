package com.microservice.disponibilidad.entity;
import java.util.Date;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="bloqueo_temporales")
public class Bloqueo_Temporal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="id_recurso")
    private int id_recurso;
    @Column(name="fecha_inicio")
    private Date fecha_inicio;
    @Column(name="fecha_fin")
    private Date fecha_fin;
    @Column(name="razon")
    private String razon;
    @Column(name="creado_por")
    private String creado_por;
    @Column(name="creado_en")
    private Date creado_en;
    @Column(name="actualizado_en")
    private Date actualizado_en;
}

package com.microservice.reserva.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name="reservas")
public class Reserva {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;

	@Column(name="usuario_id")
	private Long usuarioId;

	@Column(name="recurso_id")
	private Long recursoId;

	@Column(name="fecha_inicio")
	private String fechaInicio;

	@Column(name="fecha_fin")
	private String fechaFin;

	@Column(name="estado")
	private String estado;

	@Column(name="fecha_creacion")
	private String fechaCreacion;

	@Column(name="fecha_modificacion")
	private String fechaModificacion;
}

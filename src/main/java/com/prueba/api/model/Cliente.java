package com.prueba.api.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Data;

@Schema
@Data
@Entity(name="cliente")
@Table(name="cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idCliente",nullable = false, unique = true)
    private long idCliente;

    @Schema(description = "Data correspondiente a la persona")
    @OneToOne
    @JoinColumn(name="idPersona")
    Persona persona;

    private String contrasena;
    private int estado;

}

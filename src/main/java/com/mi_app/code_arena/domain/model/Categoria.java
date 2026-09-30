package com.mi_app.code_arena.domain.model;

import com.mi_app.code_arena.domain.exception.InvalidDataEnterException;
import lombok.*;



public class Categoria {
    private Long id;
    private String nombre;

    public Categoria(Long id, String nombre){
        if (nombre == null || nombre.isBlank())
            throw new InvalidDataEnterException("Name is required!");
        this.id = id;
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Long getId() {
        return id;
    }
}
/*
crear por defecto en bd las categorias :
    Backend.
    Frontend.
    Bases de datos.
    Algoritmos.
    Testing.
    DevOps.
    Seguridad.
 */

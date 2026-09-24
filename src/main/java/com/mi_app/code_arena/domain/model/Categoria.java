package com.mi_app.code_arena.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @Builder @AllArgsConstructor @NoArgsConstructor
public class Categoria {
    private Integer id;
    private String nombre;
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

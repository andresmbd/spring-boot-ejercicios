package com.mi_app.code_arena.domain.model;

import com.mi_app.code_arena.shared.enums.Dificultad;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data @Builder @AllArgsConstructor @NoArgsConstructor
public class Reto {
    private Integer id;
    private String titulo;
    private String descripcion;
    private Dificultad dificultad;
    private Categoria categoria;
    private Integer experienciaOtorgada;
    private LocalDate fechaCreacion;
    private LocalDate fechaLimite;
    private Boolean estado;
}

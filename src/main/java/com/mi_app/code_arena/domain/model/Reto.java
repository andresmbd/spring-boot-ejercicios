package com.mi_app.code_arena.domain.model;

import com.mi_app.code_arena.shared.enums.Dificultad;
import lombok.*;

import java.time.LocalDate;

@Setter
@Getter @Builder @AllArgsConstructor @NoArgsConstructor
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

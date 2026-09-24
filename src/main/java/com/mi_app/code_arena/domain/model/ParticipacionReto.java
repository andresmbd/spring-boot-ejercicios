package com.mi_app.code_arena.domain.model;

import com.mi_app.code_arena.shared.enums.Estado;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class ParticipacionReto {
    private Integer id;
    private Usuario usuario;
    private Reto reto;
    private LocalDate fechaInicio;
    private LocalDate fechaEntrega;
    private Estado estado;
    private Boolean solucionEnviada;
    private Integer experienciaObtenida;
}

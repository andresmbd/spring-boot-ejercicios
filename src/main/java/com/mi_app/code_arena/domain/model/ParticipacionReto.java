package com.mi_app.code_arena.domain.model;

import com.mi_app.code_arena.shared.enums.Estado;
import lombok.*;

import java.time.LocalDate;

@Setter
@Getter @Builder @NoArgsConstructor @AllArgsConstructor
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

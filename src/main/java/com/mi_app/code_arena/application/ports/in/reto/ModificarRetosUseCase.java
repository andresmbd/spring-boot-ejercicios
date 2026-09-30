package com.mi_app.code_arena.application.ports.in.reto;

import com.mi_app.code_arena.domain.model.Reto;

public interface ModificarRetosUseCase {
    Reto modificarReto(Reto reto);
    void modificarEstadoReto(Reto reto, Boolean estadoReto);
}

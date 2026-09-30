package com.mi_app.code_arena.application.ports.in.categoria;

import com.mi_app.code_arena.domain.model.Categoria;

import java.util.List;
import java.util.Optional;

public interface ConsultarCategoriaUseCase {
    Optional<Categoria> buscarPorId(Long id);
    List<Categoria> listarTodas();
}

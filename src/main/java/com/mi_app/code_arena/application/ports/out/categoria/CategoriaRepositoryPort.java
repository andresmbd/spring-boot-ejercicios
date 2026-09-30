package com.mi_app.code_arena.application.ports.out.categoria;

import com.mi_app.code_arena.domain.model.Categoria;

import java.util.List;
import java.util.Optional;

public interface CategoriaRepositoryPort {
    Categoria guardar(Categoria categoria);
    Optional<Categoria> buscarPorId(Long id);
    List<Categoria> buscarTodas();
    boolean existePorNombre(String nombre);
}

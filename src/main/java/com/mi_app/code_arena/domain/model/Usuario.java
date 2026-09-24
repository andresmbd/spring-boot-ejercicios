package com.mi_app.code_arena.domain.model;

import com.mi_app.code_arena.shared.enums.Rol;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @Builder @AllArgsConstructor @NoArgsConstructor
public class Usuario {
    private Integer id;
    private  String nombre;
    private String username;
    private String correoElectronico;
    private String contrasena;
    private Rol rol;
    private Integer nivel;
    private Integer experienciaAcomulada;
    private Boolean estado;

}

package com.mi_app.code_arena.domain.model;

import com.mi_app.code_arena.shared.enums.Nivel;
import com.mi_app.code_arena.shared.enums.Rol;
import lombok.*;

@Setter @Getter
@Builder @AllArgsConstructor @NoArgsConstructor
public class Usuario {
    private Integer id;
    private  String nombre;
    private String username;
    private String correoElectronico;
    private String contrasena;
    private Rol rol;
    private Nivel nivel;
    private Integer experienciaAcumulada;
    private Boolean estado;
}

CREATE TYPE rol_enum AS ENUM ('ADMIN', 'PLAYER');
CREATE TYPE dificultad_enum AS ENUM ('EASY', 'MEDIUM', 'HARD', 'LEGENDARY');
CREATE TYPE estado_enum AS ENUM ('ACCEPTED', 'IN_PROGRESS', 'SUBMITTED', 'APPROVED', 'REJECTED');

CREATE TABLE usuario (
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    username VARCHAR(50) NOT NULL UNIQUE,
    correo_electronico VARCHAR(150) NOT NULL UNIQUE,
    contrasena VARCHAR(255) NOT NULL,
    rol rol_enum NOT NULL DEFAULT 'PLAYER',
    nivel INT NOT NULL DEFAULT 1,
    experiencia_acumulada INT NOT NULL DEFAULT 0,
    estado BOOLEAN NOT NULL DEFAULT TRUE
);

CREATE TABLE reto (
    id SERIAL PRIMARY KEY,
    titulo VARCHAR(150) NOT NULL,
    descripcion TEXT,
    dificultad dificultad_enum NOT NULL,
    id_categoria INT NOT NULL,
    experiencia_otorgada INT NOT NULL DEFAULT 0,
    fecha_creacion DATE NOT NULL DEFAULT CURRENT_DATE,
    fecha_limite DATE,
    estado BOOLEAN NOT NULL DEFAULT TRUE,

	FOREIGN KEY (id_categoria) REFERENCES categoria(id),
	CONSTRAINT uq_reto_fecha UNIQUE(id, fecha_limite)
);


CREATE TABLE categoria(
	id SERIAL PRIMARY KEY,
	nombre VARCHAR (255) NOT NULL
);



CREATE TABLE participacion_reto (
    id SERIAL PRIMARY KEY,
    usuario_id INT NOT NULL,
    reto_id INT NOT NULL,
    fecha_inicio DATE NOT NULL DEFAULT CURRENT_DATE,
    fecha_entrega DATE,
    estado estado_enum NOT NULL DEFAULT 'IN_PROGRESS',
    solucion_enviada BOOLEAN NOT NULL DEFAULT FALSE,
    experiencia_obtenida INT DEFAULT 0,
	reto_fecha_limite DATE,

	-- validacion de tanto usuario como reto existan
    CONSTRAINT fk_participacion_usuario FOREIGN KEY (usuario_id) REFERENCES usuario(id) ON DELETE CASCADE,
    CONSTRAINT fk_reto_fecha_lim FOREIGN KEY (reto_id, reto_fecha_limite) REFERENCES reto(id) ON DELETE CASCADE,
    
    CONSTRAINT uq_usuario_reto UNIQUE (usuario_id, reto_id)
	CONSTRAINT chk_fecha_no_vencida CHECK (reto_fecha_limite >= CURRENT_DATE)
);

CREATE UNIQUE INDEX uq_participacion_active 
ON participacion_reto(usuario_id, reto_id)
WHERE (estado = 'IN_PROGRESS');





INSERT INTO categoria(nombre) VALUES 
	('Backend'),
	('Frontend'),
	('Bases de datos'),
	('Algoritmos'),
	('Testing'),
	('DevOps'),
	('Seguridad');
-- Crear la base de datos
CREATE DATABASE escuela;
drop database escuela;
-- Eliminar la base de datos si es necesario (opcional)
-- DROP DATABASE escuela;

-- Usar la base de datos
USE escuela;

-- Consulta en las tablas (si ya existen)
-- SELECT * FROM estudiante;
-- SELECT * FROM curso;

-- Crear la tabla estudiante
CREATE TABLE estudiante (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(255) NOT NULL,
    primer_apellido VARCHAR(255) NOT NULL,
    segundo_apellido VARCHAR(255) NOT NULL,
    correo VARCHAR(255) UNIQUE NOT NULL,
    telefono VARCHAR(20),
    creado_en DATETIME DEFAULT CURRENT_TIMESTAMP,
    actualizado_en DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);
select * from estudiante;

-- Crear la tabla curso
CREATE TABLE curso (
    id INT PRIMARY KEY AUTO_INCREMENT,
    estudiante_id BIGINT,
    codigo_curso VARCHAR(10) NOT NULL,
    nombre VARCHAR(50) NOT NULL,
    descripcion VARCHAR(100),
    fecha_inicio DATE NOT NULL,
    fecha_fin DATE,
    creditos INT,
    creado_en DATETIME DEFAULT CURRENT_TIMESTAMP,
    actualizado_en DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (estudiante_id) REFERENCES estudiante(id)
);

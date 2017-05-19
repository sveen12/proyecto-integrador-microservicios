-- CREATE TABLE person (
-- 	id BIGINT NOT NULL AUTO_INCREMENT,
-- 	first_name varchar(255) NOT NULL,
-- 	last_name varchar(255) NOT NULL,
-- 	PRIMARY KEY (id)
-- );
-- 
-- insert into person (first_name, last_name) values ('Yuan', 'Ji');

CREATE TABLE empleado (
  documento VARCHAR(20) NOT NULL,
  direccion VARCHAR(45) NULL DEFAULT NULL,
  nombres VARCHAR(45) NULL DEFAULT NULL,
  apellidos VARCHAR(45) NULL DEFAULT NULL,
  telefono VARCHAR(45) NULL DEFAULT NULL,
  usuario VARCHAR(45) NULL DEFAULT NULL,
  contrasena VARCHAR(45) NULL DEFAULT NULL,
    PRIMARY KEY (documento)
);
INSERT INTO empleado VALUES ('94120805244', 'Calle 9', 'Juan','Marinilla', '2929292', 'enfermero1', '2214325');
INSERT INTO empleado VALUES ('98121915219', 'Calle 12', 'Maria','del Pilar', '2989181', 'administrador1', '2214325');
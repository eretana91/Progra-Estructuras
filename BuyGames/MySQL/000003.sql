CREATE TABLE usuarios (
     id MEDIUMINT NOT NULL AUTO_INCREMENT,
     nombre CHAR(30) NOT NULL, 
     apellido CHAR(30) NOT NULL,
     correo CHAR(30) NOT NULL,
     direccion CHAR(30) NOT NULL,
     cedula CHAR(30) NOT NULL,
     telefono CHAR(30) NOT NULL,
     PRIMARY KEY (id)
);
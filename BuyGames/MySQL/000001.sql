CREATE TABLE usuarios (
     id MEDIUMINT NOT NULL AUTO_INCREMENT,
     usuario CHAR(30) NOT NULL, 
     clave BLOB(45) NOT NULL,
     PRIMARY KEY (id)
);
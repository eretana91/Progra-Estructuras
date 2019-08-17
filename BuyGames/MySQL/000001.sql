CREATE TABLE `buygames`.`clientes` (
  `idcliente` INT NOT NULL,
  `nombre` VARCHAR(15) NOT NULL,
  `apellido` VARCHAR(15) NOT NULL,
  `correo` VARCHAR(30) NOT NULL,
  `direccion` VARCHAR(100) NOT NULL,
  `cedula` VARCHAR(15) NOT NULL,
  `telefono` VARCHAR(15) NOT NULL,
  PRIMARY KEY (`idcliente`));
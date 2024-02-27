## PROYECTO PARA PRUEBA DE LA UNIVERSIDAD DISTRITAL ##

Este es un proyecto de demostración de una API RestFul que maneja facturas, es desarrollado en Java utilizando Spring Boot, Thymeleaf, JPA y bootstrap.

------------------------------------------------------
## TECNOLOGÍAS UTILIZADAS ##

Java
Spring Boot
Hibernate
Thymeleaf 
JPA
MySQL 
Bootstrap

------------------------------------------------------
## FUNCIONALIDADES ##

Crear y leer facturas desde la Api RestFul.
Obtener facturas desde el controlador que muestra los datos en una tabla, para que los usuarios puedan verla.

------------------------------------------------------
## CREACIÓN DEL DATABASE EN MYSQL ##

NOTA: El usuario definido es el "root", y tiene una contraseña "admin", si no cambia esta configuración desde el application.properties, se reconmienda ajustar el usuario desde el motor de base de datos, para que quede de al siguiente forma: usuario es "root", y tiene una contraseña "admin".

CREATE DATABASE UNIVERSIDAD_DISTRITAL_UNO;

USE UNIVERSIDAD_DISTRITAL_UNO;

CREATE TABLE UNIVERSIDAD_DISTRITAL_UNO.CLIENTES (
  `IDCLIENTE` BIGINT(20) AUTO_INCREMENT PRIMARY KEY NOT NULL,
  `NOMBRE` VARCHAR(150) NULL DEFAULT NULL,
  `EMAIL` VARCHAR(150) NULL DEFAULT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin;

INSERT INTO UNIVERSIDAD_DISTRITAL_UNO.CLIENTES (NOMBRE,EMAIL) VALUES ('JULIAN AVELLA','julianavella01@gmail.com');

CREATE TABLE UNIVERSIDAD_DISTRITAL_UNO.FACTURAS (
  `IDFACTURA` BIGINT(20) AUTO_INCREMENT PRIMARY KEY NOT NULL,
  `IDCLIENTE` BIGINT(20) NOT NULL,
  `TOTAL` INT NOT NULL,
  `DATE` DATE NOT NULL,
  FOREIGN KEY (`IDCLIENTE`) REFERENCES `UNIVERSIDAD_DISTRITAL_UNO`.`CLIENTES` (`IDCLIENTE`)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin;

CREATE TABLE UNIVERSIDAD_DISTRITAL_UNO.PRODUCTOS (
  `IDPRODUCTO` BIGINT(20) AUTO_INCREMENT PRIMARY KEY NOT NULL,
  `NOMBREPRODUCTO` VARCHAR(255) NULL DEFAULT NULL,
  `DESCRIPCION` VARCHAR(255) NULL DEFAULT NULL,
  `PRECIOUNITARIO` INT NOT NULL,
  `CANTIDADEXISTENCIA` INT(11) NULL DEFAULT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin;

INSERT INTO UNIVERSIDAD_DISTRITAL_UNO.PRODUCTOS (NOMBREPRODUCTO,DESCRIPCION,PRECIOUNITARIO,CANTIDADEXISTENCIA) VALUES
('Diccionario','Explica el significado de palabras','5000','120'),
('Cuaderno','Es un cuadriculado, 100 hojas','3000','220'),
('Esfero','Tinta negra, bic','1500','300')

CREATE TABLE UNIVERSIDAD_DISTRITAL_UNO.DETALLE_FACTURAS (
  `IDDETALLEFACTURA` BIGINT(20) AUTO_INCREMENT PRIMARY KEY NOT NULL,
  `IDFACTURA` BIGINT(20) NOT NULL,
  `IDPRODUCTO` BIGINT(20) NOT NULL,
  `CANTIDADPRODUCTOS` BIGINT(20) NOT NULL,
  foreign key (`IDFACTURA`) references `UNIVERSIDAD_DISTRITAL_UNO`.`FACTURAS`  (`IDFACTURA`),
  FOREIGN KEY (`IDPRODUCTO`) REFERENCES `UNIVERSIDAD_DISTRITAL_UNO`.`PRODUCTOS` (`IDPRODUCTO`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin;

------------------------------------------------------
## USO DE LOS ENDPOINTS ##

1. Es una petición get, "http://localhost:8080/v1/facturas", sirve para obtener en un json todas las cabezeras de las facturas.
2. Es una petición post, "http://localhost:8080/v1/facturas/facturasProductos", sirve para guardar los datos de la cebezera y sus productos relacionados, los datos se envian en forma de JSON;
{
  "factura": {
    "idCliente": 1,
    "total": 730,
    "date": "2024-02-27"
  },
  "productos": [
    {
      "idProducto": 3,
      "cantidadProductos": 7
    },
    {
      "idProducto": 1,
      "cantidadProductos": 6
    }
  ]
}
3. Es una petición get, "http://localhost:8080", sirve para ver desde un navegador, en una tabla los datos más relevantes de cada factura.
------------------------------------------------------

### Iniciar la aplicación 
Asegurarse de tener
Java 11 + 

### Agregar la configuración de la base en applicacitons.properties 
This step is necessary

/src/main/resources/application.properties

Actualiza las siguientes propiedades 

* url 
* username 
* password

#### Ejecutalo
usar mvn para ejecutar

Windows example:

    mvnw.cmd spring-boot:run

Unix based:

    mvwn spring-boot:run 

Entrar a localhost:8080







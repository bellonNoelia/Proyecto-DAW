-- MySQL Script generated by MySQL Workbench
-- Tue Sep 27 18:17:30 2022

-- -----------------------------------------------------
 -- DROP DATABASE photoraw;
CREATE DATABASE IF NOT EXISTS photoraw;
USE photoraw;

-- -----------------------------------------------------
-- Table ROL
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS rol (
  id INT NOT NULL PRIMARY KEY,
  rol VARCHAR(45) NOT NULL
);

INSERT INTO rol 
VALUES (1,'Fotógrafo'),
(2,'Cliente');

-- -----------------------------------------------------
-- Table IMAGEN
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS img (
id INT auto_increment NOT NULL PRIMARY KEY,
img blob NOT NULL);
INSERT into img
VALUES(1,LOAD_FILE('C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/avatar/1.png'));

-- -----------------------------------------------------
-- Table USUARIO
DROP TABLE user;
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS user (
  id INT auto_increment NOT NULL PRIMARY KEY,
  avatar blob ,
  user_name VARCHAR(45) NOT NULL,
  user_lastname VARCHAR(45) NOT NULL,
  user_password VARCHAR(45) NOT NULL,
  user_email VARCHAR(45) NOT NULL unique,
  user_age INT NOT NULL,
  rol_id INT NOT NULL,
  CONSTRAINT fk_user_rol FOREIGN KEY (rol_id) REFERENCES rol (id) 
  ON UPDATE NO ACTION
  ON DELETE NO ACTION
 );
INSERT INTO user
VALUES(5,load_file("C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/avatar/1.png"),"Sofía","Soto","12345","sofias@gmail.com",36,1);

-- -----------------------------------------------------
-- Table CATEGORIA
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS category (
  id INT NOT NULL PRIMARY KEY,
  category VARCHAR(45) NOT NULL
);

INSERT INTO category
VALUES (1,'Artística'),
(2,'Arquitectura'),
(3,'Autor'),
(4,'Retrato'),
(5,'Surrealista'),
(6,'Paisajes'),
(7,'Aérea'),
(8,'Deportes'),
(9,'Abstracta'),
(10,'Gastronómica'),
(11,'Naturaleza'),
(12,'Animales'),
(13,'Macrogotografía'),
(14,'Moda'),
(15,'Viajes')
;


-- -----------------------------------------------------
-- Table PHOTO
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS photo (
  id INT auto_increment NOT NULL PRIMARY KEY,
  photo_name VARCHAR(45) NOT NULL,
  photo_price VARCHAR(45) NOT NULL,
  photo_size VARCHAR(45) NULL,
  photo BLOB NOT NULL,
  user_id INT NOT NULL,
  category_id INT NOT NULL,
  CONSTRAINT fk_user_id FOREIGN KEY (user_id) REFERENCES user (id) 
  ON UPDATE CASCADE
  ON DELETE CASCADE,
  CONSTRAINT fk_category_id FOREIGN KEY (category_id) REFERENCES category (id) 
  ON UPDATE CASCADE
  ON DELETE CASCADE
 );

-- -----------------------------------------------------
-- Table STOCK
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS STOCK (
id INT NOT NULL PRIMARY KEY,
photo_id int,
stock INT unsigned NOT null,
CONSTRAINT fk_photo_id FOREIGN KEY (photo_id) REFERENCES photo (id) 
);

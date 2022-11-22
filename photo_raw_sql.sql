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
  rol_id INT NOT NULL PRIMARY KEY,
  rol VARCHAR(45) NOT NULL
);


-- -----------------------------------------------------
-- Table USUARIO
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS user (
  user_id INT auto_increment NOT NULL PRIMARY KEY,
  avatar blob ,
  user_name VARCHAR(45) NOT NULL,
  user_lastname VARCHAR(45) NOT NULL,
  user_password VARCHAR(45) NOT NULL,
  user_email VARCHAR(45) NOT NULL,
  user_age INT NOT NULL,
  rol_cod INT NOT NULL,
  CONSTRAINT fk_user_rol FOREIGN KEY (rol_cod) REFERENCES rol (rol_id) 
  ON UPDATE CASCADE
  ON DELETE CASCADE
 );


-- -----------------------------------------------------
-- Table PHOTO
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS photo (
  photo_id INT NOT NULL PRIMARY KEY,
  photo_name VARCHAR(45) NOT NULL,
  photo_price VARCHAR(45) NOT NULL,
  photo_size VARCHAR(45) NULL,
  photo BLOB NOT NULL,
  user_cod INT NOT NULL,
    CONSTRAINT fk_user_id FOREIGN KEY (user_cod) REFERENCES user (user_id) 
  ON UPDATE CASCADE
  ON DELETE CASCADE
 );




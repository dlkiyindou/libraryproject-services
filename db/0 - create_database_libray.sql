CREATE DATABASE IF NOT EXISTS `library`;

DROP TABLE IF EXISTS `address`;
DROP TABLE IF EXISTS `bank_account`;
DROP TABLE IF EXISTS `hibernate_sequence`;
DROP TABLE IF EXISTS `user`;

CREATE TABLE `address` (
    id BIGINT NOT NULL auto_increment,
    date_creation DATETIME DEFAULT CURRENT_TIMESTAMP,
    date_update DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    city VARCHAR(255),
    `number` INTEGER,
    street_name VARCHAR(255),
    zip_code VARCHAR(255),
    PRIMARY KEY (id)
)  ENGINE=INNODB;

CREATE TABLE `bank_account` (
    id BIGINT NOT NULL auto_increment,
    date_creation DATETIME DEFAULT CURRENT_TIMESTAMP,
    date_update DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    account_number VARCHAR(255),
    agency_code SMALLINT,
    bank_code SMALLINT,
    bic VARCHAR(255),
    country_code VARCHAR(255),
    `key` SMALLINT,
    user_id BIGINT,
    PRIMARY KEY (id)
)  ENGINE=INNODB;

CREATE TABLE `hibernate_sequence` (
    next_val BIGINT
)  ENGINE=INNODB;

INSERT INTO hibernate_sequence values ( 1 );
INSERT INTO hibernate_sequence values ( 1 );
INSERT INTO hibernate_sequence values ( 1 );

CREATE TABLE `user` (
    id BIGINT NOT NULL auto_increment,
    date_creation DATETIME DEFAULT CURRENT_TIMESTAMP,
    date_update DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    birthday DATE,
    email VARCHAR(255),
    firstname VARCHAR(255),
    lastname VARCHAR(255),
    phone VARCHAR(255),
    ADDress_id BIGINT,
    PRIMARY KEY (id)
)  ENGINE=INNODB;

ALTER TABLE bank_account ADD CONSTRAINT FK92iik4jwhk7q385jubl2bc2mm FOREIGN KEY (user_id) references `user` (id);
ALTER TABLE `user` ADD CONSTRAINT FKddefmvbrws3hvl5t0hnnsv8ox FOREIGN KEY (ADDress_id) references ADDress (id);

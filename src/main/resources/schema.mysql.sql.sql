CREATE DATABASE hellogwt;
USE hellogwt;

CREATE TABLE IF NOT EXISTS greetings (
    id INT NOT NULL AUTO_INCREMENT,
    author VARCHAR(30),
    text VARCHAR(50),
    PRIMARY KEY (id)
);


CREATE DATABASE airport;

USE airport;
CREATE TABLE pilots(
pilot_id INT NOT NULL,
first_name VARCHAR(255),
last_name VARCHAR(255),
rank VARCHAR(255),
nickname VARCHAR(255) UNIQUE,
PRIMARY KEY (pilot_id)
);

CREATE TABLE aircraft(
plane_id INT NOT NULL,
brand VARCHAR(255),
model VARCHAR(255),
passenger_capacity INT,
board INT UNIQUE NOT NULL,
PRIMARY KEY (plane_id)
);

CREATE TABLE flights(
id INT UNIQUE NOT NULL PRIMARY KEY,
plane_id INT REFERENCES aircraft(plane_id),
pilot_id INT REFERENCES pilots(pilot_id),
flight_date DATE NOT NULL,
flight_time TIME NOT NULL,
flight_number VARCHAR(255) NOT NULL UNIQUE
);

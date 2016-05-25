CREATE TABLE person (
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
	first_name VARCHAR(255) NOT NULL,
	last_name VARCHAR(255) NOT NULL
);

INSERT INTO person (first_name, last_name) VALUES ('Foo', 'Bar');
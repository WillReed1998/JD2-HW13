CREATE TABLE clients (
                         id BIGINT AUTO_INCREMENT PRIMARY KEY,
                         name VARCHAR(200)
);

CREATE TABLE planets (
                         id VARCHAR(50) PRIMARY KEY,
                         name VARCHAR(500)
);

CREATE TABLE tickets (
                         id BIGINT AUTO_INCREMENT PRIMARY KEY,
                         created_at TIMESTAMP,
                         client_id BIGINT,
                         from_planet_id VARCHAR(50),
                         to_planet_id VARCHAR(50),
                         FOREIGN KEY (client_id) REFERENCES clients (id),
                         FOREIGN KEY (from_planet_id) REFERENCES planets (id),
                         FOREIGN KEY (to_planet_id) REFERENCES planets (id)
);

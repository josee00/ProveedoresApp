CREATE DATABASE Test;

USE Test;

CREATE TABLE IF NOT EXISTS proveedores (
    id_proveedor INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255),
    fecha_alta DATE,
    id_cliente INT
);

INSERT INTO proveedores (nombre, fecha_alta, id_cliente) VALUES 
('Coca-cola', '2024-01-01', 1),
('Pepsi', '2024-01-01', 2),
('Redbull', '2024-01-01', 3),
('Fanta', '2024-01-01', 4),
('Casera', '2024-01-01', 5),
('Trina', '2024-01-01', 6);
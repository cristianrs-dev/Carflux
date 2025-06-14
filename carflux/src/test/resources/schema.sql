CREATE TABLE tb_veiculo (
    codigo_veiculo INT AUTO_INCREMENT PRIMARY KEY,
    marca VARCHAR(255),
    modelo VARCHAR(255),
    ano INT,
    cor VARCHAR(255),
    km DOUBLE,
    combustivel VARCHAR(255),
    cambio VARCHAR(255),
    preco DOUBLE
);

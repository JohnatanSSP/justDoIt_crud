-- V1_criar_tabela_evento.sql

CREATE TABLE Negotiation (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,   -- identificador único
    time TIMESTAMP NOT NULL,                -- data/hora da negociação
    name VARCHAR(100) NOT NULL,             -- nome ou descrição
    amount DECIMAL(15,2) NOT NULL,          -- valor da negociação
    type VARCHAR(20) NOT NULL,              -- tipo (ex: "compra", "venda", "transferência")
    status VARCHAR(20) NOT NULL             -- status (ex: "pendente", "concluído", "cancelado")
);



CREATE TABLE ENDERECO(
    _id INT NOT NULL AUTO_INCREMENT,
    endereco_rua VARCHAR(50) NOT NULL,
    endereco_num INT NOT NULL,
    endereco_comp VARCHAR(100),
    endereco_bairro VARCHAR(50) NOT NULL,
    endereco_cep VARCHAR(10) NOT NULL,
    endereco_cidade VARCHAR(50) NOT NULL,
    endereco_uf VARCHAR(2) NOT NULL,
    PRIMARY KEY(_id)
);

CREATE TABLE USUARIO(
    _id INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    data_nascimento DATE NOT NULL,
    endereco_id INT NOT NULL,
    telefone_celular VARCHAR(15) NOT NULL,
    telefone_residencial VARCHAR(14),
    email VARCHAR(100) NOT NULL,
    PRIMARY KEY(_id),
    FOREIGN KEY(endereco_id) REFERENCES ENDERECO(_id)
);
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

CREATE TABLE TELEFONE(
    _id INT NOT NULL AUTO_INCREMENT,
    telefone_celular VARCHAR(15) NOT NULL,
    telefone_residencial VARCHAR(15),
    telefone_comercial VARCHAR(15),
    telefone_recados VARCHAR(15),
    PRIMARY KEY(_id)
);

CREATE TABLE CLIENTE(
    _id INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    cpf VARCHAR(14) NOT NULL,
    data_nascimento DATE NOT NULL,
    endereco_id INT NOT NULL,
    telefone_id INT NOT NULL,
    email VARCHAR(100) NOT NULL,
    PRIMARY KEY(_id),
    FOREIGN KEY(endereco_id) REFERENCES ENDERECO(_id),
    FOREIGN KEY(telefone_id) REFERENCES TELEFONE(_id)
);

CREATE TABLE FORNECEDOR(
    _id INT NOT NULL AUTO_INCREMENT,
    razao_social VARCHAR(400) NOT NULL,
    nome_fantasia VARCHAR(400) NOT NULL,
    cnpj VARCHAR(18) NOT NULL,
    endereco_id INT NOT NULL,
    telefone_id INT NOT NULL,
    email VARCHAR(100) NOT NULL,
    PRIMARY KEY(_id),
    FOREIGN KEY(endereco_id) REFERENCES ENDERECO(_id),
    FOREIGN KEY(telefone_id) REFERENCES TELEFONE(_id)
);

CREATE TABLE PRODUTO(
    _id INT NOT NULL AUTO_INCREMENT,
    descricao VARCHAR(500) NOT NULL,
    fornecedor_id INT NOT NULL,
    quantidade INT NOT NULL,
    preco DOUBLE NOT NULL,
    status BOOLEAN NOT NULL,
    PRIMARY KEY(_id),
    FOREIGN KEY(fornecedor_id) REFERENCES FORNECEDOR(_id)
);

CREATE TABLE PEDIDO(
    _id INT NOT NULL AUTO_INCREMENT,
    item_pedido_id VARCHAR(500) NOT NULL,
    total DOUBLE NOT NULL,
    data_pedido DATE NOT NULL,
    PRIMARY KEY(_id)
);

CREATE TABLE ITEM_PEDIDO(
    _id INT NOT NULL AUTO_INCREMENT,
    produto_id INT NOT NULL,
    quantidade INT NOT NULL,
    subtotal DOUBLE NOT NULL,
    PRIMARY KEY(_id),
    FOREIGN KEY(produto_id) REFERENCES PRODUTO(_id)
);

CREATE TABLE VENDA_FINAL(
    _id INT NOT NULL AUTO_INCREMENT,
    pedido_id INT NOT NULL,
    cliente_id INT,
    total DOUBLE NOT NULL,
    desconto DOUBLE NOT NULL,
    valor_pago DOUBLE NOT NULL,
    valor_troco DOUBLE NOT NULL,
    data_venda DATE NOT NULL,
    forma_pagamento VARCHAR(100) NOT NULL,
    quantidade_parcela INT NOT NULL,
    valor_parcela DOUBLE NOT NULL,
    PRIMARY KEY(_id),
    FOREIGN KEY(pedido_id) REFERENCES PEDIDO(_id),
    FOREIGN KEY(cliente_id) REFERENCES CLIENTE(_id)
);
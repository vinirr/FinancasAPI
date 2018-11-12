CREATE TABLE pessoa (
  id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
  nome VARCHAR(255) NOT NULL,
  logradouro VARCHAR(255),
  numero INTEGER,
  complemento VARCHAR(255),
  bairro VARCHAR(255),
  cep VARCHAR(255),
  cidade VARCHAR(255),
  estado CHAR(2),
  ativo BOOLEAN NOT NULL

) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo) VALUES (
  'João',
  'testLogradouro',
  '23',
  'testComplemento',
  'testBairro',
  '72500432',
  'Águas Claras',
  'DF',
  1
);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo) VALUES (
  'Maria',
  'testLogradouro',
  '23',
  'testComplemento',
  'testBairro',
  '72500432',
  'Águas Claras',
  'DF',
  1
);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo) VALUES (
  'Pedro',
  'testLogradouro',
  '23',
  'testComplemento',
  'testBairro',
  '72500432',
  'Águas Claras',
  'DF',
  1
);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo) VALUES (
  'Marcos',
  'testLogradouro',
  '23',
  'testComplemento',
  'testBairro',
  '72500432',
  'Águas Claras',
  'DF',
  1
);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo) VALUES (
  'Bruno',
  'testLogradouro',
  '23',
  'testComplemento',
  'testBairro',
  '72500432',
  'Águas Claras',
  'DF',
  1
);
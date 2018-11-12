CREATE TABLE lancamento (
  id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
  descricao varchar(50) NOT NULL,
  data_vencimento DATE NOT NULL,
  data_pagamento DATE,
  valor DECIMAL(10,2) NOT NULL,
  observacao VARCHAR(200),
  tipo VARCHAR(20) NOT NULL,
  categoria_id BIGINT(20) NOT NULL,
  pessoa_id BIGINT(20) NOT NULL,
  FOREIGN KEY (categoria_id) REFERENCES categoria(id),
  FOREIGN KEY (pessoa_id) REFERENCES pessoa(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO lancamento (descricao, data_vencimento, data_pagamento, valor, observacao, tipo, categoria_id, pessoa_id)
VALUES ('Salário mensal', '2017-06-10', null, 6500.00, 'Distribuição de lucros', 'RECEITA', 1, 1);

INSERT INTO lancamento (descricao, data_vencimento, data_pagamento, valor, observacao, tipo, categoria_id, pessoa_id)
VALUES ('Bahamas', '2017-08-15', null, 132.58, null, 'DESPESA', 2, 2);

INSERT INTO lancamento (descricao, data_vencimento, data_pagamento, valor, observacao, tipo, categoria_id, pessoa_id)
VALUES ('Top Club', '2017-09-25', null, 256.95, null, 'DESPESA', 3, 3);

INSERT INTO lancamento (descricao, data_vencimento, data_pagamento, valor, observacao, tipo, categoria_id, pessoa_id)
VALUES ('Extra', '2017-11-25', null, 658.00, null, 'RECEITA', 4, 4);

INSERT INTO lancamento (descricao, data_vencimento, data_pagamento, valor, observacao, tipo, categoria_id, pessoa_id)
VALUES ('Café', '2017-12-25', null, 10.00, null, 'DESPESA', 5, 5);
/*  1) carlos.benigno@escolar.ifrn.edu.br
    2) CARLOS BENIGNO NETO */

/* 3) */
INSERT INTO pessoa (nome, email, cpf, dt_nasc, endereco, telefone) 
VALUES 
('Pedro I', 'pp@email.com', '002', 10-01-1479, 'R. Vasco', NULL),
('Pedro II', 'ps@email.com', '003', '1516-02-10', 'R. Flamengo', '5501'), 
('D João VI', 'dj@email.com', '001', '1415-12-01', 'R. Portugal', NULL),
('JJ Xavier', 'jj@email.com', '004', '1746-11-12', 'R. Minas', '5502');

/* 4) */
INSERT INTO paciente(cpf_pessoa, senha, plano_saude) VALUES
('002', 'senha1', '0'),
('003', 'senha2', '1');

/* 5) */
INSERT INTO medico (cpf_pessoa, crm) VALUES 
('001', '111'),
('004', '112');

/* 6) */
INSERT INTO especialidade (descricao)
VALUES (
    'Pediatra'
  ), (
    'Pediatra'
  ), (
    'Cardiologista'
  ), (
    'Ortopedista'
  );

/* 7) */
INSERT INTO medico_especialidade (cpf_medico, id_especialidade) 
VALUES  ('001', '1')
        ('004', '2')
        ('004', '3');

/* 8) */
INSERT INTO agendamento VALUES
('002', '001', '1782-04-14 16:00:00', '1782-03-14 10:04:45', 80.0),
('002', '004', '1782-04-15 10:00:00', '1782-03-14 10:04:45', 100.0),
('002', '004', '1783-05-17 08:00:00', '1783-05-10 16:32:00', 100.0),
('003', '001', '1783-05-17 08:30:00', '1783-05-09 09:05:56', 0);


/* 9) */
UPDATE pessoa 
SET dt_nasc = '1416-12-01' 
WHERE cpf = '001';

/* 10 */

UPDATE pessoa 
SET telefone = '5503',
    email = 'pf@email.com'
WHERE cpf = '002';

/* 11) */
UPDATE pessoa
SET telefone = '9' || telefone
WHERE telefone IS NOT NULL;

/* 12) */
UPDATE agendamento
SET dh_consulta = dh_consulta + INTERVAL '2 day',
    valor_consulta = 150
WHERE DATE(dh_consulta) = '1783-05-17';

/* 13) */
UPDATE medico_especialidade
SET id_especialidade = 4
WHERE cpf_medico = '004' AND id_especialidade = 3;

/* 14) */
DELETE FROM agendamento
WHERE DATE(dh_consulta) = '1783-05-17' AND cpf_paciente = '002';

/* 15) */
DELETE FROM agendamento
WHERE valor_consulta = 0.0 AND cpf_paciente = '001';

/* 16) */
DELETE FROM paciente
WHERE plano_saude = '1' OR telefone = NULL;

/* 17) */
DELETE FROM pessoa
WHERE cpf = '004';
/*  1) carlos.benigno@escolar.ifrn.edu.br
    2) CARLOS BENIGNO NETO */

/* 3) */
SELECT * FROM pessoa;

/* 4) */
SELECT nome, email, dt_nasc
FROM pessoa;

/* 5) */
SELECT nome, email, dt_nasc
FROM pessoa
ORDER BY cpf  
LIMIT 6 OFFSET 2;

/* 6) */
SELECT nome, email, EXTRACT(YEAR FROM AGE(CURRENT_DATE, dt_nasc)) AS idade
FROM pessoa;

/* 7) */
SELECT COUNT(*)
FROM agendamento

/* 9) */
SELECT pessoa.nome, paciente.cpf_pessoa, pessoa.email
FROM paciente
JOIN pessoa ON paciente.cpf_pessoa = pessoa.cpf
WHERE plano_saude = '0';

/* 11) */
SELECT  paciente.cpf_pessoa, pessoa.nome, pessoa.email
FROM paciente
JOIN pessoa ON paciente.cpf_pessoa = pessoa.cpf
WHERE telefone IS NULL;

/* 12) */
SELECT DATE(dh_consulta)
FROM agendamento
WHERE valor_consulta >= 50 AND valor_consulta <= 100;

/* 14) */
SELECT paciente.cpf_pessoa, pessoa.nome, pessoa.email, pessoa.dt_nasc
FROM paciente
JOIN pessoa ON paciente.cpf_pessoa = pessoa.cpf
ORDER BY dt_nasc;

/* 15 */
SELECT COUNT(*)
FROM paciente
WHERE plano_saude = '0';

/* 16) */
SELECT DATE(dh_consulta) AS data_consulta,
       MAX(valor_consulta) AS maior_valor,
       MIN(valor_consulta) AS menor_valor
FROM agendamento
GROUP BY DATE(dh_consulta)
ORDER BY data_consulta;

/* 19) */
SELECT pessoa.nome, pessoa.email, medico.cpf_pessoa AS cpf_medico, especialidade.descricao
FROM medico
JOIN pessoa ON medico.cpf_pessoa = pessoa.cpf
JOIN medico_especialidade ON medico.cpf_pessoa = medico_especialidade.cpf_medico
JOIN especialidade ON medico_especialidade.id_especialidade = especialidade.id;

/* 20 */
SELECT medico.cpf_pessoa AS cpf_medico, 
       COUNT(agendamento.dh_consulta) AS quantidade_consultas
FROM medico
LEFT JOIN agendamento ON medico.cpf_pessoa = agendamento.cpf_medico
GROUP BY medico.cpf_pessoa

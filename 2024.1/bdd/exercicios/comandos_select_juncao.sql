/*  1) carlos.benigno@escolar.ifrn.edu.br
    2) CARLOS BENIGNO NETO */

/* 3) */
SELECT pessoa.nome, pessoa.email, medico.crm
FROM pessoa
JOIN medico ON pessoa.cpf = medico.cpf_pessoa;

/* 4) */
SELECT pessoa.nome, pessoa.email, paciente.senha
FROM pessoa
JOIN paciente ON pessoa.cpf = paciente.cpf_pessoa;

/* 5) */
SELECT medico.crm, especialidade.descricao
FROM medico_especialidade
JOIN especialidade ON medico_especialidade.id_especialidade = especialidade.id 
JOIN medico ON medico_especialidade.cpf_medico = medico.cpf_pessoa;

/* 6) */
SELECT medico.crm, especialidade.descricao
FROM medico_especialidade
JOIN especialidade ON medico_especialidade.id_especialidade = 3 
JOIN medico ON medico_especialidade.cpf_medico = medico.cpf_pessoa;

/* 7) */

SELECT pessoa.nome, pessoa.cpf, medico.crm, paciente.senha
FROM pessoa
JOIN paciente ON pessoa.cpf = paciente.cpf_pessoa
JOIN medico ON pessoa.cpf = medico.cpf_pessoa

/* 8) */
SELECT pessoa.nome, COUNT(agendamento.dh_consulta) AS quantidade_consultas
FROM medico
JOIN pessoa ON medico.cpf_pessoa = pessoa.cpf
LEFT JOIN agendamento ON medico.cpf_pessoa = agendamento.cpf_medico
GROUP BY pessoa.nome;

/* 9) */
SELECT especialidade.descricao, COUNT(medico_especialidade.cpf_medico) AS quantidade_medicos
FROM especialidade
LEFT JOIN medico_especialidade ON especialidade.id = medico_especialidade.id_especialidade
GROUP BY especialidade.descricao;

/* 10 */
SELECT p_paciente.nome AS nome_paciente, p_paciente.email AS email_paciente, 
       agendamento.dh_consulta, agendamento.valor_consulta, 
       p_medico.nome AS nome_medico, medico.crm
FROM agendamento
JOIN paciente ON agendamento.cpf_paciente = paciente.cpf_pessoa
JOIN pessoa p_paciente ON paciente.cpf_pessoa = p_paciente.cpf
JOIN medico ON agendamento.cpf_medico = medico.cpf_pessoa
JOIN pessoa p_medico ON medico.cpf_pessoa = p_medico.cpf;

/* 11) */
SELECT dh_consulta
FROM agendamento
JOIN medico_especialidade ON agendamento.cpf_medico = medico_especialidade.cpf_medico
WHERE medico_especialidade.id_especialidade = 3;

/* 12) */
SELECT p_medico.nome AS nome_medico, medico.crm, AVG(agendamento.valor_consulta) AS media_valor_consulta
FROM agendamento
JOIN medico ON agendamento.cpf_medico = medico.cpf_pessoa
JOIN pessoa p_medico ON medico.cpf_pessoa = p_medico.cpf
GROUP BY p_medico.nome, medico.crm;

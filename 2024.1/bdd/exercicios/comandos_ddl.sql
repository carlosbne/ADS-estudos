CREATE TABLE pessoa(
    cpf CHAR(11) NOT NULL,
    email VARCHAR(50) NOT NULL,
    nome VARCHAR(150) NOT NULL,
    dt_nasc DATE NOT NULL,
    endereco VARCHAR(300) NOT NULL,
    telefone VARCHAR(15) NULL,
    PRIMARY KEY(cpf),
    UNIQUE(email, nome)
);

CREATE TABLE paciente (
    cpf_pessoa CHAR(11),
    senha VARCHAR(20) NOT NULL,
    plano_saude BOOLEAN NOT NULL,
    PRIMARY KEY(cpf_pessoa),
    FOREIGN KEY (cpf_pessoa) REFERENCES pessoa(cpf_pessoa)
);

CREATE TABLE medico(
    cpf_pessoa CHAR(11),
    crm VARCHAR(10) UNIQUE NOT NULL,
    PRIMARY KEY(cpf_pessoa),
    FOREIGN KEY(cpf_pessoa) REFERENCES pessoa(cpf)
);

CREATE TABLE agendamento(
    cpf_paciente CHAR(11),
    cpf_medico CHAR(11),
    dh_consulta TIMESTAMP,
    dh_agendamento TIMESTAMP NOT NULL,
    valor_consulta FLOAT NOT NULL,
    PRIMARY KEY(dh_consulta),
    FOREIGN KEY(cpf_paciente) REFERENCES paciente(cpf_pessoa),
    FOREIGN KEY(cpf_medico) REFERENCES medico(cpf_pessoa)
);

CREATE TABLE especialidade(
    id INT GENERATED ALWAYS AS IDENTITY,
    descricao VARCHAR(300) NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE medico_especialidade(
    cpf_medico CHAR(11),
    id_especialiade int,
    FOREIGN KEY(cpf_medico) REFERENCES medico(cpf_pessoa),
    FOREIGN KEY(id_especialidade) REFERENCES especialidade(id)
);
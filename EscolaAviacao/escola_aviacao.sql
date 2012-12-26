-- Geração de Modelo físico
-- Sql ANSI 2003 - brModelo.

--creating sequences


  
CREATE SEQUENCE id_cursos
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
  
  CREATE SEQUENCE id_instituicoes
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
  
CREATE SEQUENCE id_avioes
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
    
  CREATE SEQUENCE id_aulas
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
  
CREATE SEQUENCE id_clientes
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
  
  CREATE SEQUENCE id_viagens
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
  
--creating tables

CREATE TABLE Instrutores (
breve integer not null,
 PRIMARY KEY(breve)
);

CREATE TABLE Cursos (
codigo integer not null DEFAULT nextval('id_cursos'::regclass),
nome varchar(50) not null,
PRIMARY KEY(codigo)
);

CREATE TABLE Instituicoes (
codigo integer not null DEFAULT nextval('id_instituicoes'::regclass),
cidade varchar(100) not null,
estado varchar(100) not null,
telefone varchar(50),
nome varchar(50) not null,
PRIMARY KEY(codigo)
);

CREATE TABLE Alunos (
matricula integer not null,
endereco varchar(100) not null,
telefone varchar(50) not null,
tipo_sangue varchar(50),
nome varchar(50) not null,
PRIMARY KEY(matricula)
);

CREATE TABLE Aulas (
codigo integer not null DEFAULT nextval('id_aulas'::regclass),
data date not null,
hora_saida time not null,
hora_chegada time not null,
matricula integer not null,
codigo_avioes integer not null,
breve integer not null,
PRIMARY KEY(codigo),
FOREIGN KEY(matricula) REFERENCES Alunos (matricula),
FOREIGN KEY(breve) REFERENCES Instrutores (breve)
);

CREATE TABLE Avioes (
codigo integer not null DEFAULT nextval('id_avioes'::regclass),
marca varchar(50) not null,
data_manut date not null,
descricao varchar(150) not null,
ano_fab date not null,
PRIMARY KEY(codigo)
);

CREATE TABLE Clientes (
codigo integer not null DEFAULT nextval('id_clientes'::regclass),
nome varchar(50) not null,
endereco varchar(100) not null,
telefone varchar(50) not null,
 PRIMARY KEY(codigo)
);

CREATE TABLE Viagens (
codigo integer not null DEFAULT nextval('id_viagens'::regclass),
data_saida date not null,
data_chegada date not null,
cidade_de varchar(100) not null,
cidade_ate varchar(100) not null,
valor 	REAL not null,
codigo_avioes integer not null,
codigo_clientes integer not null,
PRIMARY KEY(codigo),
FOREIGN KEY(codigo_avioes) REFERENCES Avioes (codigo),
FOREIGN KEY(codigo_clientes) REFERENCES Clientes (codigo)
);

CREATE TABLE Pilotos (
breve integer not null,
endereco varchar(100) not null,
cidade varchar(50) not null,
nome varchar(50) not null,
PRIMARY KEY(breve)
);

CREATE TABLE CursosInstituicoes (
codigo_instituicoes integer not null,
codigo_cursos integer not null,
primary key(codigo_instituicoes,codigo_cursos),
FOREIGN KEY(codigo_instituicoes) REFERENCES Instituicoes (codigo),
FOREIGN KEY(codigo_cursos) REFERENCES Cursos (codigo)
);

CREATE TABLE PilotosViagens (
breve integer not null,
codigo_viagens integer not null,
primary key(breve, codigo_viagens),
FOREIGN KEY(breve) REFERENCES Pilotos (breve),
FOREIGN KEY(codigo_viagens) REFERENCES Viagens (codigo)
);

CREATE TABLE InstrutoresCursos (
data_diploma date not null,
codigo_curso integer not null,
breve integer not null,
primary key (data_diploma, codigo_curso),
FOREIGN KEY(codigo_curso) REFERENCES Cursos (codigo),
FOREIGN KEY(breve) REFERENCES Pilotos (breve)
);

ALTER TABLE Instrutores ADD FOREIGN KEY(breve) REFERENCES Pilotos (breve);
ALTER TABLE Aulas ADD FOREIGN KEY(codigo_avioes) REFERENCES Avioes (codigo);


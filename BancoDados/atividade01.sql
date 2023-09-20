CREATE DATABASE db_rh;
USE db_rh;
CREATE TABLE tb_colaboradores(
id bigint auto_increment,
nome varchar(255) not null,
salario decimal(6,2) not null,
cargo varchar(255) not null,
anoAdmissao int,
primary key(id));
INSERT INTO tb_colaboradores(nome, salario, cargo, anoAdmissao) values ("Adriana", 5000, "recepcionista",2023);
INSERT INTO tb_colaboradores(nome, salario, cargo, anoAdmissao) values ("Carina", 6000, "recrutador",2021);
INSERT INTO tb_colaboradores(nome, salario, cargo, anoAdmissao) values ("Rosangela", 8800, "supervisora",2015);
INSERT INTO tb_colaboradores(nome, salario, cargo, anoAdmissao) values ("Carlos", 6000, "recrutador",2023);
INSERT INTO tb_colaboradores(nome, salario, cargo, anoAdmissao) values ("Sandra", 9900, "gerente",2020);

SELECT * FROM tb_colaboradores;

SELECT nome FROM tb_colaboradores WHERE salario > 2000;

SELECT nome FROM tb_colaboradores WHERE salario < 2000;

UPDATE tb_colaboradores SET salario = 9999 WHERE id = 5;

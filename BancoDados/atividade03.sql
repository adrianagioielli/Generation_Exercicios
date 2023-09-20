CREATE DATABASE db_escola;
USE db_escola;
CREATE TABLE tb_alunos(
id bigint auto_increment,
nome varchar(255) not null,
idade int,
professor varchar(255) not null,
nota decimal(6,2) not null,
primary key(id));
INSERT INTO tb_alunos(nome, idade, professor, nota) values ("Adriana", 10, "Luis Santos", 7.5);
INSERT INTO tb_alunos(nome, idade, professor, nota) values ("Clesio", 10, "Luis Santos", 8.0);
INSERT INTO tb_alunos(nome, idade, professor, nota) values ("Harley", 11, "Aimee Cruz", 6.0);
INSERT INTO tb_alunos(nome, idade, professor, nota) values ("Gustavo", 12, "Aimee Cruz", 6.6);
INSERT INTO tb_alunos(nome, idade, professor, nota) values ("Sandra", 11, "Luis Santos", 5.0);
INSERT INTO tb_alunos(nome, idade, professor, nota) values ("Maurício", 9, "Luis Santos", 9.5);
INSERT INTO tb_alunos(nome, idade, professor, nota) values ("Enzo", 11, "Aimee Cruz", 4.2);
INSERT INTO tb_alunos(nome, idade, professor, nota) values ("Yasmin", 11, "Aimee Cruz", 6.1);

SELECT * FROM tb_alunos;

SELECT nome FROM tb_alunos WHERE nota > 7.0;

SELECT nome FROM tb_alunos WHERE nota < 7.0;

UPDATE tb_alunos SET nota = 5.2 WHERE id = 7;

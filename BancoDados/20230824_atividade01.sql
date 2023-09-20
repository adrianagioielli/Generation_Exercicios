CREATE DATABASE db_generation_game_online;
USE db_generation_game_online;

CREATE TABLE tb_classes(
id bigint auto_increment,
classe varchar(255) not null,
ativo boolean,
primary key (id)
);

CREATE TABLE tb_personagens(
id bigint auto_increment,
nome varchar(255) not null,
nivel_poder int,
forca int,
inteligencia int,
carisma int,
constituicao int,
classes_id bigint not null,
primary key(id),
foreign key(classes_id) references tb_classes(id)
);

INSERT INTO tb_classes(classe, ativo) values ("guerreiro", true);
INSERT INTO tb_classes(classe, ativo) values ("ladrao", true);
INSERT INTO tb_classes(classe, ativo) values ("mago", true);
INSERT INTO tb_classes(classe, ativo) values ("clerigo", true);
INSERT INTO tb_classes(classe, ativo) values ("bardo", true);

SELECT * FROM tb_classes;

INSERT INTO tb_personagens(nome, nivel_poder, forca, inteligencia, carisma, constituicao, classes_id) values ("Aasimar", 1200, 18, 15, 12, 13, 3);
INSERT INTO tb_personagens(nome, nivel_poder, forca, inteligencia, carisma, constituicao, classes_id) values ("Tengu", 2400, 12, 6, 15, 8, 2);
INSERT INTO tb_personagens(nome, nivel_poder, forca, inteligencia, carisma, constituicao, classes_id) values ("Humano", 3200, 12, 23, 12, 14, 4);
INSERT INTO tb_personagens(nome, nivel_poder, forca, inteligencia, carisma, constituicao, classes_id) values ("Elfo", 3200, 14, 21, 18, 11, 5);
INSERT INTO tb_personagens(nome, nivel_poder, forca, inteligencia, carisma, constituicao, classes_id) values ("Goblin", 4800, 8, 16, 5, 15, 3);
INSERT INTO tb_personagens(nome, nivel_poder, forca, inteligencia, carisma, constituicao, classes_id) values ("Anão", 4800, 22, 14, 10, 19, 1);
INSERT INTO tb_personagens(nome, nivel_poder, forca, inteligencia, carisma, constituicao, classes_id) values ("Hafling", 6400, 9, 17, 21, 11, 5);
INSERT INTO tb_personagens(nome, nivel_poder, forca, inteligencia, carisma, constituicao, classes_id) values ("Duegar", 6400, 24, 12, 8, 17, 1);

SELECT * FROM tb_personagens;

SELECT * FROM tb_personagens WHERE nivel_poder > 2000;
SELECT * FROM tb_personagens WHERE nivel_poder BETWEEN 1000 AND 2000;
SELECT * FROM tb_personagens WHERE nome LIKE "%c%";
SELECT * FROM tb_personagens INNER JOIN tb_classes ON tb.classes.id = tb_personagens.classes_id;
SELECT nome, classe FROM tb_personagens INNER JOIN tb_classes ON tb_classes.id = tb_personagens.classes_id WHERE classes_id = 1 ;

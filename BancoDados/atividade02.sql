CREATE DATABASE db_eCommerce;
USE db_produtos;
CREATE TABLE tb_produtos(
id bigint auto_increment,
nome varchar(255) not null,
preco decimal(6,2) not null,
sabor varchar(255) not null,
estoque int,
primary key(id));
INSERT INTO tb_produtos(nome, preco, sabor, estoque) values ("Torta", 25, "limão", 60);
INSERT INTO tb_produtos(nome, preco, sabor, estoque) values ("Torta", 30, "morango", 40);
INSERT INTO tb_produtos(nome, preco, sabor, estoque) values ("Torta", 50, "meio limão meio morango", 30);
INSERT INTO tb_produtos(nome, preco, sabor, estoque) values ("Torta", 25, "maraujá", 20);
INSERT INTO tb_produtos(nome, preco, sabor, estoque) values ("Bolo", 75, "chocolate",120);
INSERT INTO tb_produtos(nome, preco, sabor, estoque) values ("Bolo", 95, "trufado chocolate ao leite", 70);
INSERT INTO tb_produtos(nome, preco, sabor, estoque) values ("Bolo", 95, "morango", 100);
INSERT INTO tb_produtos(nome, preco, sabor, estoque) values ("Bolo", 115, "red velvet", 60);

SELECT * FROM tb_produtos;

SELECT nome FROM tb_produtos WHERE preco > 500;

SELECT nome FROM tb_produtos WHERE preco < 500;

UPDATE tb_produtos SET preco = 35 WHERE id = 3;
CREATE DATABASE db_pizzaria_legal;
USE db_pizzaria_legal;

CREATE TABLE tb_categorias(
id bigint auto_increment,
categoria varchar(25) not null,
disponibilidade boolean,
primary key (id)
);

CREATE TABLE tb_pizzas(
id bigint auto_increment,
sabor varchar(25) not null,
preco int,
tamanho varchar(5),
borda varchar(25),
categoria_id bigint not null,
primary key(id),
foreign key(categoria_id) references tb_categorias(id)
);

INSERT INTO tb_categorias(categoria, disponibilidade) values ("doce", true);
INSERT INTO tb_categorias(categoria, disponibilidade) values ("salgada", true);
INSERT INTO tb_categorias(categoria, disponibilidade) values ("meio doce meio salgada", false);
INSERT INTO tb_categorias(categoria, disponibilidade) values ("meio a meio doce", false);
INSERT INTO tb_categorias(categoria, disponibilidade) values ("meio a meio salgada", false);

SELECT * FROM tb_categorias;

INSERT INTO tb_pizzas(sabor, preco, tamanho, borda, categoria_id) values ("Muçarela", 29.90, "m", "simples", 2);
INSERT INTO tb_pizzas(sabor, preco, tamanho, borda, categoria_id) values ("Calabresa", 34.90, "m", "simples", 2);
INSERT INTO tb_pizzas(sabor, preco, tamanho, borda, categoria_id) values ("Portuguesa", 39.90, "m", "simples", 2);
INSERT INTO tb_pizzas(sabor, preco, tamanho, borda, categoria_id) values ("Tomate seco", 54.90, "m", "simples", 2);
INSERT INTO tb_pizzas(sabor, preco, tamanho, borda, categoria_id) values ("Muçarela", 24.90, "p", "simples", 2);
INSERT INTO tb_pizzas(sabor, preco, tamanho, borda, categoria_id) values ("Calabresa", 29.90, "p", "simples", 2);
INSERT INTO tb_pizzas(sabor, preco, tamanho, borda, categoria_id) values ("Morango com chocolate", 54.90, "p", "simples", 1);
INSERT INTO tb_pizzas(sabor, preco, tamanho, borda, categoria_id) values ("Chocolate", 50.50, "p", "simples", 1);

SELECT * FROM tb_pizzas;

SELECT * FROM tb_pizzas WHERE preco < 45.0;
SELECT * FROM tb_pizzas WHERE preco BETWEEN 50 AND 100;
SELECT * FROM tb_pizzas WHERE sabor LIKE "%m%";
SELECT * FROM tb_pizzas INNER JOIN tb_categorias ON tb_categorias.id = tb_pizzas.categoria_id;
SELECT sabor, categoria_id FROM tb_pizzas INNER JOIN tb_categorias ON tb_categorias.id = tb_pizzas.categoria_id WHERE categoria_id = 1 ;

/*
    Clientes(id, nome)
    Livros (id, titulo, valor)
    Autores(id, nome)
    Autores_livros(id_autor, id_livro)
    Vendas_livros(id, id_livro, qtd, valor_unit)
    Vendas(id, data, id_cliente, id_vendas_livros)
    
*/

create table clientes(
    cod_cliente int primary key auto_increment,
    nome varchar(100) not null 
);

create table livros(
    cod_livro int primary key auto_increment,
    titulo varchar(50) not null,
    valor decimal(12,2) not null
);

create table autores(
    cod_autor int primary key auto_increment,
    nome varchar(100) not null
);


create table autores_livros(
    cod_autores_livro int primary key auto_increment,
    cod_livro int not null,
    cod_autor int not null,
    constraint livros_fk_autores_livros
    foreign key(cod_livro) references livros(cod_livro)
        on delete restrict
        on update cascade,
    constraint autores_fk_autores_livros
    foreign key(cod_autor) references autores(cod_autor) 
        on delete restrict
        on update cascade
);

create table vendas_livros(
    cod_vendas_livro int primary key auto_increment,
    quantidade int not null,
    valor_unit int not null,
    cod_livro int not null,
    constraint livros_fk_vendas_livros
    foreign key(cod_livro) references livros(cod_livro)
        on delete restrict
        on update cascade
);

create table vendas(
    cod_venda int primary key auto_increment,
    data_venda date not null,
    cod_cliente int not null,
    cod_vendas_livro int not null,
    constraint vendas_livros_fk_vendas
    foreign key(cod_vendas_livro) references vendas_livros(cod_vendas_livro)
        on delete restrict
        on update cascade
);

insert into clientes(nome)
values
		('Eduardo'),
        ('Maria'),
        ('Ricardo'),
        ('Paulo'),
        ('Jose')

insert into autores(nome)
values
		('Jonathan'),
        ('Alexandre'),
        ('Darci'),
        ('Raul Seixas'),
        ('Tio Bob')

insert into livros(titulo,valor)
values
		('Código Limpo',62),
        ('Arquitetura limpa',34),
        ('Principios de SOLID',75),
        ('Lidando com SQL',32),
        ('Codificador limpo',42)

insert into autores_livros(cod_autor, cod_livro)
values
		(5,1),
        (4,2),
        (3,3),
        (2,4),
        (1,5)

INSERT INTO vendas_livros (quantidade, valor_unit, cod_livro)
VALUES (3, 20, 1), (2, 15, 2), (1, 10, 3);

INSERT INTO vendas (data_venda, cod_cliente, cod_vendas_livro)
VALUES ('2023-03-22', 1, 1), ('2023-03-22', 2, 2), ('2023-03-23', 3, 3);

--Crie uma view chamada "livros_mais_vendidos" que exiba o título, autor, preço e a quantidade de vezes que cada livro foi vendido.
create view livros_mais_vendidos
as
select l.titulo, a.nome, l.valor, count(vl.cod_livro) as qtd_livro_vendido
from vendas_livros vl
join vendas v
    on v.cod_vendas_livro = vl.cod_vendas_livro
join livros l 
    on l.cod_livro = vl.cod_livro
join autores_livros al
    on al.cod_livro = l.cod_livro    
join autores a
    on a.cod_autor = al.cod_autor
group by(l.titulo) 


--Crie uma view que lista os autores que nunca venderam livros.
create view autores_nao_venderam_livros
as
select a.nome
from vendas_livros vl
 join vendas v
    on v.cod_vendas_livro = vl.cod_vendas_livro
join livros l 
    on l.cod_livro = vl.cod_livro
right join autores_livros al
    on al.cod_livro = l.cod_livro    
join autores a
    on a.cod_autor = al.cod_autor
where cod_venda is null
    


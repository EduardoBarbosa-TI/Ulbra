create table clientes(
    id int auto_increment primary key,
    nome varchar(100) not null,
    cpf char(11) not null unique,
    telefone int(20) not null,
    endereco varchar(100) not null
);

create table carros (
    id int auto_increment primary key,
    modelo varchar(20) not null,
    placa varchar(10) not null unique,
    marca varchar(30) not null
);

create table aluguel(
    id int auto_increment primary key,
    data_aluguel date not null,
    data_devolucao date not null,
    valor decimal(12,2) not null,
    id_carro int not null,
    id_cliente int not null,
    constraint carros_fk_aluguel
    foreign key(id_carro) references carros(id)
        on delete restrict
        on update cascade,
    constraint aluguel_fk_aluguel
    foreign key(id_cliente) references clientes(id)
        on delete restrict
        on update cascade
);

insert into carros(modelo,marca,placa)
    values
        ('conversivel','fiat', 'asf341'),
        ('meu modelo','chevrolet', 'as1341')


insert into clientes(nome,cpf,telefone,endereco)
    values
        ('edu','12355678910', '234245355', 'rua tal'),
        ('joao','12345678910', '35635656','rua tal')

insert into aluguel(data_aluguel,data_devolucao,valor,id_carro,id_cliente)
	values    	
		('2022-12-23','2023-01-23','11.54','1','2'),
		('2022-11-23','2022-12-23','11.54','2','1')
/*Primeiro comando*/
SELECT a.data_aluguel, a.id_carro,c.modelo, c.placa,c.marca
from aluguel as a, carros as c
where a.id_carro = c.id && a.data_aluguel = '2021-11-23'       

/*Segundo comando*/
SELECT *
from clientes as c
where c.nome = 'silva'

/*Terceiro comando*/
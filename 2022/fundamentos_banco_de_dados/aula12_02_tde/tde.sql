CREATE TABLE colaborador(
    id int auto_increment PRIMARY KEY,
    numero_da_matricula int auto_increment NOT NULL UNIQUE,
    name varchar(255) not null,
    email varchar(255) not null,
    indicacoes varchar(255),
    senha int not null
);

CREATE TABLE projeto(
    id int auto_increment PRIMARY KEY,
    name varchar(255) not null,
    descricao varchar(255),
    estimativa_de_duracao int not null,
    id_colaborador int not null
    constraint fk_projetos_registrados
    foreign key(id_colaborador) references colaborador(id)
);

CREATE TABLE comentarios(
    id int primary key
)


-- comentário

/*
    comentário em bloco
*/

-- padrão de nomes 

/*
    tabelas plural
    atributos singular 

    snake_case(usado SQL)
    abreviações em maiúsculas 
*/

clientes(id int pk, nome char(100));
enderecos(id int pk, logradouro char(100), numero int, bairro, cidade, estado);

/*
CREATE TABLE nome_da_tabela{
    nome_do_atributo | dominio | vazios | chaves,
    nome_do_atributo | dominio | vazios | chaves
}
*/

CREATE TABLE clients(
    id int not null primary key,
    nome varchar(100) not null,
    cpf varchar(14) not null unique
)

CREATE TABLE clients(
    id int not null,
    nome varchar(100) not null,
    CPF char(14) not null unique,
    primary key(id, CPF)
)

create table enderecos(
    id int not null primary key,
    logradouro varchar(100) not null,
    numero char(10),
    bairro varchar(100),
    cidade varchar(100),
    estado char(2),
    id_client int not null,
        constraint fk_clients_enderecos
            foreign key(id_cliente) references clientes(id)
);

create table engenheiros(
    id int not null primary key,
    nome varchar(100) not null
)

create table projetos(
    id int not null primary key,
    nome varchar(250) not null
)

create table atuacoes(
    id int not null primary key,
    id_engenheiro int not null,   
    id_projeto int not null,
    funcoes(varchar(20) not null),
    constraint fk_engenheiros_atuacoes
        foreign key(id_engenheiro) references engenheiros(id)
    constraint fk_projetos_atuacoes
        foreign key(id_projeto) references projetos(id)
)

--aluno(id, nome)
create table aluno(
    id int  primary key,
    nome  varchar(100) not null
);

--departamento (id, nome)
create table departamentos(
    id int auto_increment primary key,
    nome varchar(50) not null
);
--curso(id, nome, id_depto)
    --id_depto referencia departamento (id)
create table curso(
    id int auto_increment primary key,
    nome varchar(100) not null,
    id_dep int not null,
    constraint fk_curso_departamento
        foreign key(id_dep) references departamentos(id)
);
  
--professor(id, nome)
create table professores(
    id int auto_increment primary key,
    nome varchar(100) not null
);
--disciplina(id, nome, id_prof)
   --id_prof referencia professor(id)
create table disciplinas(
    id int auto_increment primary key,
    nome varchar(100) not null,
    id_professor int not null,
    constraint fk_disciplina_professor
        foreign key id_professor references professores(id)
); 
--matricula(id_disciplina, id_aluno, data_matr)
    --id_disciplina referencia disciplina(id) 
   --id_aluno referencia aluno(id);

create table matricula(
    id int auto_increment primary key,
    id_aluno int auto_increment not null,
    id_disciplina int not null,
    constraint fk_matricula_aluno
        foreign key id_aluno references alunos(id),
    constraint fk_matricula_disciplina
        foreign key id_disciplina references disciplinas(id)       
);


--



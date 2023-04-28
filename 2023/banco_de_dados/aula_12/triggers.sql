CREATE TABLE setores
(
	id int auto_increment primary key,
    nome varchar(50) not null, 
    total_salario decimal(18,2) default 0,
    data_de_atualização date
);

CREATE TABLE funcionarios
(
	id int auto_increment primary key,
    nome varchar(50) not null, 
    salario decimal(18,2) default 0,
    id_setor int,
    constraint funcionarios_setores_fk
		foreign key(id_setor) 
			references setores(id) 
				ON DELETE RESTRICT
                ON UPDATE CASCADE
);
insert into setores(nome)
values 
        ("Financeiro"),
        ("Desenvolvimento"),
        ("Limpeza");

insert into funcionarios(nome,salario,id_setor)
values 
        ("Eduardo Barbosa", 2000, 1),
        ("Cassio Hung", 4000, 2),
        ("Aline Santos", 3000, 3);


DELIMITER $$
CREATE TRIGGER trigger_atualiza_total_salario_quando_insert AFTER INSERT ON funcionarios
	FOR EACH ROW
BEGIN
    update setores
    set  total_salario = total_salario + new.salario
    where id = new.id_setor
END $$
DELIMITER ;

DELIMITER $$
CREATE TRIGGER trigger_atualiza_data_atualizada_quando_insert BEFORE INSERT ON setores
    FOR EACH ROW
BEGIN
    insert into setores(data_de_atualização)
    values
        (current_date)
    where id = new.id_setor
END $$
DELIMITER ;


DELIMITER $$
CREATE TRIGGER trigger_atualiza_total_salario_quando_update AFTER UPDATE ON funcionarios
	FOR EACH ROW
BEGIN
    update setores
    set  total_salario = total_salario + (new.salario - old.salario)
    where id = new.id_setor
 
END $$
DELIMITER ;
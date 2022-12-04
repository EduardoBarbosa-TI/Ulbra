/*Explique o conceito Integridade Referencial. De um exemplo SQL DDL para ilustrar melhor a sua explicação, usando a modelagem relacional (“Academico”).
 A integridade referencial é utilizada para manter a integridade dos dados armazenados nas tabelas, aos dados serem deletadas ou atualizadas existe a opção de restringir ou realizar a operação em cascata. Essa integridade é adicionada  nas constraint das chaves estrangeiras.*/

Turma(id, sala, capacidade, id_prof, id_curso)
constraint professor_fk_turma
	foreign key(id_prof)references professores(id)
 		on delete restrict
		on update cascade
constraint cursos_fk_turma
	foreign key(id_curso)references cursos(id)
 		on delete restrict
		on update cascade



--refatore a resposta escolhida como certa, para utilizar JOINS.

select t.id, d.nome, t.sala
from turdisc td
    inner join turma t
		on t.id = td.id_turma
    inner join disciplina d
		on d.id = td.id_disc


--4. Faça um SQL que permite atualizar o valor do crédito do curso de nome “ADS” com o acréscimo de 10% 
--Mostre o SQL que consulta também, antes de atualizar os dados.

Select *
from curso c
where c.nome like ‘%ADS%’

update curso c set valor_credito = valor_credito * 1.10
from curso c
where c.nome like ‘%ADS%’
	


--Da resposta que você selecionou correta, refatore-a utilizando joins.

	select a.nome, c.nome
from aluno a
		inner join cidade c
			on c.id = a.id_cidade
	order by a.nome


--10. Faça um SQL para exibir o nome do aluno, o código do curso, o nome do curso e o nome do professor da turma e a data que ele se matriculou. Apresentado somente para alunos que tenham se matriculado entre semestre 1 de 2022, considere que as matrículas iniciam em janeiro.

select a.nome,c.id,c.nome,p.nome. m.data_entrada
from matricula m, 
        inner join alunos a
            on a.id = m.id_aluno
        inner join turmas t 
            on t.id = m.id_turma
        inner join professores p 
            on p.id = t.id_prof
        inner join cursos c
            on c.id = t.id_curso
where m.data_entrada BETWEEN '2022-01-01' and '2022-04-25'

--11. Faça um SQL que liste os 2 professores que mais turmas já atenderam. Importante mostrar o nome do professor.

SELECT max(professores_por_turma) as max_turma
from(
	select p.nome, count(p.id) as professores_por_turma
    inner join turma t 
        on t.id_prof = p.id 
	from professores p
	group by p.id
) as nova_consulta
where max_turma 
limit 2;
        

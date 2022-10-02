--Utilizando Workbench e entendo suas funcionalidades
--Aprofundando conhecimento no grupo de comando DML - Data Manipulation Language 

SELECT `countrylanguage`.`CountryCode`,
    `countrylanguage`.`Language`,
    `countrylanguage`.`IsOfficial`,
    `countrylanguage`.`Percentage`
FROM `world`.`countrylanguage`;


--Podemos utilizar SELECT com diversar clausulas entre elas estão:
DISTINCT - --Seleciona linhas dinstintas ou exclusivas de uma tabela.
FROM - --Utilizamos para especificar de qual tabela manipularemos os dados.
WHERE - --Filtrar dados, extrair apenas os registros que atendem a uma condição especificada.
ORDER BY - -- Limita o número de linhas a serem recuperadas para um determinado número podendo classificar ordens crescente e descrecente.
LIMIT - -- Utilizamos para especificar o número de registros(tuplas) a serem retornados. Ideal para tabelas complexas, com muitas tuplas

SELECT DISTINCT values_to_return
    FROM table_name
    WHERE condition
    ORDER BY how_to_sort
    LIMIT row_count;
    
--DISTINCT
SELECT `Continent` FROM `world`.`country`; --Retorna todos os registros na tabela coluna continent 
SELECT DISTINCT `Continent` FROM `world`.`country`; --Retorna apenas 7 registros na tabela coluna continent 

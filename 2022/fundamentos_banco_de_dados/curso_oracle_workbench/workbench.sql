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


--Para a realização de filtragem de dados pela clausula WHERE, devemos executar alguns tipos de operadores, sendo eles:
--Operadores aritméticos "Caracteres Coringa"
+ 
-
* 
/ 
DIV 
% 
MOD
--Operadores de comparação
<
<=
=
<=>
<>
or
!= 
>=
>
BETWEEN
--Operadores Lógicos
AND
OR
XOR
NOT

--Example of Numeric Expressions with WHERE
SELECT Name FROM country WHERE indepYear = 1919;
SELECT Name, Population FROM country
    WHERE Population > 100000000;
SELECT Name, LifeExpectancy FROM country
    WHERE LifeExpectancy < 40;

--Example of WHERE with AND and OR
SELECT Name, Continent FROM country
WHERE GovernmentForm = 'Republic'
AND (Continent = 'North America'
OR Continent = 'Europe');

--Example of ORDER BY
SELECT Name FROM country ORDER BY Name;

SELECT Name, Continent FROM country
WHERE GovernmentForm = 'Republic'
AND (Continent = 'North America' OR Continent = 'Europe');
ORDER BY Name;

--Example of LIMIT
SELECT * FROM world.city
LIMIT 0,4;

SELECT Name FROM world.city
ORDER BY Name
LIMIT 20,4;

--Alguns outros comandos de filtragem utilizados no curso
SELECT CountryCode, Language
FROM countrylanguage
WHERE Language = 'Swedish'
ORDER BY CountryCode DESC;

SELECT Name, Population
FROM country
WHERE Population < 1000;

SELECT * FROM city WHERE ID = 3875;

SELECT Name 
FROM city 
ORDER BY Name ASC
LIMIT 2000;

SELECT CountryCode, Language
FROM countrylanguage
WHERE Language = 'Chinese'
ORDER BY CountryCode DESC
LIMIT 2;

SELECT *
FROM country
WHERE GNP > GNPOld
ORDER BY Name 
LIMIT 3;

SELECT Name FROM country
WHERE Continent IN ('Antarctica', 'Oceania');

SELECT Name, Continent FROM country
WHERE Continent LIKE 'North%'
ORDER BY Name LIMIT 3;

SELECT Name, Population, Continent
FROM country
WHERE Continent LIKE 'North%'
ORDER BY 2 DESC LIMIT 3;

SELECT Name, LifeExpectancy, Region FROM country
WHERE Continent LIKE 'North%'
and LifeExpectancy BETWEEN 70 AND 73
ORDER BY 2 DESC;

SELECT Name, Continent, GNP
FROM country
WHERE GNP > 1000000 AND NOT (Continent = 'North America') ORDER BY GNP DESC;

SELECT Name FROM country WHERE Name IS NULL;

SELECT count(*) FROM country WHERE Name != NULL;

SELECT count(*) FROM country WHERE Name IS NOT NULL;

--MySQL provides error and warning messages
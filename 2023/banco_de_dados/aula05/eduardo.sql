DELIMITER $$
CREATE  PROCEDURE getPersonByName(name varchar(50))
BEGIN
	
	select * from pessoas where nome like concat('%',name,'%');
    
END $$
DELIMITER ;


create table tabuada(
    cod_tabuada int primary key auto_increment,
    number_tabuada int not null,
    result int not null
);


DELIMITER $$
CREATE PROCEDURE tabuada(multiplicador int)
BEGIN  
    for()
END
DELIMITER ;
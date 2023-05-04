DELIMITER $$
CREATE  PROCEDURE getPersonByName(name varchar(50))
BEGIN
	
	select * from pessoas where nome like concat('%',name,'%');
    
END $$
DELIMITER ;



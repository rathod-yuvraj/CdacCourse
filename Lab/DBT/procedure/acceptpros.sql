-- Write a procedure that accepts a name and prints “Hello <name>”

DELIMITER $
CREATE PROCEDURE ACCEPTPRO(IN name varchar(10),out a VARCHAR(20))
BEGIN 
SET A:=NAME;
  SELECT A;
  END $
  DELIMITER ;
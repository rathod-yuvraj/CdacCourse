
-- write a stored procedure to add two numbers
/*
DELIMITER $

CREATE PROCEDURE sumpros()
DECLARE 
  A INT,
  B INT ,
  C INT 
BEGIN 
     SET C := A+B;
     select C;
END $
DELIMITER ;

DELIMITER $

/*CREATE PROCEDURE sumproc(IN x INT, IN y INT, OUT z INT)
BEGIN
    SET z = x + y;
    SELECT z AS result;
END $

DELIMITER ;
*/


-- Write a procedure to add two numbers using IN parameters and display the result.

DELIMITER $

CREATE PROCEDURE additionpros(in x int,in y int)
BEGIN 
DECLARE C INT ;
   SET C :=x+y;
   select C;
   
   END $
   DELIMITER ;
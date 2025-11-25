/*find max in table


Write a procedure to find the maximum of three numbers using GREATEST()
DELIMITER $
CREATE PROCEDURE findMax()
BEGIN
DECLARE A INT DEFAULT 100;
 DECLARE B INT DEFAULT 200 ;
DECLARE C INT DEFAULT 50 ;
   -- SELECT max(A , B);
   select GREATEST(A,B,C);


END $
DELIMITER ;
drop PROCEDURE IF EXISTS findmax;
DELIMITER $
CREATE PROCEDURE findmax()
BEGIN
    SELECT count(deptno) as cnt, dname from dept GROUP BY DNAME;
    
    END $
    DELIMITER ; */
    
    -- Write a procedure to display the current date and time.
    DELIMITER $
    CREATE PROCEDURE curdatepros()
    begin 
    SELECT curdate() AS 'current Date';
    SELECT NOW() AS 'NOW';
    END $
    DELIMITER ;
    
    
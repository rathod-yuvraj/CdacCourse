DROP PROCEDURE IF EXISTS insertpro1;
DELIMITER $$

CREATE PROCEDURE insertpro1()
BEGIN
  --  CREATE TEMPORARY TABLE temp(
       --  c1 INT,
--         c2 INT,
--         c3 INT,
--         c4 INT
--     );
    
    INSERT INTO temp VALUES (1,1,1,58);
    
    SELECT * FROM temp;   -- optional to show output
END $$

DELIMITER ;

DELIMITER $$
CREATE FUNCTION factorial(n INT)
RETURNS INT
BEGIN
    DECLARE f INT DEFAULT 1;
    WHILE n > 1 DO
        SET f = f * n;
        SET n = n - 1;
    END WHILE;
    RETURN f;
END $$
DELIMITER ;

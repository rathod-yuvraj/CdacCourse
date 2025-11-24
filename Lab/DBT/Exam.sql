DELIMITER $$

CREATE PROCEDURE shift_string(IN input_str VARCHAR(100), OUT output_str VARCHAR(100))
BEGIN
    DECLARE i INT DEFAULT 1;
    DECLARE len INT;
    DECLARE ch CHAR(1);
    DECLARE result VARCHAR(100) DEFAULT '';

    SET len = CHAR_LENGTH(input_str);

    WHILE i <= len DO
        SET ch = SUBSTRING(input_str, i, 1);
        SET result = CONCAT(result, CHAR(ASCII(ch) + 1));
        SET i = i + 1;
    END WHILE;

    SET output_str = result;
END$$

DELIMITER ;

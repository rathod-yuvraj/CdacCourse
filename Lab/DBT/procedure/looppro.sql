
/*
delimiter $
create procedure loopro()
BEGIN 
DECLARE x INT  DEFAULT 1;
lbl1: LOOP
    SELECT x;
    SET x = x+1;
    IF X >=10 THEN LEAVE lbl1;
    END IF;
    END LOOP lbl1;
    END $
    
    DELIMITER ;
    
    

    drop procedure if exists loop1t9spros;
    delimiter $
    create procedure loop1t9spros()
    begin 
    declare x int default 1;
    lb1:LOOP
    select x;
    SET x=x+1;
    IF x >10 then leave lb1;
    end if;
    end loop lb1;
    
    END $
    
    delimiter ;*/
    
    
    drop procedure if exists pro1
  

    DELIMITER $$
CREATE PROCEDURE pro1()
BEGIN
    DECLARE x INT DEFAULT 1;

    lbl1: LOOP
        SELECT x;
        SET x = x + 1;

        IF x > 10 THEN LEAVE lbl1; END IF;

        INSERT INTO t VALUES(CURDATE() + INTERVAL x DAY);
    END LOOP lbl1;
END $$
DELIMITER ;

    

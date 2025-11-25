
delimiter $
create function sumn(n int)
returns int 
deterministic
begin
  declare total int default 0;
  declare i int default 1;
  WHILE i<=n DO
  SET total=total+i;
  set i=i+1;
  
  END WHILE;
  RETURN total;
  
end $
delimiter ;
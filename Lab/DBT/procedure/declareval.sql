delimiter $
create procedure declarevarpro()
begin
declare x int default 100;
declare y int;
 set y := 200;
 select x+y as Total;
 
 end $
 delimiter ;
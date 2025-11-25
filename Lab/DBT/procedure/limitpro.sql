delimiter $
create procedure limitpro(x int,y int)
begin
 select * from dept limit x,y;
 end $
 delimiter ;
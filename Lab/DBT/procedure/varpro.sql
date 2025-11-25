delimiter $ 
create procedure varpro()
begin
 declare x int default 100;
 declare y int;
 set y :=200;
 select x+y as total;
 end $
 delimiter ;
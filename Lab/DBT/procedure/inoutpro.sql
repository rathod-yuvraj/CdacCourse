delimiter $
create procedure inoutpara(in x int, in y int,out z int)
begin
 set z:= x+y;
 end $
 delimiter ;
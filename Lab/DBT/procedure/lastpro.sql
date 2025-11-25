delimiter $
create procedure lstpro(x int)
begin
 declare v_cnt int default 0;
 select count(*)-x into v_cnt from dept;
 select * from dept limit v_cnt,x;
 end $
 delimiter ;
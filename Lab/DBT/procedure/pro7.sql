delimiter $
create procedure pro7(x int, y int)
begin 
select X+y as Sum;
end $
delimiter ;
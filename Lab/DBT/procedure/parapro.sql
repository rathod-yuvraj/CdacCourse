delimiter $
create procedure parapro(x int ,y int)
begin 
select x+y as sum;
end $
delimiter ;
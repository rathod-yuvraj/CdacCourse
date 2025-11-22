/*
delimiter $
create procedure pro1()
begin

select "Hello welcome to my world friends" as R1;
end $
delimiter ; 
   
drop procedure prol;
delimiter &

create procedure prol()

begin
select * from emp;
select * from sales;

end &

delimiter ;

*/
drop procedure prol;
delimiter @
create procedure yuvraj(n int,out num)
declare n int ;
begin

set 
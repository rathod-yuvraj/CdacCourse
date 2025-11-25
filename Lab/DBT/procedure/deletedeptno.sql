
drop procedure if exists delect;
drop procedure if exists delect;
delimiter $
create procedure delect(p_deptno int)
begin 

delete from dept where deptno =p_deptno;
select 'Record deleted...' as Message;
select deptno from dept;
end $
delimiter ;
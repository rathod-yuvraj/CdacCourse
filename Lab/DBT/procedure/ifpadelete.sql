
drop procedure if exists deletepro;
delimiter $
create procedure deletepro(p_deptno int)
begin
 declare flag bool default false;
 select true into flag from dept where deptno=p_deptno;
 if flag then
 delete from dept where deptno=p_deptno;
 select 'Record deleted..' as MSG;
 
 else
 select "Record not found.." as msg;
 end if;
 end $
 delimiter ;
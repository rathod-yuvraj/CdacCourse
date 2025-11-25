
drop procedure if exists insertvalpro;
-- DROP PROCEDURE IF EXISTS procedure_name;

delimiter $
create procedure insertvalpro(p_dname varchar(20),p_loc varchar(20),p_pwd varchar(10),p_startedon varchar(20))
begin 
declare v_deptno int default 0;
select max(deptno)+1 into v_deptno from dept;
insert into dept values(v_deptno,upper(p_dname),p_loc,upper(p_pwd),p_startedon);
select "Record inserted..." as Message;
end $
delimiter ;
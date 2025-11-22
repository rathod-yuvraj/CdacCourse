DROP PROCEDURE IF EXISTS pro1;

 delimiter $
create procedure pro1()

begin
   select "Hello world" as Message;
end $
delimiter ;

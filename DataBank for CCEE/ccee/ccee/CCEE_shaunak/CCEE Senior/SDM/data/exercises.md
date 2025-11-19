## 1

- create a container for httpd with name myhttpd in detached mode
- remove the container
- observer the list of containers

## 2

- create a container for mysql image

```bash
> docker container run -itd --name mysql -p 9090:3306 -e MYSQL_ROOT_PASSWORD=root mysql
```

- create a db and a dummy table

```sql
create database mydb;
use mydb;
create table mytable(name varchar(100));
insert into mytable (name) values ('value1');
insert into mytable (name) values ('value2');
select * from mytable;
```

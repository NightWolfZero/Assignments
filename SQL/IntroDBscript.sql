create table Employee(
employee_id int primary key,
employee_firstname varchar(30),
employee_lastname varchar(30),
employee_position varchar(40),
employee_salary int
);

--insert into employee values(02, 'Peter', 'Griffin', 'Brewery Shipping Clerk', 180000)

--insert into employee values(96, 'Glenn', 'Quagmire', 'Pilot', 69000)

--insert into employee values (23, 'Michael', 'Jordan', 'Retired Basketball Player', 900000)

--insert into employee values(007, 'Agent', '007', 'Classified', 150000)

--insert into employee values(069, 'Jamari', 'Gant', 'Software Engineer', 55000)

--update employee set employee_position = 'Basketball Coach' where employee_id =23

--update employee set employee_id = 10 where employee_id = 2

--delete from employee where employee_id = 69

--delete from employee where employee_lastname = '007'

--alter table employee rename employee_position to occupation

--alter table employee add column email varchar(30)

select employee_id, employee_salary, employee_firstname, employee_lastname  from employee where employee_salary > 100000

--select * from employee
-- drop table employee 
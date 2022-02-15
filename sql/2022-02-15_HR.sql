--잊기전에 한번더 p.324
CREATE TABLE EMP_HW(
    EMPNO NUMBER(4),
    ENAME VARCHAR2(10),
    JOB VARCHAR2(9),
    MGR NUMBER(4),
    HIREDATE DATE,
    SAL NUMBER(7,2),
    COMM NUMBER(7, 2),
    DEPTNO NUMBER(2));
    
ALTER TABLE EMP_HW
ADD BIGO VARCHAR2(20);

ALTER TABLE EMP_HW
MODIFY BIGO VARCHAR2(30);

ALTER TABLE EMP_HW
RENAME COLUMN BIGO TO REMARK;

DROP TABLE EMP_HW;


select * from dict;
select table_name from user_tables;

select owner, table_name from all_tables;

drop index emp_name_ix;
select * from employees;

select * from employees
where first_name = 'Pat';
create index emp_first_name_ix
on employees(first_name);

create or replace view emp30
as
select employee_id, first_name, salary, hire_date, location_id
from employees e, departments d
where e.department_id = d.department_id and e.department_id=30;

select * from emp30;

drop view emp30;

create or replace view emp_sal
as
select first_name, salary
from employees
order by salary desc;

select rownum, first_name, salary
from (select first_name, salary
from employees
order by salary desc)
where rownum<=10;

select rownum, first_name, salary
from employees;









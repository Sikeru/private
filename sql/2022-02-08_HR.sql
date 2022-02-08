select e.employee_id, e.first_name, d.department_name, e.salary, l.city
from employees e, departments d, locations l
where e.department_id = d.department_id and d.location_id = l.location_id;

select e.employee_id, e.first_name, 
          sub_tbl.department_name, e.salary, sub_tbl.city
from employees e, (select department_id, department_name, city
                              from departments d, locations l
                              where d.location_id = l.location_id) sub_tbl
where e.department_id = sub_tbl.department_id;

--7행에서 from괄호의 내용을 새로운 표로만든다.
create view city_view
as
select department_id, department_name, city
                              from departments d, locations l
                              where d.location_id = l.location_id;
                              
select * from city_view;

--조인의 수를 줄일수 있게된다.
select e.employee_id, e.first_name, 
          sub_tbl.department_name, e.salary, sub_tbl.city
from employees e, city_view sub_tbl
where e.department_id = sub_tbl.department_id;

select first_name, department_name, salary, city
from(select e.employee_id, e.first_name, 
        sub_tbl.department_name, e.salary, sub_tbl.city
        from employees e, (select department_id, department_name, city
                                       from departments d, locations l
                                       where d.location_id = l.location_id) sub_tbl
        where e.department_id = sub_tbl.department_id)
--28행부터 33행은 가상의 표 데이터가 된다.
where salary>=15000;


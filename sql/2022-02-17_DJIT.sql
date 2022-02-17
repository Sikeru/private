--set SERVEROUT off;
declare
v_num number := 10;
PI constant number :=3.141592;
v_deptno number(2) not null;
v_cuname customer.cu_name%type;
begin
    v_deptno :=10;
    dbms_output.put_line('Hello, PL/SQL');
    dbms_output.put_line(PI*2);
end;

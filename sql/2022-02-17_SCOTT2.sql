create or replace PROCEDURE in_dept
(dno in number, dna in varchar2, lo in varchar2)
is
    type rec_dept is record(
    deptno NUMBER(2),
    dname dept.dname%type,
    loc dept.loc%type
    );
    dept_rec REC_DEPT;
    
    begin
        dept_rec.deptno := dno;
        dept_rec.dname := dna;
        dept_rec.loc := lo;
        insert into dept values dept_rec;
        dbms_output.put_line('데이터 삽입을 완료했습니다.');
end;

exec in_dept(60,'IT','DAEJEON');
        
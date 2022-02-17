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

declare
    type REC_DEPT IS RECORD(
        deptno DEPT.DEPTNO%TYPE,
        dname DEPT.DNAME%TYPE
        );
    
    TYPE ITAB_DEPT IS TABLE OF REC_DEPT
        INDEX BY PLS_INTEGER;
        
    dept_arr ITAB_DEPT;
    idx PLS_INTEGER := 0;
    
    BEGIN
     FOR I IN (SELECT DEPTNO, DNAME FROM DEPT)LOOP
     idx := idx +1;
     dept_arr(idx).deptno := i.DEPTNO;
     dept_arr(idx).dname := i.DNAME;
     
     DBMS_OUTPUT.PUT_LINE(
        dept_arr(idx).deptno || ' : ' || dept_arr(idx).dname);
    END LOOP;
    END;
    / 
    
DECLARE
TYPE ITAB_EMP IS TABLE OF REC_EMP
    INDEX BY PLS_INTEGER;
    EMP_ERR ITAB_EMP;
    IDX PLS_INTEGER;
    SAL EMP.SAL%TYPE;

BEGIN
    FOR I IN (SELECT EMPNO, ENAME, SAL FROM EMP) LOOP
        IDX := IDX+1;
        EMP_ERR(IDX).EMPNO :=I.EMPNO;
        EMP_ERR(IDX).ENAME :=I.ENAME;
        EMP_ERR(IDX).SAL :=I.SAL;
        DBMS_OUTPUT.PUT_LINE(EMP_ERR(IDX),EMPNO || ',' ||
                            EMP_ERR(IDX),ENAME || ',' ||
                            EMP_ERR(IDX),SAL);
END LOOP;
END;
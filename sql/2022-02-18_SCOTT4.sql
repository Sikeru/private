CREATE OR REPLACE PROCEDURE pro_param_out
(
    in_empno IN OUT EMP.EMPNO%TYPE,
    out_ename OUT EMP.ENAME%TYPE,
    out_sal OUT EMP.SAL%TYPE
)
IS
v_mgr emp.mgr%type;
BEGIN
    SELECT ENAME, SAL, MGR INTO out_ename, out_sal, v_mgr   
        FROM EMP
        WHERE EMPNO = in_empno;
        in_empno := v_mgr;
END;

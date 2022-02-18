DECLARE
    V_ENAME EMP.ENAME%TYPE;
    V_SAL EMP.SAL%TYPE;
    V_MGR EMP.MGR%TYPE;
    V_EMPNO NUMBER :=7788;
BEGIN
    pro_param_out(v_empno, v_ename, v_sal);
    DBMS_OUTPUT.PUT_LINE('EANME : '|| v_ename);
    DBMS_OUTPUT.PUT_LINE('SAL : '|| v_sal);
    DBMS_OUTPUT.PUT_LINE('MGR : '|| v_empno);
END;
create or replace trigger emp_up_del_tri
after update or delete on emp
for each row

begin
if UPDATING then
    insert into emp_backup values
    (:old.empno, :old.ename, :old.job, :old.mgr, :old.hiredate, old.sal,
    :old.comm, old.deptno, sysdate, '수정');
elsif deleting then
    insert into emp_backup values
    (:old.empno, :old.ename, :old.job, :old.mgr, :old.hiredate, old.sal,
    :old.comm, old.deptno, sysdate, '삭제');
end if;
end;
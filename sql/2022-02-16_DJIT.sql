create table board(
bno NUMBER primary key,
title varchar2(100),
wr_name varchar2(30),
wr_date date,
note VARCHAR2(1000),
sel_cnt number);

create SEQUENCE board_seq
increment by 1
start with 1
minvalue 0
maxvalue 99999999
nocycle
nocache;

alter sequence board_seq
increment by
minvalue 0
maxvalue 99999999
nocycle
nocache;

select board_seq.nextval from dual;

insert into board values(board_seq.nextval,  '데이터베이스는 재미있다.', '관리자',sysdate, '하늘이 파랗게 보이는이유는 우리의 시각세포중 보라색을 인지하는 세포가 적기때문이다', 0);
select *from board;

create synonym c
for customer;

select * from c;
drop synonym c;

alter table board
modify(title constraint title_nl not null);

alter table board
drop constraint title_uq;

alter table board
modify(title constraint title_uq unique);

alter table board
add constraint sel_cnt_nl check(sel_cnt > 0);

create table comments
(comm_no number primary key,
comm_text VARCHAR2(1000),
bno number);

alter table comments
add constraint bno_fk foreign key(bno) references board(bno));

drop table comments;

insert into comments values(1, '그럼 하는은 원래 보라색인거임?', 1);

alter table board
modify(sel_cnt default 0);

insert into board(bno, title, wr_name, wr_date, note) 
values(2,'빛을 전달하는 매질은 무엇인가?', '미친놈',sysdate ,'에테르이다.');

create table DEPT_CONST(
doptno NUMBER(2) PRIMARY KEY,
dname varchar(14),
loc varchar(13));

alter table dept_const
modify(dname unique);

alter table dept_const
modify(loc not null);

create table emp_const(
empno NUMBER(4) PRIMARY KEY,
ename varchar2(10),
job varchar2(9),
tel varchar2(20),
hiredate date,
sal NUMBER(7,2),
comm number(7, 2),
deptno number(2));

alter table emp_const
modify(ename not null);

alter table emp_const
modify(tel unique);

alter table emp_const
modify(sal check(sal BETWEEN 1000 AND 9999));

create user dsp identified by 12345;

select * from hr.employees;
update hr.employees
set salary = salary *1.1;

grant select, update on HR.employees to scott;
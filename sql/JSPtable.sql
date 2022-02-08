create table t_member(
    id VARCHAR2(10) primary key,
    pwd VARCHAR2(10),
    name VARCHAR2(50),
    email VARCHAR2(50),
    joinDate date default sysdate
);

insert into t_member
values('hong', '1212', 'È«±æµ¿', 'hong@gmail.com', sysdate);

insert into t_member
values('lee', '1212', 'ÀÌ¼ø½Å', 'lee@test.com', sysdate);

insert into t_member
values('kim', '1212', '±èÀ¯½Å', 'kim@jweb.com', sysdate);
commit;

select * from t_member;
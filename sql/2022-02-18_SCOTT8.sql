create or replace trigger test_input
before insert on test_tri
for each row
begin
if :new.age < 20 then
:new.age :=99;
end if;
end;

insert into test_tri values(3, 'abc', 11);

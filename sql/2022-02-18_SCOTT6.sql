create or replace function func_after_tax(
    sal in number
)
    return number
is
    tax number :=0.05;
begin
    return (round(sal -(sal*tax)));
end;

declare
    aftertax number;
begin
    aftertax := func_after_tax(3000);
    dbms_output.put_line('after tax income : ' || aftertax);
end;
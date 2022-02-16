create user joongang1 identified by 12345;
grant connect to joongang1;
grant resource to joongang1;

create user joongang2 identified by 12345;
grant create session, create any table to joongang2;
grant resource to joongang2;
grant create user to joongang2;
grant create user to joongang2 with admin option;
revoke create user from joongang2;


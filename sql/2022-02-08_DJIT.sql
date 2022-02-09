--고객 - 
--고객번호 char(5) pk,
--이름 varchar2(30),
--전화번호 varchar2(15),
--주소 varchar2(100),
--이메일 varchar2(50),
--성별 char(2),
--생년월일 date,
--포인트 number

CREATE TABLE CUSTOMER(
CUST_ID CHAR(5) PRIMARY KEY,
CU_NAME VARCHAR2(30) NOT NULL,              --NOT NULL은 반드시 존재해야 함을 의미
TEL VARCHAR2(15),
ADDR VARCHAR2(100),
EMAIL VARCHAR2(50),
GEN CHAR(2),
BIRTH DATE,
CU_POINT NUMBER);

--거래처 - 
--사업자번호 char(12) pk,
--거래처명 varchar2(30),
--주소 varchar2(100),
--전화번호 varchar2(15),
--대표자 varchar2(30)

CREATE TABLE ACCOUNTS(
ACC_NO CHAR(12) PRIMARY KEY,
ACC_NAME VARCHAR2(30) NOT NULL,
ADDR VARCHAR2(100) NULL,
TEL VARCHAR2(15) NOT NULL,
CEO VARCHAR2(30) NOT NULL);

--제품 -
--제품번호 char(5),
--제품명 varchar2(50), 
--사업자번호 char(12) fk,
--제조사 varchar2(30), 
--규격 varchar2(30)

CREATE TABLE PRODUCTS(
PROD_NO CHAR(5) PRIMARY KEY,
PROD_NAME VARCHAR2(50),
ACC_NO CHAR(12),
BRAND VARCHAR2(30),
STAD VARCHAR2(30),
CONSTRAINT ACC_NO_FK FOREIGN KEY(ACC_NO) REFERENCES ACCOUNTS(ACC_NO)); 
--CONSTRAINT:제약조건 => ACC_NO를 FK로 지정  ACCOUNTS테이블의 ACC_NO를 참조하라는 의미


--판매 - 
--판매번호 char(5) pk,
--판매일 date, 
--고객번호 char(5) fk,  
--배송일 date, 
--제품번호 char(5) fk, 
--수량 number, 
--판매금액 number, 
--결재수단 varchar2(20), 
--비고 varchar2(1000)

CREATE TABLE SALES(
SAL_NO CHAR(5) PRIMARY KEY,
SALE_DATE DATE DEFAULT SYSDATE,     --판매일자를 지정하지 않으면 오늘 날짜가 들어간다.
CUST_ID CHAR(5),
DEL_DATE DATE DEFAULT SYSDATE,
PROD_NO CHAR(5),
QUANTITY NUMBER,
AMOUNT NUMBER,
PATMENT VARCHAR2(20),
NOTE VARCHAR2(1000),
CONSTRAINT CUST_ID_FK FOREIGN KEY(CUST_ID) REFERENCES CUSTOMER(CUST_ID),
CONSTRAINT PROD_NO_FK FOREIGN KEY(PROD_NO) REFERENCES PRODUCTS(PROD_NO));

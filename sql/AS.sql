--ASRESULT
insert into ASRESULT values('80001', 50000, '침수', '하드웨어 교체', '2022-02-03', 5, NULL);
insert into ASRESULT values('80002', 30000, '충격', '케이스교체', '2022-02-04', 5, NULL);
insert into ASRESULT values('80003', 00000, '제품불량', '새상품교환', '2022-02-06', 5, NULL);

--BRAND
insert into BRAND values('20001', '삼성전자', '경기도 수원시 영통구 삼성로 129', '02-2255-0114', '스마트폰', NULL, NULL);
insert into BRAND values('20002', 'LG전자', '서울특별시 영등포구 여의대로 128', ' 02-3777-1114', 'TV', NULL, NULL);
insert into BRAND values('20003', '쿠쿠', '경상남도 양산시 유산공단2길14', '1588-8899', '전기밥솥', NULL, NULL);?

INSERT INTO CUSTOMER VALUES('10001', '이순신', '대전유성구봉산동', 'ABCD@NAVER.KR', '010-1234-5678', 'Y', '1997-06-17');
INSERT INTO CUSTOMER VALUES('10002', '홍길동', '제주 특별시', '1234@NAVER.KR', '010-9876-5432', 'N', '1978-02-19');
INSERT INTO CUSTOMER VALUES('10003', '아무개', '대전서구탐방동', 'ㄱㄴㄷㄹ@NAVER.KR', '016-0000-0000', 'Y', '2002-02-22');
--7개수 (5자리 숫자-사용자 아이디(CU-ID), 30미만 이름, 100미만 주소, 50미만 이메일, 15미만 전화번호, 5미만 혼인여부 Y-N , SYSDATE)

INSERT INTO IMPROV VALUES('11001','집에 테레비가 안나와요 오셔서 안테나좀 다시 잡아줘요','10001');
INSERT INTO IMPROV VALUES('11002','집에 가고 싶어요','10002');
INSERT INTO IMPROV VALUES('11003','배고파용','10003');
--3개수 (5자리 숫자-접수번호, 2000미만 접수 내용, 5자리 숫자-사용자 아이디(CU-ID))

SELECT * FROM CUSTOMER;
SELECT * FROM IMPROV;

--조회테이블  INQUIRY
INSERT INTO INQUIRY(INQ_NO,CU_ID, PNO)
VALUES(90001, 10001, 60001);

INSERT INTO INQUIRY(INQ_NO,CU_ID, PNO)
VALUES(90002, 10002, 60002);

INSERT INTO INQUIRY(INQ_NO,CU_ID, PNO)
VALUES(90003, 10003, 60003);

--공급자메뉴얼 MANUAL
INSERT INTO MANUAL(MANUAL_ID,AS_MANUAL)
VALUES('12001','삼성그랑데 메뉴얼: 참고하시어 알아서 보기를 바랍니다.');

INSERT INTO MANUAL(MANUAL_ID,AS_MANUAL)
VALUES('12002','LG STYLER 메뉴얼: 참고하시어 사용하시길 바랍니다.');

INSERT INTO MANUAL(MANUAL_ID,AS_MANUAL)
VALUES('12003','APPLE IPHON 메뉴얼: 사용법이 어려우니 숙지 후 사용하시길 바랍니다.');

--소프트웨어 운영자 OPERATOR
INSERT INTO OPERATOR(OPID, REQNO, PNO, IMPNO)
VALUES('40001', '50001', '60001','11001');

INSERT INTO OPERATOR(OPID, REQNO, PNO, IMPNO)
VALUES('40002', '50002', '60002','11002');

INSERT INTO OPERATOR(OPID, REQNO, PNO, IMPNO)
VALUES('40003', '50003', '60003','11003');

---A/S 공급자 AS_SUPPLIER
INSERT INTO as_supplier(SUP_ID, AREA, AS_NAME, AS_TEL, AS_EMAIL, RANK)
VALUES('30001', '대전', '주영수', '010-2515-8746', 'ain8746@naver.com','대리');
INSERT INTO as_supplier(SUP_ID, AREA, AS_NAME, AS_TEL, AS_EMAIL, RANK)
VALUES('30002', '서울', '염기동', '010-4187-5777', 'rlehd@naver.com','주임');
INSERT INTO as_supplier(SUP_ID, AREA, AS_NAME, AS_TEL, AS_EMAIL, RANK)
VALUES('30003', '부산', '조성휘', '010-4055-5239', 'tjdgnl@naver.com','주임');

---A/S 신청
INSERT INTO asrequest(reqno, symptom, reqdate, exprocess)
VALUES('50001', '냉장고에서 웅~하는소리가나요', sysdate, SYSDATE + 3);
INSERT INTO asrequest(reqno, symptom, reqdate, exprocess)
VALUES('50002', 'TV안테나로 시청시 "입력신호가 약하거나 없습니다." 라는 화면이보여요', sysdate, SYSDATE + 3);
INSERT INTO asrequest(reqno, symptom, reqdate, exprocess)
VALUES('50003', '세탁기 급수가안되요', sysdate, SYSDATE + 3);

alter table product add FOREIGN KEY(rno) REFERENCES Repair(rno);

insert into repair(rno, rdiv, rlist, pay) values(70001, '모터', '부품', 99999999);
insert into repair(rno, rdiv, rlist, pay) values(70002, '나사', '소모품', 5000);
insert into repair(rno, rdiv, rlist, pay) values(70003, '케이블', '부품', 700000);

insert into product(pno,  pname,   psize, function, wperiod,            tip,      cu_manual,    excycle,   rno, Manual_ID)
			values(60001, '세탁기',  '300L',  '세탁기능', sysdate, '전원 코드를 뺏다끼셈', '구매처에 문의하세요', '구매후 6개월', 70001,    12001);
insert into product(pno,  pname,   psize, function, wperiod,            tip,      cu_manual,    excycle,   rno, Manual_ID)
			values(60002, '건조기',  '500L',  '건조기능', sysdate, '한 대 때리셈', '구매처에 문의하세요', '구매후 3개월', 70002,    12002); 
insert into product(pno,  pname,   psize, function, wperiod,            tip,      cu_manual,    excycle,   rno, Manual_ID)
			values(60003, '전기차',  '대형',  '주행기능', sysdate, '시동 껏다 키셈', '구매처에 문의하세요', '구매후 1년', 70003,    12003);

ALTER TABLE as_supplier
ADD CONSTRAINT impno
FOREIGN KEY (impno)
REFERENCES improv(impno);

select * from as_supplier;
SELECT * from asrequest;
SELECT * from asresult;
SELECT * from brand;
SELECT * from customer;
SELECT * from improv;
SELECT * from inquiry;
SELECT * from manual;
SELECT * from operator;
SELECT * from product;
SELECT * from repair;

select pno from product
where pname='세탁기';

select cu_name, cu_tel, addr, pname from customer c, asrequest q, product p
where q.pno=(select pno from product
             where pname='세탁기')
and c.cu_id=q.cu_id
and p.pno=q.pno;


commit;       






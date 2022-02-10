--아디다스의 런딩화를 구입한 고객의 고객번호, 이름, 총판매금액과 수량을 구하세요.
SELECT C.CUST_ID, CU_NAME, SUM(AMOUNT) 합계금액,  SUM(QUANTITY) 총수량
FROM CUSTOMER C, SALES S,  PRODUCTS P
WHERE S.CUST_ID = C.CUST_ID 
AND S.PROD_NO = P.PROD_NO 
AND PROD_NAME = '런닝화' AND BRAND = '아디다스'
GROUP BY C.CUST_ID, CU_NAME
ORDER BY CU_NAME;

--2,000,000 이하는 VIP, 2,000,000초과 70,000,000이하는 VVIP, 그이상은 VVIP+로 나누어서 조회한다.
SELECT CU_NAME, SUM(AMOUNT) TOT,
CASE WHEN SUM(AMOUNT) > 70000000 THEN 'VVIP++'
           WHEN SUM(AMOUNT) BETWEEN 2000000 AND 70000000 THEN 'VVIP'
           ELSE 'VIP'
END AS GRADE
FROM CUSTOMER C, SALES S
WHERE C.CUST_ID = S.CUST_ID
GROUP BY CU_NAME
ORDER BY CU_NAME;

--판매 물건 중 결재수단이 현금으로 구매한 물건명과 고객번호, 이름을 조회한다.
SELECT PROD_NAME, C.CUST_ID, CU_NAME
FROM PRODUCTS P, CUSTOMER C, SALES S
WHERE S.CUST_ID = C.CUST AND S.PROD_NO = P.PROD_NO
AND PAYMENT = '현금';

--대전 서구에 사는 고객 이름, 그 사람에 대한 노트
SELECT CU_NAME, NOTE, C.ADDR
FROM CUSTOMER C, SALES S
WHERE C.CUST_ID = S.CUST_ID AND ADDR LIKE '%대전 서구%';

--대전에 거주하는 사람 주에 나이키를 구매한 고객의 이름, 아이디, 주소
SELECT CU_NAME, C.CUST_ID, C.ADDR
FROM CUSTOMER C, PRODUCTS P, SALES S
WHERE S.CUST_ID=C.CUST_ID AND P.PROD_NO=S.PROD_NO AND BRAND='나이키';

--대전에 거주하는 사람 주에 나이키를 구매한 고객의 이름, 아이디, 주소 카드결재
SELECT CU_NAME, C.CUST_ID, C.ADDR
FROM CUSTOMER C, PRODUCTS P, SALES S
WHERE S.CUST_ID=C.CUST_ID AND P.PROD_NO=S.PROD_NO AND BRAND='나이키' AND PAYMENT='카드';

--대전에 거주하고 비고가 없는 고객명, 전화번호
SELECT CU_NAME, TEL
FROM CUSTOMER C, SALES S
WHERE C.CUST_ID=S.CUST_ID AND NOTE IS NULL AND ADDR LIKE '%대전%';

--대전에 거주하지 않는 고객과 결재수단별 합계, 주소를 알아보자
SELECT CU_NAME, SUM(AMOUNT), PAYMENT
FROM CUSTOMER C, SALES S
WHERE C.CUST_ID = S.CUST_ID AND
              C.CUST_ID IN (SELECT CUST_ID
                                      FROM CUSTOMER
                                      WHERE ADDR NOT LIKE '%대전%')
            GROUP BY CU_NAME, PAYMENT;
            
--제일 많이 팔린 상품과 판매금액의 합
SELECT PROD_NAME
FROM PRODUCTS
WHERE PROD_NO=(SELECT PROD_NO
                                  FROM(SELECT PROD_NO, SUM(QUANTITY) TOT
                                              FROM SALES
                                              GROUP BY PROD_NO)
                                  WHERE TOT =(SELECT MAX(TOT)
                                                           FROM(SELECT PROD_NO, SUM(QUANTITY) TOT
                                                           FROM SALES
                                                           GROUP BY PROD_NO)));
                                                           

--제품별 판매금액이 5억 이상인 제품
SELECT PROD_NAME, TOT
FROM(SELECT PROD_NAME, SUM(AMOUNT) TOT
            FROM SALES S, PRODUCTS P
            WHERE S.PROD_NO = P.PROD_NO
            GROUP BY PROD_NAME) TEMP
WHERE TOT >= 500000000
ORDER BY TOT DESC;

--제품의 종류가 가장많은 거래처
SELECT ACC_NAME
FROM(SELECT ACC_NAME, COUNT(*) CNT
            FROM ACCOUNTS A, PRODUCTS P
            WHERE P.ACC_NO = A.ACC_NO
            GROUP BY ACC_NAME)
WHERE CNT = (SELECT MAX(CNT)
                            FROM(SELECT ACC_NAME, COUNT(*) CNT
                             FROM ACCOUNTS A, PRODUCTS P
                            WHERE P.ACC_NO = A.ACC_NO
                            GROUP BY ACC_NAME));

--하나도 팔리지 않은 제품
SELECT PROD_NAME
FROM PRODUCTS
WHERE PROD_NO IN (
        SELECT DISTINCT P.PROD_NO
        FROM PRODUCTS P, SALES S
        WHERE P.PROD_NO=S.PROD_NO(+)
        MINUS
        SELECT DISTINCT P.PROD_NO
        FROM PRODUCTS P, SALES S
        WHERE P.PROD_NO=S.PROD_NO);




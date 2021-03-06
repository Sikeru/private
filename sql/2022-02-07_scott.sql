--DECODE함수 조건에따라 반환되는 값을 달리하는 함수
--아래 코드는 JOB에 따라 SAL값을 달리 출력하게 한다.
SELECT EMPNO, ENAME, JOB, SAL,
    DECODE(JOB,
        'MANAGER', SAL*1.1,
        'SALESMAN', SAL*1.05,
        'ANALYST', SAL,
        SAL*1.03) AS UPSAL
FROM EMP;

--CASE문 SWITCH와 같다.
SELECT EMPNO, ENAME, JOB, SAL,
    CASE JOB
        WHEN 'MANAGER' THEN SAL*1.1
        WHEN 'SALESMAN' THEN SAL*1.05
        WHEN 'ANALYST' THEN SAL
        ELSE SAL*1.03 
    END AS UPSAL
FROM EMP;

--아래와 같은 CASE문은 비고값을 줄때 많이 사용된다.
SELECT * FROM EMP;
SELECT EMPNO, ENAME, COMM,
    CASE WHEN COMM IS NULL THEN '해당없음'
              WHEN COMM = 0 THEN '수당없음'
              WHEN COMM > 0 THEN '수당 : ' || COMM
              END AS COMM_TEXT
FROM EMP;

--잊기전에 한번더 P.174
--Q1
SELECT EMPNO, SUBSTR(EMPNO,1,2) || '**' MASKING_EMPNO,
       ENAME, RPAD(UPPER(SUBSTR(ENAME,1,1)), LENGTH(ENAME), '*') MASKING_ENAME
FROM EMP
WHERE LENGTH(ENAME)>=5 AND LENGTH(ENAME)<=6;

--Q2
SELECT EMPNO, ENAME, SAL, TRUNC(SAL/21.5,2) DAY_PAY, ROUND(SAL/21.5/8,1) TIME_PAY
FROM EMP;

--Q3
SELECT EMPNO, ENAME, HIREDATE, TO_CHAR(NEXT_DAY(ADD_MONTHS(HIREDATE, 3), '월'), 'YYYY-MM-DD') R_JOB,
       CASE WHEN COMM IS NULL THEN 'N/A'
            ELSE TO_CHAR(COMM)
       END AS COMM
FROM EMP;

--Q4
SELECT EMPNO, ENAME, MGR,
       CASE WHEN MGR IS NULL THEN '0000'
            WHEN SUBSTR(MGR,1,2) = '75' THEN '5555'
            WHEN SUBSTR(MGR,1,2) = '76' THEN '6666'
            WHEN SUBSTR(MGR,1,2) = '77' THEN '7777'
            WHEN SUBSTR(MGR,1,2) = '78' THEN '8888'
            ELSE TO_CHAR(MGR)
       END AS CHG_MGR
FROM EMP;


SELECT SUM(SAL)
FROM EMP
WHERE JOB = 'MANAGER';

SELECT JOB, SUM(SAL)
FROM EMP
GROUP BY JOB;

--검색되는 행의 갯수
SELECT COUNT(*)
FROM EMP;

--특정항목을 지정 할 경우 NULL이 아닌 항목의 갯수 
SELECT COUNT(COMM)
FROM EMP;

--DISTINCT : 중복된것을 제외한다.
SELECT SUM(SAL), SUM(DISTINCT SAL), SUM(SAL) - SUM(DISTINCT SAL)
FROM EMP;

SELECT DEPTNO,JOB, SUM(SAL), ROUND(AVG(SAL),1), MAX(SAL), MIN(SAL)
FROM EMP
GROUP BY DEPTNO, JOB
ORDER BY DEPTNO;

SELECT DEPTNO, SUM(SAL)
FROM EMP
GROUP BY DEPTNO
HAVING SUM(SAL)>=10000;

SELECT DEPTNO, SUM(SAL)
FROM EMP
GROUP BY ROLLUP(DEPTNO);

SELECT DEPTNO, SUM(SAL)
FROM EMP
GROUP BY CUBE(DEPTNO);

SELECT * FROM EMP;

SELECT DEPTNO, LISTAGG(ENAME, ',')
               WITHIN GROUP (ORDER BY SAL DESC) AS ENAMES
FROM EMP
GROUP BY DEPTNO;

--8장 조인
SELECT * FROM EMP;
SELECT * FROM DEPT;

--조인의 갯수는 테이블 갯수-1 만큼 필요하다.
SELECT * FROM EMP, DEPT
WHERE EMP.DEPTNO = DEPT.DEPTNO;

SELECT EMPNO, ENAME, DNAME, DEPTNO
FROM EMP, DEPT
WHERE EMP.DEPTNO = DEPT.DEPTNO;

--column ambiguously defined
--DEPTNO는 EMP와 DEPT에 둘다 있기때문에 어딧는 값인지 지정해줘야한다.
SELECT EMPNO, ENAME, DNAME, E.DEPTNO
FROM EMP E, DEPT D
WHERE E.DEPTNO = D.DEPTNO;
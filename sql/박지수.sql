--접수정보(신청자 정보, 제품정보)
select cu_name 이름, cu_email 이메일, cu_tel 전화번호, addr 주소, pname 제품명, symptom 증상 
from asrequest q, customer c, product p
where q.pno=p.pno and
      q.cu_id = c.cu_id;

--AS처리결과정보
select cu_name 이름, cu_email 이메일, cu_tel 전화번호, addr 주소, pname 제품명, cost 비용, CAUSE 과실주체 ,ACTION 조치사항
from asrequest q, customer c, product p, asresult r
where q.pno=p.pno 
  and q.cu_id = c.cu_id
  and q.reqno=r.reqno;
      
--접수 목록 표시
select substr(reqno,4,2) 번호, reqdate 접수일 from asrequest;

--수리팁확인
select pname 제품명, tip 수리팁내용 from product;

--세탁기 AS를 신청한 고객정보
select cu_name 고객명, cu_tel 전화번호, addr 주소, pname 제품명 from customer c, asrequest q, product p
where q.pno=(select pno from product
             where pname='세탁기')
and c.cu_id=q.cu_id
and p.pno=q.pno;

--AS공급자의 관할지역별 사용자의 가전제품 조회
select area 관할지역, pname 제품명 from asrequest q, as_supplier s, customer c, product p
where q.cu_id=c.cu_id
  and q.sup_id=s.sup_id
  and q.pno = p.pno;


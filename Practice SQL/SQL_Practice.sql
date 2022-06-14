----------				----------
-- Question 9: cho so 8988.80 vui long xuat ra dinh dang $8,988.800
SELECT  TO_CHAR( 8988.80, '$9,999.999' ) FROM DUAL;

----------				----------
-- Question 10: cho so 8988.80, 820988.80 vui long xuat ra dinh dang $8,000.000, $820,000.000
SELECT  TO_CHAR( TRUNC(8988.80, -3), '$9,999.999' ),
        TO_CHAR( TRUNC(820988.80 , -3), '$999,999.999' )
FROM DUAL;

----------				----------
-- Question 12: Viet Cau SQL xuat ra, Ngay hien tai, ngay hom qua, ngay mai
SELECT  SYSDATE AS TODAY,
       	SYSDATE - 1 AS YESTERDAY,
        SYSDATE +1 AS TOMORROW
FROM DUAL;

----------				----------
-- Question 13: 
-- ta co table (TB_ORD), yeu cau viet cau SQL de generate ORD_NO co do dai 10 ky tu voi format sau: 
-- yyyymmdd000Seq, vi du hnay la  20191028 va chua co seq nao thi ORD_NO se la 201910280001, 
-- va neu da ton tai ORD_NO 201910280001 thi no se la 201910280002
INSERT  INTO TB_ORD(CUST_NO, ORD_NO, PRO_CD, ORD_DTTM) 
SELECT  :CUSTNO, :ORDNO, :PROCD, 
        DECODE(COUNT(*),  0, RPAD(TO_CHAR(SYSDATE, 'YYYYMMDD'), 12, '0') + 1, MAX(ORD_DTTM) + 1)
FROM TB_ORD 
WHERE ORD_DTTM LIKE TO_CHAR(SYSDATE, 'YYYYMMDD')||'%'
AND ROWNUM = 1;

----------				----------
-- Question 14:
--a)Viet cau SQL tim CUST_GRP_ID sao cho: CUST_GRP_HRCHY_CD co I hoac C nhung khong co G
SELECT CUST_GRP_ID, CUST_GRP_HRCHY_CD
FROM MDM_CUSTOMER
WHERE CUST_GRP_ID NOT IN (SELECT CUST_GRP_ID
                            FROM MDM_CUSTOMER B
                            WHERE CUST_GRP_HRCHY_CD = 'G') 
AND CUST_GRP_HRCHY_CD IN('I', 'C');

--b)Viet cau SQL tim CUST_GRP_ID sao cho: CUST_GRP_HRCHY_CD co G va co I nhung khong co C
SELECT DISTINCT CUST_GRP_ID
FROM MDM_CUSTOMER A
WHERE CUST_GRP_ID NOT IN (SELECT CUST_GRP_ID
                            FROM MDM_CUSTOMER
                            WHERE CUST_GRP_HRCHY_CD = 'C')
AND EXISTS (SELECT 1
            FROM MDM_CUSTOMER B
            WHERE A.CUST_GRP_HRCHY_CD = 'I' AND B.CUST_GRP_HRCHY_CD = 'G' 
            AND A.CUST_GRP_ID = B.CUST_GRP_ID);

----------				----------
-- Question 15:Viet cau SQL de xuat ra ket qua nhu sau:
-- 1)	Lay max(PROD_UNIT_AMT)
-- 2)	Lay  gia tri min(PROD_UNIT_AMT)
-- 3)	Lay gia tri trung binh PROD_UNIT_AMT
-- 4)	Lay ten cua san pham co PROD_UNIT_AMT lon nhat
SELECT  A.*,
        B.PROD_NM AS MAX_NAME
FROM    (SELECT MAX(PROD_UNIT_AMT) AS MAX_AMT, 
                MIN(PROD_UNIT_AMT) AS MIN_AMT, 
                AVG(PROD_UNIT_AMT) AS AVG
         FROM TB_PROD) A, TB_PROD B
WHERE B.PROD_UNIT_AMT = A.MAX_AMT AND ROWNUM <= 1;

----------				----------
-- Question 16:
--a) viet cau SQL lay ra top3 san pham dc ban nhieu nhat.
SELECT PRO_CD, COUNT(PRO_CD) 
FROM TB_ORD 
GROUP BY pro_cd 
ORDER BY COUNT(PRO_CD) DESC
FETCH FIRST 3 ROWS ONLY;

--b)Viet cau SQL lay ra cai ORD_DT, ORD_TM, PROD_CD gan nhat theo CUST_NO
WITH ORD AS
(
SELECT
    CUST_NO, 
    ORD_NO, 
    ORD_DTTM, 
    TO_NUMBER(PRO_CD) AS PRO_CD,
    ROW_NUMBER() OVER (PARTITION BY CUST_NO ORDER BY ORD_DTTM DESC) AS RN
FROM TB_ORD 
WHERE ORD_NO != 'temp'
)
SELECT CUST_NO, ORD_NO, ORD_DTTM, PRO_CD
FROM ORD
WHERE RN = 1;

--c)viet cau SQL report xem trong thang 06, 07, 08, 09 cua 2019 san pham co ma code la 00001 ban dc bao nhieu cai.
WITH    DATEORDER AS(
                SELECT DISTINCT SUBSTR(A.ORD_DTTM, 1, 6) AS MON, B.PRO_CD
                FROM TB_ORD A, TB_ORD B
                WHERE A.ORD_DTTM BETWEEN '201906000000' AND '201909302359'),
        DATEORDERORIGIN AS (
                SELECT SUBSTR(ORD_DTTM, 1, 6) AS MON, PRO_CD, COUNT(*) AS TOTAL
                FROM TB_ORD
                WHERE ORD_DTTM BETWEEN '201906000000' AND '201909302359'
                GROUP BY SUBSTR(ORD_DTTM, 1, 6), PRO_CD)
SELECT DO.MON, DO.PRO_CD, NVL(DOO.TOTAL,0) AS TOTAL
FROM DATEORDER DO LEFT JOIN  DATEORDERORIGIN DOO
ON DO.MON = DOO.MON AND DO.PRO_CD = DOO.PRO_CD
ORDER BY PRO_CD, MON;

--d)gia su luc dau san pham 00001 co 100 cai, viet report de tinh so luong remain theo thang 06, 07, 08, 09
WITH    DATEORDER AS(
                SELECT DISTINCT SUBSTR(A.ORD_DTTM, 1, 6) AS MON, B.PRO_CD
                FROM TB_ORD A, TB_ORD B
                WHERE SUBSTR(A.ORD_DTTM, 1, 6) BETWEEN '201906' AND '201909'),
        DATEORDERORIGIN AS (
                SELECT SUBSTR(ORD_DTTM, 1, 6) AS MON, PRO_CD, COUNT(*) AS TOTAL
                FROM TB_ORD
                WHERE SUBSTR(ORD_DTTM, 1, 6) BETWEEN '201906' AND '201909'
                GROUP BY SUBSTR(ORD_DTTM, 1, 6), PRO_CD)
SELECT DO.MON, DO.PRO_CD, NVL(DOO.TOTAL,0) AS TOTAL, 
        :REMAIN - NVL(SUM(DOO.TOTAL) OVER (PARTITION BY DO.PRO_CD ORDER BY DO.MON),0) AS REMAIN
FROM DATEORDER DO LEFT JOIN  DATEORDERORIGIN DOO
ON DO.MON = DOO.MON AND DO.PRO_CD = DOO.PRO_CD
WHERE DO.PRO_CD = '00001'
ORDER BY PRO_CD, MON;
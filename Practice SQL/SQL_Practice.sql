-- Question 9: cho s? 8988.80 vui l�ng xu?t ra ??nh d?ng $8,988.800
SELECT  TO_CHAR( 8988.80, '$9,999.999' ) FROM DUAL;

-- Question 10: cho s? 8988.80, 820988.80 vui l�ng xu?t ra ??nh d?ng $8,000.000, $820,000.000
SELECT  TO_CHAR( TRUNC(8988.80, -3), '$9,999.999' ),
        TO_CHAR( TRUNC(820988.80 , -3), '$999,999.999' )
FROM DUAL;

-- Question 12: Vi?t C�u SQL xu?t ra, Ng�y hi?n t?i, n�y h�m qua, ng�y mai
SELECT  SYSDATE AS TODAY,
       	SYSDATE - 1 AS YESTERDAY,
        SYSDATE +1 AS TOMORROW
FROM DUAL;

-- Question 13: 
-- ta c� table (TB_ORD), y�u c?u vi?t c�u SQL ?? generate ORD_NO c� ?� d�i 10 t? v?i format sau: 
--yyyymmdd000Seq, v� d? hnay l� 20191028 v� ch?a c� seq n�o th� ORD_NO s? l� 201910280001, 
--v� n?u ?� t?n t?i ORD_NO 201910280001 th� n� s? l� 201910280002
INSERT  INTO TB_ORD(CUST_NO, ORD_NO, PRO_CD, ORD_DTTM) 
SELECT  :CUSTNO, :ORDNO, :PROCD, 
        DECODE(COUNT(*),  0, RPAD(TO_CHAR(SYSDATE, 'YYYYMMDD'), 12, '0') + 1, MAX(ORD_DTTM) + 1)
FROM TB_ORD 
WHERE ORD_DTTM LIKE TO_CHAR(SYSDATE, 'YYYYMMDD')||'%'
AND ROWNUM = 1;

-- Question 14:
--a)Vi?t c�u SQL t�m CUST_GRP_ID sao cho: CUST_GRP_HRCHY_CD c� I ho?c C nh?ng kh�ng c� G
SELECT CUST_CNT_CD, CUST_SEQ, CUST_GRP_HRCHY_CD, CUST_GRP_ID
FROM MDM_CUSTOMER
WHERE  CUST_GRP_HRCHY_CD = (SELECT CUST_GRP_HRCHY_CD
                            FROM MDM_CUSTOMER
                           	WHERE CUST_GRP_HRCHY_CD != 'G' AND ROWNUM <=1);
--b)Vi?t c�u SQL t�m CUST_GRP_ID sao cho: CUST_GRP_HRCHY_CD c� G v� c� I nh?ng kh�ng c� C
SELECT CUST_CNT_CD, CUST_SEQ, CUST_GRP_HRCHY_CD, CUST_GRP_ID
FROM MDM_CUSTOMER
WHERE CUST_GRP_HRCHY_CD != 'C';

-- Question 15:Viets c?u SQL ?? su?t ra k�t qu? nh? sau:
-- L?y max(PROD_UNIT_AMT)
-- L?y  gi� tr? min(PROD_UNIT_AMT)
-- L?y gi� tr? trung b�nh PROD_UNIT_AMT
-- L?y t�n c?a s?n ph?m c� PROD_UNIT_AMT l?n nh?t
SELECT  A.*,
        B.PROD_NM AS MAX_NAME
FROM    (SELECT MAX(PROD_UNIT_AMT) AS MAX_AMT, 
                MIN(PROD_UNIT_AMT) AS MIN_AMT, 
                AVG(PROD_UNIT_AMT) AS AVG
         FROM TB_PROD) A, TB_PROD B
WHERE B.PROD_UNIT_AMT = A.MAX_AMT AND ROWNUM <= 1;

-- Question 16:
--a) vi?t c?u SQL l?y ra top3 s?n ph?m ?c b�n nhi?u nh?t.
SELECT PRO_CD, COUNT(PRO_CD) 
FROM TB_ORD 
GROUP BY pro_cd 
ORDER BY COUNT(PRO_CD) DESC
FETCH FIRST 3 ROWS ONLY;
--b)Vi?t c?u SQL l?y ra c�i ORD_DT, ORD_TM, PROD_CD g?n nh?t theo CUST_NO
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
--c)vi?t c?u SQL report xem trong th�ng 06, 07, 08, 09 c?u 2019 s?n ph?m c� m� code l� 00001b�n ?c bao nhi�u c�i.
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
--d)gi? s? l�c ??u s?n ph?n 00001 c� 100 c�i, vi?t report ?? t�nh s? l??ng remain theo th�ng 06, 07, 08, 09
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
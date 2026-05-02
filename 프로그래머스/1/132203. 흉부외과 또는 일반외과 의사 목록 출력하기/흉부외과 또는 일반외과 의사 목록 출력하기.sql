-- 진료과: CS, GS
-- 고용일자 기준 내림차순, 이름 기준 오름차순
SELECT DR_NAME, DR_ID, MCDP_CD, HIRE_YMD
from DOCTOR
where MCDP_CD = 'CS' OR MCDP_CD = 'GS'
order by HIRE_YMD DESC, DR_NAME ASC;
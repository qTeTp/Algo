-- 코드를 입력하세요
-- 12세 이하의 여자환자 조회
-- 전화번호가 없다면 'NONE' 출력
-- 나이 기준 내림차순
SELECT PT_NAME, PT_NO, GEND_CD, AGE, IFNULL(TLNO, 'NONE')
FROM PATIENT
WHERE AGE <=12 AND GEND_CD = 'W'
ORDER BY AGE DESC, PT_NAME ASC

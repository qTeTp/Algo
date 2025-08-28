-- 모든 동물의 아이디, 이름, 보호 시작일 조회 이름 오름차순
-- 이름이 같다면 보호 시작일 최신순
SELECT ANIMAL_ID, NAME, DATETIME
FROM ANIMAL_INS
ORDER BY NAME ASC, DATETIME DESC
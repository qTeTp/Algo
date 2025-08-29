-- 동물의 이름은 몇개인지 조회
-- NULL 집계x
-- 중복 이름은 하나로 침
SELECT COUNT(DISTINCT NAME) count
FROM ANIMAL_INS
WHERE NAME IS NOT NULL
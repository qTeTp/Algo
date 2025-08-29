-- 'EL'이 들어가는 개의 ID와 이름 조회
-- 이름순 정렬, 대소문자 구별x
-- 강아지임.
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE ANIMAL_TYPE = 'Dog' AND NAME LIKE '%EL%'
ORDER BY NAME;
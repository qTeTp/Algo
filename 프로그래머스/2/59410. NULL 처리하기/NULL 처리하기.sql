-- 생물 종, 이름, 성별 및 중성화 여부 조회
-- ID순 정렬
-- NULL은 'NO NAME'으로 표기
SELECT ANIMAL_TYPE, IFNULL(NAME,'No name'), SEX_UPON_INTAKE
from ANIMAL_INS
order by ANIMAL_ID;
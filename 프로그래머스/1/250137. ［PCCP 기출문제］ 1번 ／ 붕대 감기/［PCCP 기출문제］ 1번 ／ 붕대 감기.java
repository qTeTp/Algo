// 프로그래머스 붕대 감기
// 피가 닳았을 때 붕대를 감아 피를 채울 수 있음
// 붕대를 감아서 얻은 수 있는 피 : t * 초 + y(풀차징 성공 시 추가 체력)
// 공격 당하면 기술이 끊김
// bandage[시전 시간, 1초당 회복량, 추가 회복량]
// health : 최대 체력
// attacks[공격 시간, 피해량]
class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        // 현재 체력
        int curhealth = health;
        // 몬스터 공격 카운터, 연속 힐링 스택
        int cnt = 0, stack = 0;

        // 마지막 몬스터 공격 시간까지 반복
        for (int i = 0; i < attacks[attacks.length - 1][0] + 1; i++) {

            // 몬스터의 공격
            if (attacks[cnt][0] == i) {
                curhealth -= attacks[cnt][1];

                // 힐링 스택 까임
                stack = 0;
                cnt++;
            }
            // 안 맞았을 때 피 회복 시도
            else {
                // 힐링 스택
                stack++;

                // 초당 피 회복
                curhealth += bandage[1];

                // 힐링 풀차징 성공
                if (stack == bandage[0]) {
                    curhealth += bandage[2];
                    stack = 0;
                }

                // 오버 힐링 x
                if (curhealth > health)
                    curhealth = health;
            }
            // System.out.println("time : " + i + " health : " + curhealth);

            // 사망
            if (curhealth <= 0)
                return -1;
        }
        return curhealth;
    }
}
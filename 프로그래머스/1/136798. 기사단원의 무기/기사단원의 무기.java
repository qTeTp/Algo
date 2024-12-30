// 프로그래머스 기사단원의 무기
// 각 기사에게는 번호가 지정돼있고 그 번호의 약수 개수에 해당하는 공격력의 무기를 구매 가능
// 근데 정부에서 지정한 최대 공격력을 넘을 순 없음 넘으면 정부에서 지정한 무기를 구매해야 함
// 무기를 만드는 데에는 공격력만큼 철이 필요함. 총 필요한 철을 반환하면 됨
// 근데 약수의 개수를 깡으로 구하면 속도가 너무 느림
// 그래서 수가 제곱근이라면 2개씩 카운트해서 속도를 줄여봄
class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            // 약수의 개수 구하기
            int gaesu = 0;
            for (int j = 1; j * j <= i; j++) {
                if (j * j == i)
                    gaesu++;
                else if (i % j == 0)
                    gaesu += 2;
            }
            // 약수의 개수가 제한 공격력보다 크면
            if (gaesu > limit) {
                answer += power;
                continue;
            }
            answer += gaesu;
        }
        return answer;
    }
}
// 프로그래머스 콜라 문제
// a = 콜라 1병을 받기 위해 마트에 가져다줘야 하는 병의 수
// b = a개를 가져다주면 받는 콜라 수
// n = 가져온 빈 콜라 병 수
// tmp = 중간에 빼먹는 병들
class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0, tmp = 0;

        while (n >= 1) {
            if (tmp != 0) {
                n = n + tmp;
            }

            tmp = n % a;
            n = n / a * b;

            answer += n;
        }

        return answer;
    }
}

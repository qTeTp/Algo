// 프로그래머스 숫자의 표현
class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (count(i, n) == true)
                answer++;
        }
        return answer;
    }

    public boolean count(int a, int n) {
        int answer = 0;
        for (int i = a; i <= n; i++) {
            answer += i;
            if (n < answer)
                return false;
            if (n == answer)
                return true;
        }
        return false;
    }
}

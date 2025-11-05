/*
 * 프로그래머스 음양 더하기
 * 정수들의 절댓값이 있는 정수 배열이 있는데
 * 실제 정수의 합을 구해 반환
 * true면 +, false면 -
 */
class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) {
                answer += absolutes[i];
            } else {
                answer += absolutes[i] * -1;
            }
        }

        return answer;
    }
}
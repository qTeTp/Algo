import java.util.*;
/*
 * 프로그래머스 정수 삼각형
 * 백준의 것과 같다
 * 똑같이 풀어보겠음
 */
class Solution {
    public int solution(int[][] triangle) {
        int trLen = triangle.length;
        // 각 줄의 앞 뒤를 비워주기 위해 2를 더함
        // 0으로 초기화되어 크기 비교가 편해짐
        int[][] dp = new int[trLen][trLen + 2];

        for (int i = 0; i < trLen; i++) {
            for (int j = 1; j < i + 2; j++) {
                dp[i][j] = triangle[i][j - 1];

                // 첫 줄을 제외하고 나머지 줄은 그 전줄의 좌/우 수 중 더 큰수를 더해줌
                if (i != 0) {
                    dp[i][j] += Math.max(dp[i - 1][j - 1], dp[i - 1][j]);
                }
            }
        }
        return Arrays.stream(dp[trLen - 1]).max().getAsInt();
    }
}
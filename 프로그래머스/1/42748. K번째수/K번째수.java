import java.util.*;

/*
 * 프로그래머스 K번째 수
 * array의 배열을 i부터 j까지 자르고 정렬
 * 그다음 k번째 수를 반환
 */
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            // i, j, k
            int ii = commands[i][0];
            int j = commands[i][1];
            int k = commands[i][2];

            // 배열 자르기 함수 후에 정렬
            int[] tmp = Arrays.copyOfRange(array, ii - 1, j);
            Arrays.sort(tmp);

            answer[i] = tmp[k - 1];

        }

        return answer;
    }
}
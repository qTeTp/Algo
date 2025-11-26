import java.util.*;

/*
 * 프로그래머스 땅따먹기
 * 땅은 n행 4열, 모든 칸에는 점수가 있음
 * 1행부터 한행씩 내려오면서 4칸 중 하나만 밟으면서 내려와야 함
 * 같은 열 또 밟을 수 없다
 * 나올 수 있는 최댓값 반환
 */
class Solution {
    int solution(int[][] land) {
        for (int i = 0; i < land.length - 1; i++) {
            // 각 열의 최댓값, 두번째 최댓값, 최댓값의 자리
            int max1 = -1;
            int max2 = -1;
            int idx1 = -1;

            for (int j = 0; j < 4; j++) {
                int tmp = land[i][j];

                if (tmp > max1) { // 새로운 1등 발견
                    max2 = max1; // 기존 1등이 2등으로 밀림
                    max1 = tmp;
                    idx1 = j; // 자리 기록
                } else if (tmp > max2) { // 1등보다 작고, 2등보다 큰 경우
                    max2 = tmp;
                }
            }

            // 다음 열에 더해주기
            for (int j = 0; j < 4; j++) {
                // 같은 자리가 아니라면 최댓값
                // 같은 자리라면 두번째 최댓값 더해주기
                if (j != idx1) {
                    land[i + 1][j] += max1;
                } else {
                    land[i + 1][j] += max2;
                }
            }
        }

        return Arrays.stream(land[land.length - 1]).max().getAsInt();
    }
}
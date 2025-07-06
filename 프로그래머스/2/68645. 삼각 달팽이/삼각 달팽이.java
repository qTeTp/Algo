// 프로그래머스 달팽이 삼각형
// 밑변의 길이와 높이의 길이가 n인 삼각형 만들기
class Solution {
    public int[] solution(int n) {
        int[][] arr = new int[n][n];

        // 각 칸에 넣어줄 숫자, 이동 거리, 좌표
        int num = 1;
        int var = n;
        int x = -1, y = 0;
        while (num <= n * (n + 1) / 2) {
            for (int i = 0; i < var; i++) {
                x++;
                arr[x][y] = num++;
            }
            var--;

            for (int i = 0; i < var; i++) {
                y++;
                arr[x][y] = num++;
            }
            var--;

            for (int i = 0; i < var; i++) {
                x--;
                y--;
                arr[x][y] = num++;
            }
            var--;
        }

        // 배열에 결과 집어넣기
        int[] result = new int[n * (n + 1) / 2];
        int turn = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] != 0) {
                    result[turn++] = arr[i][j];
                }
            }
        }

        return result;
    }
}
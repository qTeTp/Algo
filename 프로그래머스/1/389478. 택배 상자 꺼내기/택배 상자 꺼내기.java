/*
 * 프로그래머스 택배 상자 꺼내기
 * 1 ~ n의 정수를 배열에 담음
 * 단 w만큼 놓고 돌리고 또 w만큼 놓고 돌리고 하며 배열에 담는다
 * 다 놓고 담고 나서 num을 꺼내기 위해 위의 정수를 치워야 한다
 * 몇 개를 치워야하는지 반환(num 포함)
 */
class Solution {
    public int solution(int n, int w, int num) {
        int[][] arr = new int[n / w + 1][w];

        // 2차원 배열에 담기
        int turn = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                // 짝수번째 줄은 반대로 담기
                if (i % 2 == 0) {
                    arr[i][j] = turn;
                } else {
                    arr[i][w - j - 1] = turn;
                }

                turn++;
                // 2중 포문 탈출
                if (turn > n) {
                    break;
                }
            }
            if (turn > n) {
                break;
            }
        }

        int cnt = 0;
        int loc = -100;
        // 디폴트값 0이 들어가기 때문에 0은 배제해야 함
        // num의 위치 검색
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                // 위치 지정
                if (arr[i][j] == num) {
                    loc = j;
                }
                // 그 위치면 카운트
                if (j == loc && arr[i][j] != 0) {
                    cnt++;
                }
            }
        }

        return cnt;
    }
}
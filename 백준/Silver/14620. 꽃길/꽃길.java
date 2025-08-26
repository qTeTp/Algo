import java.util.*;

public class Main {
    // 백준 14620 꽃길
    // 씨앗을 심어서 꽃이 피면 상하좌우 한칸씩 자리를 더먹음
    // 서로 다른 꽃의 꽃잎끼리 겹치거나 밖으로 나가면 죽음
    // 땅 대여 최소비용 반환

    static int[][] arr;
    static boolean[][] checker;

    public static int cntScore() {
        int score = 0;

        for (int i = 0; i < checker.length; i++) {
            for (int j = 0; j < checker.length; j++) {
                if (checker[i][j]) {
                    score += arr[i][j];
                }
            }
        }
        return score;
    }

    public static void resetBoard() {
        for (int i = 0; i < checker.length; i++) {
            for (int j = 0; j < checker.length; j++) {
                checker[i][j] = false;
            }
        }
    }

    public static int checkBoard() {
        int trueCnt = 0;

        for (int i = 0; i < checker.length; i++) {
            for (int j = 0; j < checker.length; j++) {
                if (checker[i][j]) {
                    trueCnt++;
                }
            }
        }
        return trueCnt;
    }

    // 개화
    public static void flowering(int x, int y) {
        checker[x][y] = true;
        checker[x][y + 1] = true;
        checker[x][y - 1] = true;
        checker[x + 1][y] = true;
        checker[x - 1][y] = true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = Integer.MAX_VALUE;

        int N = sc.nextInt();
        arr = new int[N][N];
        checker = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
                checker[i][j] = true;
            }
        }

        int n2 = N - 2;
        for (int i = 0; i < n2 * n2; i++) {
            int ix = i / n2 + 1;
            int iy = i % n2 + 1;

            for (int j = 0; j < n2 * n2; j++) {
                int jx = j / n2 + 1;
                int jy = j % n2 + 1;

                for (int k = 0; k < n2 * n2; k++) {
                    int kx = k / n2 + 1;
                    int ky = k % n2 + 1;

                    flowering(ix, iy);
                    flowering(jx, jy);
                    flowering(kx, ky);

                    if (checkBoard() == 15) {
                        int score = cntScore();
                        if (result > score) {
                            result = score;
                        }
                    }
                    resetBoard();
                }
            }
        }
        System.out.println(result);
    }
}
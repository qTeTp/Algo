import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
백준 10844 쉬운 계단 수
계단 수는 인접한 모든 자리의 차이가 1인 수를 얘기함 -> 1234321(o), 1236543(x)
정수 N(1 ~ 100)이 주어질 때 길이가 N인 계단 수의 개수를 반환
한 자리인 경우: 1 ~ 9까지 올 수 있음. 9가지
두 자리인 경우: 두번째 자리가 0 ~ 9까지 올 수 있음.
첫 숫자의 1 차이인 수만 올 수 있음
1 -> 0, 2
2 -> 1, 3
3 -> 2, 4
4 -> 3, 5
5 -> 4, 6
6 -> 5, 7
7 -> 6, 8
8 -> 7, 9
9 -> 8
17가지
점화식을 뽑을 수 있을 거 같다
1,000,000,000으로 나눈 나머지 반환
 */
public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static long[][] dp;
    final static long div = 1000000000;

    public static void main(String[] args) throws Exception {
        int n = Integer.valueOf(br.readLine());

        dp = new long[n + 1][10];
        // 첫번째 자릿수에 각각 자릿값(0 ~ 9)을 넣어준다
        for (int i = 1; i < 10; i++) {
            dp[1][i] = 1;
        }

        // 두번째부터
        for (int i = 2; i <= n; i++) {
            // 0 ~ 9까지 탐색
            for (int j = 0; j < 10; j++) {
                if (j == 0) { // 0이면 1만 가능
                    dp[i][0] = dp[i - 1][1] % div;
                } else if (j == 9) { // 9면 8만 가능
                    dp[i][9] = dp[i - 1][8] % div;
                } else { // 1 ~ 8인 경우 이전 자릿수의 자릿값 +1, -1의 합
                    dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % div;
                }
            }
        }

        long result = 0;
        for (int i = 0; i < 10; i++) {
            result += dp[n][i];
        }

        bw.write((result % div) + "");
        bw.flush();
        bw.close();
    }
}

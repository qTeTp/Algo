import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
백준 24416 알고리즘 수업 - 피보나치 수 1
재귀 사용시, dp 사용시의 실행 횟수를 출력
 */
public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int fibCnt;
    static int fibDpCnt;

    static int[] memo;

    public static void main(String[] args) throws Exception {
        int n = Integer.valueOf(br.readLine());

        fibCnt = 0;
        fibDpCnt = 0;
        memo = new int[n + 1];

        fib(n);
        fibDp(n);
        bw.write(fibCnt + " " + fibDpCnt);

        bw.flush();
        bw.close();
    }

    // 재귀
    static int fib(int n) {
        if (n == 1 || n == 2) {
            fibCnt++;
            return 1;
        } else
            return (fib(n - 1) + fib(n - 2));
    }

    // dp
    static int fibDp(int n) {
        memo[0] = 1;
        memo[1] = 1;

        for (int i = 2; i < n; i++) {
            fibDpCnt++;
            memo[i] = memo[i - 1] + memo[i - 2];
        }

        return memo[n - 1];
    }
}

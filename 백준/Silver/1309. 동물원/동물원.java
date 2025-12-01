import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
백준 1309 동물원
가로 2칸, 세로 n칸인 우리에 사자들을 배치해야 함
사자들을 배치할 수 있는 모든 경우의 수를 9901로 나눈 나머지 반환(0마리도 가능)
dp 문제이다 메모이제이션 활용
점화식이 존재한다
dp[1] = 3
dp[2] = 7
dp[3] = 17
dp[4] = 41
즉 dp[i] = 2 * dp[i-1] + dp[2]이라는 점화식이 나온다
 */
public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int[] dp;

    public static void main(String[] args) throws Exception {
        int n = Integer.valueOf(br.readLine());

        dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 3;

        for (int i = 2; i < n + 1; i++) {
            // 9901로 나눈 나머지
            dp[i] = (2 * dp[i - 1] + dp[i - 2]) % 9901;
        }

        bw.write(dp[n] + "\n");
        bw.flush();
        bw.close();
    }
}

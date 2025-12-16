import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
백준 11053 가장 긴 증가하는 부분 수열
수열 A가 주어졌을 때 가장 긴 증가하는 부분 수열 반환
증가하는 부분의 길이 반환
메모이제이션 이용
 */
public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int[] seq;
    static Integer[] dp;

    public static void main(String[] args) throws Exception {
        int num = Integer.valueOf(br.readLine());

        seq = new int[num];
        dp = new Integer[num];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            seq[i] = Integer.valueOf(st.nextToken());
        }

        for (int i = 0; i < num; i++) {
            dp(i);
        }

        int max = dp[0];

        for (int i = 1; i < num; i++) {
            max = Math.max(max, dp[i]);
        }
        bw.write(max + "");
        bw.flush();
        bw.close();
    }

    static int dp(int n) {
        if (dp[n] == null) {
            dp[n] = 1;

            for (int i = n - 1; i >= 0; i--) {
                if (seq[i] < seq[n]) {
                    dp[n] = Math.max(dp[n], dp(i) + 1);
                }
            }
        }
        return dp[n];
    }
}

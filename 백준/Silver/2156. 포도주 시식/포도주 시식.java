import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
백준 2156 포도주 시식
계단 오르기와 비슷한 문제
포도주는 3잔 연속 마실 수 없다
최대로 마실 수 있는 포도주의 양 반환
 */
public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        int num = Integer.valueOf(br.readLine());

        int[] arr = new int[num + 1];
        int[] dp = new int[num + 1];

        for (int i = 1; i < num + 1; i++) {
            arr[i] = Integer.valueOf(br.readLine());
        }

        dp[1] = arr[1];

        // 첫잔, 두잔까지는 무적권 마심
        if (num > 1) {
            dp[2] = arr[1] + arr[2];
        }
        // 세잔째부터 dp 적용
        for (int i = 3; i < num + 1; i++) {
            dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 2] + arr[i], dp[i - 3] + arr[i - 1] + arr[i]));
        }

        bw.write(dp[num] + "");
        bw.flush();
        bw.close();
    }
}

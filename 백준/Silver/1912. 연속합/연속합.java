import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
백준 1912 연속합
연속한 정수의 합 중 가장 큰 합 반환
 */
public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        int n = Integer.valueOf(br.readLine());

        // dp: 연속된 최댓값 구하는 배열
        // arr: 정수 기록용 배열
        int[] dp = new int[n];
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 기록 먼저함
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.valueOf(st.nextToken());
        }

        // 초기값은 첫번째 값
        dp[0] = arr[0];
        for (int i = 1; i < n; i++) {
            // 최댓값 구하기
            // 최댓값이 안나오게 되면 초기화해버림 현재 정수로
            dp[i] = Math.max(arr[i], dp[i - 1] + arr[i]);
        }

        bw.write(Arrays.stream(dp).max().getAsInt() + "");

        bw.flush();
        bw.close();
    }
}

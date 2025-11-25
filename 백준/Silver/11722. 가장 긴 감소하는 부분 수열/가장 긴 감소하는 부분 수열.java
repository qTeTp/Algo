import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
백준 11722 가장 긴 감소하는 부분수열
정수 배열이 주어진다
줄어드는 모양새의 최대 길이 반환
ex) {10, 30, 10, 20, 20, 10}라면 30 -> 20 -> 10 이 줄어드는 모양새를 이루므로 3 반환
1. dp 배열 선언
2. 왼쪽의 큰 수가 더 많다면? 왼쪽의 가장 큰 dp값에 1을 추가하면 됨
dp[1] - 1
dp[2] - 1
dp[3] - 2
dp[4] - 2
dp[5] - 2
dp[6] - 3
 */
public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int[] dp;

    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n + 1];
        dp = new int[n + 1];
        int result = 0;

        // st로 한줄의 숫자 나눠 넣고 dp에는 1로 초기화
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i] = 1;
        }

        // 배열에 들어간 숫자 비교
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                // arr[i]보다 앞의 수들이 작다면 길이 추가
                if (arr[j] > arr[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            // 결과값 최신화
            // dp의 마지막 배열에 꼭 최대값이 존재하리란 법이 없음
            result = Math.max(result, dp[i]);
        }

        bw.write(result + "");

        bw.flush();
        bw.close();
    }
}

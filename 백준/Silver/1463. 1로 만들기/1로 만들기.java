import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
백준 1463 1로 만들기
정수 x에 쓰는 연산은 세가지
1. 3으로 나눌 수 있다면 3으로 나눔
2. 2로 나눌 수 있다면 2로 나눔
3. 1을 뺀다
위 세가지를 사용해서 1을 만드는데 최소 횟수 반환
메모이제이션을 이용해 같은 계산을 안해도 됨
참고 - https://www.youtube.com/watch?v=MsU1WeBAf2o
1 - 0
2 - 1
3 - 1
4 - 2
5 - 3
6 - 2
7 - 3
8 - 3
9 - 2
10 - 3
 */
public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int[] dp;

    public static void main(String[] args) throws Exception {
        int num = Integer.valueOf(br.readLine());
        dp = new int[num + 5];

        // 초기값 투하
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 1;
        dp[4] = 2;
        dp[5] = 3;

        for (int i = 6; i < num + 1; i++) {
            // 1 빼는 경우, 3으로 나누는 경우, 2로 나누는 경우
            dp[i] = dp[i - 1] + 1;
            if (i % 3 == 0) {
                // 돌아가지 않게
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }
        }

        bw.write(dp[num] + "");

        bw.flush();
        bw.close();
    }
}

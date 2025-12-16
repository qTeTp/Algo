import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
백준 9084 동전
동전의 종류가 주어질 때 주어진 금액을 만드는 모든 방법의 수 반환

첫 줄: 테스트 케이스의 개수
테스트의 첫번째 줄: 동전의 가지 수
테스트의 두번째 줄: N가지 동전의 각 금액이 오름차순 정렬
테스트의 세번째 줄: 주어진 N가지 동전으로 만들어야 할 금액
금액 1 ~ 10000원

dp[i] = j
i: 금액
j: i원을 만들 수 있는 경우의 수

dp[i] = dp[i] + dp[i - coin]
i - coin == 0 -> dp[i] = dp[i] + 1

가짓 수를 낮은 숫자부터 올리면서 dp 배열에 추가한다
 */
public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        int num = Integer.valueOf(br.readLine());

        for (int t = 0; t < num; t++) {
            // 동전의 가짓 수(1 <= N <= 20)
            int N = Integer.valueOf(br.readLine());

            // 동전의 각 금액
            StringTokenizer st = new StringTokenizer(br.readLine());

            int[] arr = new int[N + 1];
            for (int i = 1; i < N + 1; i++) {
                arr[i] = Integer.valueOf(st.nextToken());
            }

            // 목표 금액
            int don = Integer.valueOf(br.readLine());

            int[] dp = new int[don + 1];

            for (int i = 1; i < N + 1; i++) {
                for (int j = 1; j < don + 1; j++) {
                    if (j - arr[i] > 0) {
                        dp[j] = dp[j] + dp[j - arr[i]];
                    }
                    // 다음 동전 개수 추가
                    else if (j - arr[i] == 0) {
                        dp[j]++;
                    }
                }

            }
            bw.write(dp[don] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

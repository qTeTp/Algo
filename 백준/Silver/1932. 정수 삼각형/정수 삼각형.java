import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
백준 1932 정수 삼각형
n의 높이인 삼각형이 있다 상단부터 바닥까지 한 층에 하나의 수를 더해서 최대값 반환
그런데 대각선 왼/오른쪽에 위치한 숫자만 선택 가능
입력과 동시에
메모이제이션 배열에 더하면서 기록
Math.max() 함수로 비교
 */
public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 메모이제이션용 배열
    static int[][] dp;

    public static void main(String[] args) throws Exception {
        int n = Integer.valueOf(br.readLine());

        // 일부러 양옆에 한칸씩 추가함 0으로 둘거임 비교를 쉽게하기 위해
        dp = new int[n][n + 2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            // 첫 칸, 마지막 칸 비워줌
            for (int j = 1; j < i + 2; j++) {
                dp[i][j] += Integer.valueOf(st.nextToken());

                // 첫 줄을 제외하고 나머지 줄은 그 전줄의 좌/우 수 중 더 큰수를 더해줌
                if (i != 0) {
                    dp[i][j] += Math.max(dp[i - 1][j - 1], dp[i - 1][j]);
                }
            }
        }

        bw.write(Arrays.stream(dp[n - 1]).max().getAsInt() + "");
        bw.flush();
        bw.close();
    }
}

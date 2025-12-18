import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
백준 2491 수열
DP 문제
수열이 주어진다 크거나 같은 구간의 연속된 수열의 최대 길이 반환
증가하는 수열, 감소하는 수열 모두 가능
 */
public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        int n = Integer.valueOf(br.readLine());

        int[] arr = new int[n];
        int[] increaseDp = new int[n + 1];
        int[] decreaseDp = new int[n + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 먼저 넣어줌
        arr[0] = Integer.valueOf(st.nextToken());
        // dp에는 최대 길이 넣어줄 거임
        increaseDp[0] = 1;
        decreaseDp[0] = 1;

        for (int i = 1; i < n; i++) {
            arr[i] = Integer.valueOf(st.nextToken());

            // 증가하는 수열 감소하는 수열의 길이 기록
            // 증가/감소 안하면 길이 초기화
            if (arr[i] >= arr[i - 1]) {
                increaseDp[i] = increaseDp[i - 1] + 1;
            } else {
                increaseDp[i] = 1;
            }

            if (arr[i] <= arr[i - 1]) {
                decreaseDp[i] = decreaseDp[i - 1] + 1;
            } else {
                decreaseDp[i] = 1;
            }
        }

        int inMax = Arrays.stream(increaseDp).max().getAsInt();
        int deMax = Arrays.stream(decreaseDp).max().getAsInt();

        // dp에는 길이값만 들어있으니 최댓값 반환
        bw.write(Math.max(inMax, deMax) + "");

        bw.flush();
        bw.close();
        br.close();
    }
}

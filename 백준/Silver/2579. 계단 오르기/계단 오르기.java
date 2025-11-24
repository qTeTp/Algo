import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
백준 2579 계단 오르기
각 다른 점수가 적혀있는 계단이 존재

1. 한번에 1, 2개씩 오를 수 있음
2. 연속 세개를 밟아서는 안됨
3. 마지막 계단은 반드시 밟아야 함

총 점수의 최댓값을 반환
// 참고: https://www.youtube.com/watch?v=1ehx6uoFZkU
 */

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        // br.readLine();

        // 계단 점수
        int[] arr = new int[n];
        // 각 비교하는 배열
        int[] g = new int[n + 1];
        int[] h = new int[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 초기화
        g[0] = 0;
        h[0] = 0;
        h[1] = arr[0];

        for (int i = 2; i < n + 1; i++) {
            g[i] = h[i - 1] + arr[i - 1];
            h[i] = Math.max(h[i - 2], g[i - 2]) + arr[i - 1];
        }

        bw.write(String.valueOf(Math.max(g[n], h[n])));

        bw.flush();
        bw.close();
    }
}

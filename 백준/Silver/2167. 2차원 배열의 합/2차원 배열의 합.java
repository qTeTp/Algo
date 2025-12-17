import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
백준 2167 2차원 배열의 합
2차원 배열이 주어졌을 때 (i, j) 위치부터 (x, y) 위치까지 저장된 수들의 합을 반환
첫째 줄: 배열의 크기 N, M
다음 N개의 줄에 M개의 정수로 배열이 주어짐
다음 줄 K: 합을 구할 부분의 개수
다음 K개의 줄: 네개의 정수 i, j, x, y 주어짐
 */
public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.valueOf(st.nextToken());
        int m = Integer.valueOf(st.nextToken());

        int[][] arr = new int[n][m];
        // N개의 줄에 M개의 정수 배열 입력
        for (int i = 0; i < n; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());

            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.valueOf(st1.nextToken());
            }
        }

        int k = Integer.valueOf(br.readLine());

        for (int t = 0; t < k; t++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            // i, j, x, y 입력
            int i = Integer.valueOf(st2.nextToken()) - 1;
            int j = Integer.valueOf(st2.nextToken()) - 1;
            int x = Integer.valueOf(st2.nextToken()) - 1;
            int y = Integer.valueOf(st2.nextToken()) - 1;

            int result = 0;
            for (int w = i; w <= x; w++) {
                for (int e = j; e <= y; e++) {
                    result += arr[w][e];
                }
            }

            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

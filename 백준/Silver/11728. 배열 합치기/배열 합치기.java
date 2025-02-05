import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

// 백준 배열 찹치기
// 배열 a 의 크기 n, 배열 b의 크기 m이 주어진다.
// 둘째 줄에는 배열 a의 내용이 셋째 줄에는 배열 b의 내용
// 두 배열을 합쳐서 정렬한 후 출력
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 배열 a의 크기, b의 크기
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        // 합치기 싫으니까 하나로 합침
        int[] a = new int[n + m];

        // a의 값 입력
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        // b의 값 입력
        st = new StringTokenizer(br.readLine());
        for (int i = n; i < n + m; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a);
        StringBuilder sb = new StringBuilder();
        for (int i : a) {
            sb.append(i + " ");
        }
        // sysout보다 빠름
        bw.write(sb.toString());
        bw.close();
    }
}

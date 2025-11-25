import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
백준 11726 2xn 타일링
2xn 크기의 직사각형을 1 * 2, 2 * 1 타일로 채우는 방법의 수를 반환
첫째 줄에 2×n 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력한다
피보나치 수열과 패턴이 일치
 */
public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 2];

        // 초기값
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;

        if (n > 2) {
            for (int i = 3; i <= n; i++) {
                arr[i] = (arr[i - 1] + arr[i - 2]) % 10007;
            }
        }

        bw.write(String.valueOf(arr[n]));

        bw.flush();
        bw.close();
    }
}

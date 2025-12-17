import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
백준 14912 숫자 빈도수
1 ~ n까지 특정 숫자의 빈도수를 구해 출력
입력: n d
n: 1부터 n까지의 숫자
d: 빈도수를 셀 특정 숫자
 */
public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.valueOf(st.nextToken());
        int m = Integer.valueOf(st.nextToken());

        int result = 0;
        for (int i = 0; i < n; i++) {
            String tmp = String.valueOf(i + 1);

            for (int j = 0; j < tmp.length(); j++) {
                // 아스키 코드 방지
                if (tmp.charAt(j) - '0' == m) {
                    result++;
                }
            }
        }

        bw.write(result + "");

        bw.flush();
        bw.close();
        br.close();
    }
}

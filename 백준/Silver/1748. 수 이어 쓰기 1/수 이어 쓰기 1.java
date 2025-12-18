import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
백준 1748 수 이어 쓰기 1
1 ~ N까지 수를 이어서 쓰면 하나의 수가 나오는데 몇 자리인지 반환
문자열로 변환해서 추가하면 될거 같다 - 메모리 펑 수학으로 풀어본다
수학을 활용해서 풀 수도 있을 거 같다
10 이상이면 ~
100 이상이면 ~ 이런식으로
N(1 ≤ N ≤ 100,000,000)
 */
public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        int n = Integer.valueOf(br.readLine());
        int result = n;

        if (n >= 10) {
            result += (n - 9);
        }
        if (n >= 100) {
            result += (n - 99);
        }
        if (n >= 1000) {
            result += (n - 999);
        }
        if (n >= 10000) {
            result += (n - 9999);
        }
        if (n >= 100000) {
            result += (n - 99999);
        }
        if (n >= 1000000) {
            result += (n - 999999);
        }
        if (n >= 10000000) {
            result += (n - 9999999);
        }
        if (n >= 100000000) {
            result += (n - 99999999);
        }

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
백준 4134 다음 소수
정수 n보다 크거나 같은 소수 중 가장 작은 소수를 반환

 */
public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        int num = Integer.valueOf(br.readLine());

        for (int t = 0; t < num; t++) {
            long n = Long.valueOf(br.readLine());

            boolean tf = false;
            while (!tf) {
                tf = tf(n++);
            }

            bw.write(n - 1 + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    // 소수 판별 메소드
    public static boolean tf(long num) {
        // 1은 소수가 아님
        if (num < 2)
            return false;
        // 다 뒤져볼 필요가 없음. i*i가 안되면 i도 안됨
        for (long i = 2L; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}

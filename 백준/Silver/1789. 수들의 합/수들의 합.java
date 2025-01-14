import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 문자열 집합
// 서로 다른 n개의 자연수의 합이 s일때. s를 이루는 자연수 n의 최댓값.
// 1부터 계속 더한다. 그러다가 n보다 커지면 그 카운트에서 - 1 해주면 된다.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long num = Long.parseLong(br.readLine());

        long tmp = 0;
        for (long i = 0;; i++) {
            tmp += i;

            if (tmp > num) {
                System.out.println(i - 1);
                break;
            }
        }
    }
}

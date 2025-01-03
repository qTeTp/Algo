import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 1, 2, 3 더하기
// 정수를 1, 2, 3의 합으로 나타내는 총 방법 반환
// 1 -> 1가지
// 2 -> 2가지
// 3 -> 4가지
// 4 -> 7가지
// 5 -> 13가지
// 이 패턴은 피보나치 수열과 흡사하다
// ex) 입력 5 -> 4인 경우 + 3인 경우 + 2인 경우
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            int tmp = Integer.parseInt(br.readLine());
            System.out.println(fin(tmp));
        }
    }

    public static int fin(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        if (n == 3)
            return 4;

        return fin(n - 1) + fin(n - 2) + fin(n - 3);
    }
}

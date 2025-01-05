import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 소수 구하기
// 약수가 1과 자신만 있는 값들만 반환하면 됨
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        for (int i = x; i <= y; i++) {
            if (tf(i) == true)
                System.out.println(i);
        }
    }

    // 소수 판별 메소드
    public static boolean tf(int num) {
        // 1은 소수가 아님
        if (num < 2)
            return false;
        // 다 뒤져볼 필요가 없음. i*i가 안되면 i도 안됨
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 설탕 배달
// 설탕이 들어있는 봉다리를 최소한으로 들고가야 한다
// 설탕 봉지의 종류는 2가지. 5키로와 3키로
// 딱딱 안 떨어지면 -1 반환
// 뭔가 약수를 이용하면 쉽게 풀 수 있을 것 같다
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        // 나누어 떨어지는 지 확인용
        boolean on = false;
        for (int i = 0; i < n; i++) {
            if ((n - i * 3) % 5 == 0 && (n - i * 3) / 5 >= 0) {
                System.out.println((n - i * 3) / 5 + i);
                on = true;
                break;
            }
        }
        if (on == false)
            System.out.println(-1);
    }
}

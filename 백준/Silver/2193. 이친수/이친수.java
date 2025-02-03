import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 이친수
// 기존에 이진수는 0과 1로만 이루어진 숫자
// 이친수의 조건
// 1. 0으로 시작하지 않는다
// 2. 1이 연속으로 나타나지 않는다
// 양의 정수를 n을 입력했을 때 n자리 이친수의 개수 출력
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        // 개수 저장 배열
        long[] arr = new long[num + 2];

        // 피보나치네요
        arr[0] = 0;
        // 1
        arr[1] = 1;
        // 10
        // 100, 101
        // 1000, 1001, 1010
        // 10000, 10001, 10010, 10100, 10101
        for (int i = 2; i < num + 1; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(arr[num]);
    }
}

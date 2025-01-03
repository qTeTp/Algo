import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 피보나치 함수
// 피보나치 수열을 이용하나 보다
// 0이 출력되는 경우, 1이 출력되는 경우를의 회수를 출력하면 된다
// 입력받는 수는 0 이상 40 이하
// 각 수의 패턴 발견
// ex) 3의 0의 개수 -> 2의 0의 개수 + 1의 0의 개수
// 3의 1의 개수 -> 2의 1의 개수 + 1의 1의 개수
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[41][2];
        arr[0][0] = 1;
        arr[0][1] = 0;
        arr[1][0] = 0;
        arr[1][1] = 1;

        // i 의 0의 개수 1의 개수 저장
        for (int i = 2; i < 41; i++) {
            arr[i][0] = arr[i - 1][0] + arr[i - 2][0];
            arr[i][1] = arr[i - 1][1] + arr[i - 2][1];
        }

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            int tmp = Integer.parseInt(br.readLine());

            System.out.println(arr[tmp][0] + " " + arr[tmp][1]);
        }
    }
}

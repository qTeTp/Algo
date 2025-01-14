import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 백준 일곱 난쟁이
// 일곱 난쟁이가 9명으로 늘어났다. 가짜들이 끼워져있는 것
// 원래 일곱 난쟁이의 키의 합은 100이었음
// 가짜들을 빼내고 오름차순하여 출력
// 9명의 키의 합을 내서 합 - 100의 값이 두 난쟁이의 키의 합인과 동일한지 찾아내서 색출
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 9 난쟁이 배열, 키의 합
        int[] arr = new int[9];
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        // 두 난쟁이의 키의 합이 9 난쟁이의 키의 합 - 100이 될 때 찾기
        // 두번 돌기 금지. 두번 돌면 100이 존나 많아짐.
        boolean b = false;
        for (int i = 0; i < 9; i++) {
            if (b == false) {
                for (int j = i + 1; j < 9; j++) {
                    if (arr[i] + arr[j] == sum - 100) {
                        arr[i] = 100;
                        arr[j] = 100;
                        b = true;
                        break;
                    }
                }
            }
        }
        // 정렬하고 100 두개는 맨 위로 갈 것이니까 0부터 6까지 출력
        Arrays.sort(arr);
        for (int i = 0; i < 7; i++) {
            System.out.println(arr[i]);
        }
    }
}

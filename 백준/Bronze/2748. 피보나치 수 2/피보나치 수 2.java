import java.io.IOException;
import java.util.*;

public class Main {
    // 백준 2748 피보나치 수 2
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // n까지의 피보나치수를 반환
        int n = sc.nextInt();
        sc.nextLine();
        long[] arr = new long[n + 1];

        arr[0] = 0;
        if (n > 0) {
            arr[1] = 1;

            for (int i = 2; i <= n; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
        }

        System.out.println(arr[n]);
    }
}
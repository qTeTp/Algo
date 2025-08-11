import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[8];
        int[] result1 = new int[8];
        int[] result2 = new int[8];

        for (int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
            result1[i] = i + 1;
            result2[i] = 8 - i;
        }

        // 두 배열을 비교
        if (Arrays.equals(arr, result1)) {
            System.out.println("ascending");
        } else if (Arrays.equals(arr, result2)) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
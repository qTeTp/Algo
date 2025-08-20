import java.util.*;

public class Main {
    // 백준 2750 수 정렬하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sc.nextLine();
        }
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();

        Arrays.sort(arr);
        // 3개 다 같은 경우
        if (arr[0] == arr[1] && arr[1] == arr[2]) {
            System.out.println(10000 + arr[0] * 1000);
        } else if (arr[0] == arr[1] || arr[1] == arr[2]) { // 2개만 같은 경우
            System.out.println(1000 + arr[1] * 100);
        } else {
            System.out.println(arr[2] * 100);
        }

    }
}
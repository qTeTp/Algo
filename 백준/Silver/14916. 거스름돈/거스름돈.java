import java.util.*;

public class Main {
    // 백준 14916 거스름돈

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int cnt = 0;

        while (n >= 10) {
            n -= 5;
            cnt++;
        }

        while (n > 7) {
            n -= 2;
            cnt++;
        }

        if (n % 2 == 0) {
            while (n > 0) {
                n -= 2;
                cnt++;
            }
        } else {
            n -= 5;
            cnt++;
            while (n > 0) {
                n -= 2;
                cnt++;
            }
        }

        if (n == 0) {
            System.out.println(cnt);
        } else {
            System.out.println(-1);
        }
    }
}
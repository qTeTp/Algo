import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        sc.nextLine();

        int cnt = 0;
        for (int i = 0; i < a; i++) {
            int tmp = sc.nextInt();

            if (isPrime(tmp) == 1) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    // 소수 판별
    public static int isPrime(int n) {
        if (n < 2) {
            return 0;
        }
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}
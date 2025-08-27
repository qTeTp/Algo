import java.util.*;

public class Main {
    // 백준 2908 상수
    // 수를 이상하게 읽음 734, 893 -> 437, 398

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        String nSb = new StringBuilder(String.valueOf(n)).reverse().toString();
        String mSb = new StringBuilder(String.valueOf(m)).reverse().toString();

        int N = Integer.parseInt(nSb);
        int M = Integer.parseInt(mSb);

        System.out.println(Math.max(N, M));
    }
}
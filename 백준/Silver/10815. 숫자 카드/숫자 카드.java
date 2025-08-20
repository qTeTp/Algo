import java.util.*;

public class Main {
    // 백준 10815 숫자 카드
    // 상근이와 딜러가 게임을 한다 딜러 기준으로 상근이가 그 카드를 가지고 있으면 1 없으면 -1 반환
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }
        int m = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < m; i++) {
            int tmp = sc.nextInt();
            if (set.contains(tmp)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}

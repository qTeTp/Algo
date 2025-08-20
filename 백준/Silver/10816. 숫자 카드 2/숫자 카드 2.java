import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    // 백준 10815 숫자 카드 2
    // 상근이와 딜러가 게임을 한다 딜러 기준으로 상근이가 그 카드를 가지고 있으면 1 없으면 -1 반환
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = sc.nextInt();
        sc.nextLine();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            if (map.containsKey(tmp)) {
                map.put(tmp, map.get(tmp) + 1);
            } else {
                map.put(tmp, 1);
            }
        }

        int m = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < m; i++) {
            int tmp = sc.nextInt();
            bw.write(map.getOrDefault(tmp, 0) + " ");
        }
        bw.flush();
        bw.close();
    }
}

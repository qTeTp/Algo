import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.Buffer;
import java.util.*;

/*
백준 11729 하노이 탑 이동 순서
기존 하노이 탑 문제
1번째 장대에서 3번째 장대로 옮기기
입력 : 첫째 줄에 원판의 개수 N(1 ≤ N ≤ 20)
출력 : 첫째 줄에 옮긴 횟수 K를 출력
      두 번째 줄부터 수행 과정을 출력
 */

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        // 옮긴 횟수 = 2^n -1
        int moveCount = (int) (Math.pow(2, n) - 1);
        System.out.println(moveCount);

        // 하노이 탑 이동 순서 출력
        // 재귀로 구현
        hanoi(n, 1, 3, 2);

        bw.flush();
        bw.close();
    }

    public static void hanoi(int n, int from, int to, int tmp) throws Exception {
        if (n == 1) {
            bw.write(from + " " + to + "\n");
            return;
        }

        hanoi(n - 1, from, tmp, to);
        bw.write(from + " " + to + "\n");
        hanoi(n - 1, tmp, to, from);
    }
}

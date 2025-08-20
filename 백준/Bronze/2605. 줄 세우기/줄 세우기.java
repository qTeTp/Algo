import java.util.*;

public class Main {
    // 백준 2605 줄세우기
    // 학생들이 줄을 서서 급식을 먹음 앞자리 앉은 애들이 빨리 먹고, 뒤에 앉은 애들이 늦게 먹음. 개편해야 함
    // 줄을 서서 번호표를 뽑는데 1번은 0, 2번은 (0, 1), 3번은 (0, 1, 2)... 이렇게 뽑을 기회가 주어진다
    // 줄을 맨 뒤 기준으로 뽑은 숫자의 수만큼 사람을 재껴서 밥먹을 수 있다
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> lst = new ArrayList<>();

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();

            lst.add(i - tmp, i + 1);
        }

        for (Integer i : lst) {
            System.out.print(i + " ");
        }
    }
}

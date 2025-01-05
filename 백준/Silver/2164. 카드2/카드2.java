import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// 백준 카드2
// n장의 카드가 n까지 번호가 써있을 때 1이 맨 위 n이 맨 아래로 간다.
// 맨 위의 카드를 버리고 그 다음 카드는 맨 밑으로 간다
// 마지막에 남는 카드 반환
// 큐를 이용해서 풀면 쉽게 풀 것 같다
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < num; i++) {
            q.add(i + 1);
        }

        for (int i = 0; i < num; i++) {
            if (q.size() == 1) {
                System.out.println(q.peek());
                break;
            }
            q.remove();
            if (q.size() == 1) {
                System.out.println(q.peek());
                break;
            }
            int tmp = q.peek();
            q.add(tmp);
            q.remove();
        }
    }
}

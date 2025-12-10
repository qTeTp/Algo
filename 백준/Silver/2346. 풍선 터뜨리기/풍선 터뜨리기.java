import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

/*
백준 2346 풍선 퍼뜨리기
데크 문제
n개의 풍선이 원형으로 있다
i - 1번, i번, i + 1번, ...풍선 요런 식으로 있다
각 배열의 숫자만큼 이동한다 +면 오른쪽 -면 왼쪽
풍선이 터지는 순서 반환
 */
public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        int n = Integer.valueOf(br.readLine());

        int[] arr = new int[n];
        Deque<int[]> dq = new ArrayDeque<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.valueOf(st.nextToken());
        }

        // 맨 처음 풍선
        bw.write(1 + " ");
        int turn = arr[0];

        // 데크에 나머지 담음
        for (int i = 1; i < n; i++) {
            // 풍선의 id와 내용을 담음
            dq.add(new int[] { (i + 1), arr[i] });
        }

        while (!dq.isEmpty()) {
            if (turn > 0) { // 양수인 경우
                // 순서를 뒤로 돌린다
                for (int i = 1; i < turn; i++) {
                    dq.add(dq.poll());
                }
                int[] next = dq.poll();
                turn = next[1];
                bw.write(next[0] + " ");
            } else { // 음수인 경우
                // 순서를 앞으로 돌린다
                for (int i = 1; i < -turn; i++) {
                    dq.addFirst(dq.pollLast());
                }
                int[] next = dq.pollLast();
                turn = next[1];
                bw.write(next[0] + " ");
            }
        }

        bw.flush();
        bw.close();
    }
}

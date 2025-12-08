import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
백준 24511 queuestack
첫째 줄: 자료구조의 개수
둘째 줄: 각 자료구조의 구조 0: 큐, 1: 스택
셋째 줄: 각 자료구조의 초기값 지정
넷째 줄: 넣을 수 의 개수
다섯째 줄: 넣을 수
 */
public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        // 자료구조의 개수
        int n = Integer.valueOf(br.readLine());

        // 각 자료구조의 종류
        int[] struct = new int[n];
        // 자료구조 내 숫자
        ArrayList<Integer> lst = new ArrayList<>();

        // 각 자료구조의 구조 받기
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            struct[i] = Integer.valueOf(st1.nextToken());
        }

        // 자료구조의 초기값 받기
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            lst.add(Integer.valueOf(st2.nextToken()));
        }

        // 자료 구조에 넣을 수의 개수
        int m = Integer.valueOf(br.readLine());

        // 출력용 큐 사용
        Queue<Integer> queue = new LinkedList<>();
        // 스택 말고 큐인 자료구조에서만 값 빼서 큐에 넣어줌
        for (int i = n - 1; i >= 0; i--) {
            if (struct[i] == 0) {
                queue.offer(lst.get(i));
            }
        }

        // 넣을 수 받기
        StringTokenizer st3 = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            queue.offer(Integer.valueOf(st3.nextToken()));
        }

        for (int i = 0; i < m; i++) {
            bw.write(queue.poll() + " ");
        }

        bw.flush();
        bw.close();
    }
}

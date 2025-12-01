import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
백준 1874 스택 수열
스택은 LIFO(후입선출) 개념의 자료구조
스택에 넣는 값은 오름차순 정렬
안되는 거면 NO 출력
NO를 위해 큐에다가 출력을 저장해두고 마지막에 출력
 */
public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        int n = Integer.valueOf(br.readLine());

        Stack<Integer> stack = new Stack<>();
        // 답안지
        Queue<Character> queue = new LinkedList<>();
        int[] arr = new int[n + 1];
        // 입력을 배열에 넣어줌
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.valueOf(br.readLine());
        }

        // 스택에 차례대로 1부터 넣어주면서 동시에 스택과 비교
        int turn = 0;
        for (int i = 1; i < n + 1; i++) {
            // 스택에 추가할 때마다 큐에 + 추가
            stack.push(i);
            queue.offer('+');

            // 넣자마자 배열과 비교했을 때 같은 정수라면 빼줌
            // 뺄 때마다 - 추가
            while (!stack.isEmpty() && arr[turn] == stack.peek()) {
                stack.pop();
                queue.offer('-');

                // 배열의 다음 정수로
                turn++;
            }
        }

        // NO 구분
        if (!stack.isEmpty()) {
            bw.write("NO");
        } else {
            while (!queue.isEmpty()) {
                bw.write(queue.poll() + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}

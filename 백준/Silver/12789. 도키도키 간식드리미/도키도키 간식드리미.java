import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

/*
백준 12789 도키도키 간식드리미
간식줄이 씹창이 나버렸다
스택을 이용해서 간식줄을 정상화한다
정상화가 가능하다며 Nice 안되면 Sad 출력
 */
public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        int n = Integer.valueOf(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.valueOf(st.nextToken());
        }

        int turn = 1;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] == turn) {
                turn++;
            } else {
                stack.push(arr[i]);
            }

            while (!stack.isEmpty() && stack.peek() == turn) {
                stack.pop();
                turn++;
            }
        }

        // 출력
        if (turn > n) {
            bw.write("Nice");
        } else {
            bw.write("Sad");
        }
        bw.flush();
        bw.close();
    }
}

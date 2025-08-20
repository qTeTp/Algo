import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    // 백준 28278 스택 2
    // 스택 구현. 어레이리스트로 구현해보겠음 - 시간 초과 그냥스택으로 함
    // 1 X: 정수 X를 스택에 넣는다. (1 ≤ X ≤ 100,000)
    // 2: 스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
    // 3: 스택에 들어있는 정수의 개수를 출력한다.
    // 4: 스택이 비어있으면 1, 아니면 0을 출력한다.
    // 5: 스택에 정수가 있다면 맨 위의 정수를 출력한다. 없다면 -1을 대신 출력한다.
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();

            if (tmp == 1) {
                int x = sc.nextInt();
                stack.push(x);
            } else if (tmp == 2) {
                if (!stack.isEmpty()) {
                    bw.write(stack.pop() + "\n");
                } else {
                    bw.write(-1 + "\n");
                }
            } else if (tmp == 3) {
                bw.write(stack.size() + "\n");
            } else if (tmp == 4) {
                if (stack.isEmpty()) {
                    bw.write(1 + "\n");
                } else {
                    bw.write(0 + "\n");
                }
            } else {
                if (!stack.isEmpty()) {
                    bw.write(stack.peek() + "\n");
                } else {
                    bw.write(-1 + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}

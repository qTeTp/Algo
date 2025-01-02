import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 백준 스택
// push -> 스택에 정수를 넣음
// pop -> 가장 위의 정수를 빼고, 그 수를 출력한다
// size -> 스택의 정수의 개수를 출력한다
// empty -> 스택이 비면 1, 차있으면 0 출력
// top -> 가장 위의 정수 출력. 없다면 -1 출력
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            if (str.contains("push")) {
                String[] arr = str.split(" ");
                stack.add(Integer.parseInt(arr[1]));
            } else if (str.contains("pop")) {
                if (stack.size() == 0) {
                    System.out.println(-1);
                    continue;
                }
                System.out.println(stack.peek());
                stack.pop();
            } else if (str.contains("size")) {
                System.out.println(stack.size());
            } else if (str.contains("empty")) {
                if (stack.size() > 0) {
                    System.out.println(0);
                    continue;
                }
                System.out.println(1);
            } else if (str.contains("top")) {
                if (stack.size() == 0) {
                    System.out.println(-1);
                    continue;
                }
                int tmp = stack.peek();
                System.out.println(tmp);
            }
        }

    }
}

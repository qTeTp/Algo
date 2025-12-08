import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

/*
백준 4949 균형잡힌 세상
스택 문제
각 줄마다 괄호의 균형이 맞는지 yes/no 출력
 */
public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        Stack<Character> stack = new Stack<>();

        // 무겐루프 넣어버리고 . 나오면 알아서 탈출
        while (true) {
            String str = br.readLine();

            // 탈출조건
            if (str.equals(".")) {
                break;
            }

            // 괄호가 이상하면 묻따 탈출시키고 no 출력
            boolean bool = true;
            // 한줄 입력
            for (int i = 0; i < str.length(); i++) {
                char tmp = str.charAt(i);

                if (tmp == '(' || tmp == '[') {
                    stack.push(tmp);
                }

                if (tmp == ')') {
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        bool = false;
                        break;
                    }
                } else if (tmp == ']') {
                    if (!stack.isEmpty() && stack.peek() == '[') {
                        stack.pop();
                    } else {
                        bool = false;
                        break;
                    }
                }
            }
            if (stack.isEmpty() && bool) {
                bw.write("yes\n");
            } else {
                bw.write("no\n");
            }

            stack.clear();
        }

        bw.flush();
        bw.close();
    }
}

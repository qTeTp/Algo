import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 괄호
// 입력받은 숫자만큼 반복
// (면 op++ )면 op--
// 중간에 op가 음수가 되면 바로 false 반환
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        boolean[] bool = new boolean[n];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            // 괄호의 카운트
            int op = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '(')
                    op++;
                else {
                    op--;
                    if (op < 0) {
                        bool[i] = false;
                        break;
                    }
                }
            }
            if (op == 0)
                bool[i] = true;
            else
                bool[i] = false;
        }

        for (int i = 0; i < n; i++) {
            if (bool[i] == true)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
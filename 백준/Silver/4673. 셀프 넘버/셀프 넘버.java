import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
백준 4673 셀프 넘버
양의 정수 n과 n의 각 자리수를 더한 수가 있을 때
n은 생성자라고 부름 이 생성자가 없는 수를 셀프 넘버라 칭함
ex) 13 + 1 + 3 -> 17
 */
public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static boolean[] arr;

    public static void main(String[] args) throws Exception {
        arr = new boolean[10001];

        for (int i = 1; i < arr.length + 1; i++) {
            int n = self(i);

            if (n < 10001) {
                arr[n] = true;
            }
        }

        for (int i = 1; i < arr.length; i++) {
            if (!arr[i]) {
                bw.write(i + "\n");
            }
        }
        bw.flush();
        bw.close();
    }

    public static int self(int num) {
        int result = num;

        String strNum = String.valueOf(num);
        for (int i = 0; i < strNum.length(); i++) {
            // result += Character.getNumericValue(strNum.charAt(i));
            result += strNum.charAt(i) - '0';
        }

        return result;
    }
}

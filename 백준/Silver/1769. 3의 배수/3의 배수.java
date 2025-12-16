import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
백준 1769 3의 배수
1. 입력받은 숫자의 각 자릿수를 모두 더함
2. 한자리 수가 될 때까지 반복
3. 더한 횟수와 3의 배수 여부를 반환
 */
public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        String str = br.readLine();
        int result = 0;

        while (str.length() > 1) {
            long tmp = 0;

            // 각 자릿수의 합
            for (int i = 0; i < str.length(); i++) {
                // 뒤의 공백을 붙여주지 않으면 유니코드 값으로 변환
                tmp += Long.valueOf(str.charAt(i) + "");
            }
            str = String.valueOf(tmp);
            result++;
        }

        if (Long.valueOf(str) % 3 == 0) {
            bw.write(result + "\nYES");
        } else {
            bw.write(result + "\nNO");
        }

        bw.flush();
        bw.close();
    }
}

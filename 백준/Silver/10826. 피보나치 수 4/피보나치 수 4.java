import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

/*
백준 10826 피보나치 수 4
줜나게 큰 수라 long으로도 커버 불가능
 */
public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        int num = Integer.valueOf(br.readLine());
        BigInteger[] arr = new BigInteger[num + 2];

        arr[0] = BigInteger.ZERO;
        arr[1] = BigInteger.ONE;

        if (num == 0) {
            bw.write("0");
        } else if (num == 1) {
            bw.write("1");
        } else {
            for (int i = 2; i < num + 1; i++) {
                arr[i] = arr[i - 2].add(arr[i - 1]);
            }
            bw.write(arr[num] + "");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

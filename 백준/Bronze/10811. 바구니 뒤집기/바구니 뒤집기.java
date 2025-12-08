import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
백준 10811 바구니 뒤집기
n개의 배열, m번 자리를 바꾼다
ni ~ ji까지의 자리를 모두 바꾼다
 */
public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine());
        // n 길이인 배열, m번 배열에 값 넣음
        int n = Integer.valueOf(st.nextToken());
        int m = Integer.valueOf(st.nextToken());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int ni = Integer.valueOf(st.nextToken()) - 1;
            int ji = Integer.valueOf(st.nextToken()) - 1;
            int[] newArr = new int[arr.length];
            for (int j = 0; j < n; j++) {
                if (j >= ni && j <= ji) {
                    newArr[ni + (ji - j)] = arr[j];
                } else {
                    newArr[j] = arr[j];
                }
            }
            arr = newArr;
        }

        // 1 더해서 출력
        for (int i = 0; i < n; i++) {
            bw.write((arr[i] + 1) + " ");
        }
        bw.flush();
        bw.close();
    }
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
백준 20053 최소, 최대 2
n개의 정수 중 최소, 최댓값 반환
 */
public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            // 최대, 최소값 초기화
            int max = -1000000;
            int min = 1000000;

            for (int j = 0; j < num; j++) {
                int tmp = Integer.valueOf(st.nextToken());
                max = Math.max(max, tmp);
                min = Math.min(min, tmp);
            }

            bw.write(min + " " + max + "\n");
        }

        bw.flush();
        bw.close();
    }
}

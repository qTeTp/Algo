import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
백준 7568 덩치
구현 문제
몸무게, 키로 덩치를 계산해서 등수를 매긴다
둘 다 커야지 큰 거임
그런데 몸무게는 더 나가지만 키는 작다면 덩치가 더 크다고 할수 없다
그래서 둘 다 큰 것이 아니라면 동급으로 처리한다
둘다 비교해본다
 */
public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        int num = Integer.valueOf(br.readLine());
        int[][] arr = new int[num][2];

        // 입력
        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int tmpH = Integer.valueOf(st.nextToken());
            int tmpW = Integer.valueOf(st.nextToken());

            arr[i][0] = tmpH;
            arr[i][1] = tmpW;
        }

        // 비교
        for (int i = 0; i < num; i++) {
            int rank = 1;

            for (int j = 0; j < num; j++) {
                // 같은 사람x
                if (i == j) {
                    continue;
                }
                // 몸무게, 키 둘다 같이 커야지 랭크 업
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    rank++;
                }
            }

            bw.write(rank + " ");
        }

        bw.flush();
        bw.close();
    }
}

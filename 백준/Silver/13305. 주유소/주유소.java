import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
백준 13305 주유소
n: 도시의 개수
st1: 도시 간의 거리
st2: 리터당 기름값(연비 리터당 1키로)
중간에 엥꼬 안나도록 최소비용 반환
싼 동네까지 가서 만땅을 넣어야 함
싼 가격은 상대적인 것
내림차순이라면 넣음
 */
public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        int n = Integer.valueOf(br.readLine());

        // dis: 도시 간의 거리
        // price: 그 도시에서 판매하는 기름값(리터당)
        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] dis = new long[n - 1];
        for (int i = 0; i < n - 1; i++) {
            dis[i] = Long.valueOf(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        long[] price = new long[n];
        for (int i = 0; i < n; i++) {
            price[i] = Long.valueOf(st.nextToken());
        }

        // 사용 금액, 최저가
        long result = 0;
        long min = price[0];
        for (int i = 0; i < n - 1; i++) {

            // 최저가 갱신
            if (price[i] < min) {
                min = price[i];
            }

            // 최저가 * 거리
            // 또다른 최저가가 나올때까지 반복된다
            result += min * dis[i];
        }

        bw.write(result + "");
        bw.flush();
        bw.close();
    }
}

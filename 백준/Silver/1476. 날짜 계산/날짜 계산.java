import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 날짜 계산
// 우리와 다른 방식으로 연도를 계산하는 나라가 있다.
// 각각 지구(e), 태양(s), 달(m)을 상징하는 수 3개를 이용해 나타낸다.
// (1 <= e <= 15, 1 <= s <= 28, 1 <= m <= 19)
// 1년이 지날 때마다 각 숫자가 1씩 증가한다.
// 15년까진 15 15 15지만 16년부턴 1 16 16
// 세 숫자를 입력했을 때 우리가 알고있는 연도 출력
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 15년까지
        int e = Integer.parseInt(st.nextToken());
        // 28년까지
        int s = Integer.parseInt(st.nextToken());
        // 19년까지
        int m = Integer.parseInt(st.nextToken());

        int year = 0;

        int tmpe = 0;
        int tmps = 0;
        int tmpm = 0;
        // 찾을 때까지 무한루프
        while (true) {
            tmpe++;
            tmps++;
            tmpm++;
            year++;

            if (tmpe == 16) {
                tmpe = 1;
            }
            if (tmps == 29) {
                tmps = 1;
            }
            if (tmpm == 20) {
                tmpm = 1;
            }

            if (tmpe == e && tmps == s && tmpm == m) {
                System.out.println(year);
                break;
            }
        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

// 백준 너의 평점은
// 20과목의 과목명, 학점, 과목 평점을 입력받는다.
// 학점 * 과목평점으로 과목당 학점을 구해서 평균을 출력.
// A+ ~ F, 4.5 ~ 0.0
// map을 이용해 과목 평점당 학점을 기록
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 학점의 총점, 평점의 총점, 학점 기록
        double scoresum = 0.0;
        double sum = 0.0;
        HashMap<String, Double> map = new HashMap<>();
        map.put("A+", 4.5);
        map.put("A0", 4.0);
        map.put("B+", 3.5);
        map.put("B0", 3.0);
        map.put("C+", 2.5);
        map.put("C0", 2.0);
        map.put("D+", 1.5);
        map.put("D0", 1.0);
        map.put("F", 0.0);

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cls = st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String str = st.nextToken();
            // 패스 과목은 계산에서 제외
            if (str.equals("P"))
                continue;
            double rate = map.get(str);

            scoresum += score;
            sum += score * rate;
        }
        System.out.printf("%.6f", sum / scoresum);

    }
}

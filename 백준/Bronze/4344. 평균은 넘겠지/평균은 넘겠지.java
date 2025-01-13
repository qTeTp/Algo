import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 평균은 넘겠지
// 한 줄당 평균 점수를 구해서 한 줄당 평균점수를 넘는 사람의 비율 출력
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            // 합계
            int sum = 0;
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            // 학생의 수, 점수 담을 배열
            int stu = Integer.parseInt(st.nextToken());
            int[] arr = new int[stu];
            for (int j = 0; j < stu; j++) {
                int tmp = Integer.parseInt(st.nextToken());
                arr[j] = tmp;
                sum += tmp;
            }
            // 평균, 나락자들
            double avr = sum / stu;
            double lock = 0;
            // 평균보다 크면 카운팅
            for (int j = 0; j < stu; j++) {
                if (arr[j] > avr)
                    lock++;
            }

            double answer = Math.round(100 * lock / stu * 1000) / 1000.0;
            System.out.printf("%.3f", answer);
            System.out.println("%");
        }
    }
}

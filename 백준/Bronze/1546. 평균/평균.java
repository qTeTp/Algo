import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 평균
// 시험 점수를 주작함. 가장 높은 과목의 점수를 a라고 하면 다른 과목의 점수 / a * 100 함.
// 점수들을 입력받아서 조작된 점수로 바꿔 평균을 출력.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 최대값
        double max = 0;
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] > max)
                max = arr[i];
        }

        double answer = 0.0;
        for (double i : arr) {
            double tmp = (i / max) * 100;
            answer += tmp;
        }
        System.out.println(answer / num);
    }
}

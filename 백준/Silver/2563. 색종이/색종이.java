import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 색종이
// 색종이 여러 장을 도화지 위에 놓는다. 겹칠 수도 있다. 겹쳐진 곳 빼고 색종이가 덮은 넓이 구하기
// 도화지의 가로 : 100, 세로 : 100. 색종이 한장당 넓이 100 * 장수 - 겹친 곳
// 좌표는 가로 0에서부터 떨어진 곳, 세로 0에서부터 떨어진 곳이 주어진다.
// 가로세로 좌표 떨어진 수치가 10이 넘는지 알아봐야 할 듯
// 불가능을 깨닫고... 도화지가 100 100이라는 사실을 뒤늦게 알고 난 뒤 칠해진 곳을 표시하는 걸로 바꿈
// 빈 도화지 배열 100 100을 먼저 만듬
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int answer = 0;

        // 도화지의 넓이. 가로 100, 세로 100
        int[][] dohwaji = new int[101][101];

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            // 배열에 각자 좌표 넣음
            int garo = Integer.parseInt(st.nextToken());
            int sero = Integer.parseInt(st.nextToken());
            // 가로
            for (int j = 0; j < 10; j++) {
                // 세로
                for (int k = 0; k < 10; k++) {
                    dohwaji[garo + j][sero + k] = 1;
                }
            }
        }

        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 101; j++) {
                if (dohwaji[i][j] == 1) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}

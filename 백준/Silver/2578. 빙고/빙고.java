import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/*
백준 2578 빙고
25칸의 빙고판 
첫째 줄 ~ 다섯째 줄 내 빙고판
여섯째 줄 ~ 열째 줄 사회자 빙고판 숫자는 순서대로 부름
몇 턴째 3빙고가 완성되는지 반환
 */
public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int[][] arr;
    // 턴수
    static int turn;
    static int bingo;

    public static void main(String[] args) throws Exception {
        // 플레이어 빙고판
        arr = new int[5][5];

        // 플레이어 빙고판 입력
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 5; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        turn = 0;
        // 사회자 빙고판 차례대로 읽음
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 5; j++) {
                turn++;
                int tmp = Integer.parseInt(st.nextToken());
                // 플레이어 빙고판의 번호 위치 확인
                // 확인 후 0으로 반환
                for (int k = 0; k < 5; k++) {
                    for (int l = 0; l < 5; l++) {
                        if (arr[k][l] == tmp) {
                            arr[k][l] = 0;
                        }
                    }
                }

                // 빙고 확인
                gCheck();
                sCheck();
                rlCheck();
                lrCheck();

                // 3개 이상인지
                if (bingo >= 3) {
                    bw.write(turn + "");
                    break;
                }
                // 한 턴에 한번씩 확인
                bingo = 0;
            }
            // 2중 for문 탈출
            if (bingo >= 3) {
                break;
            }
        }

        bw.flush();
        bw.close();
    }

    // 가로 체크
    static void gCheck() {
        for (int i = 0; i < 5; i++) {
            int cnt = 0;
            for (int j = 0; j < 5; j++) {
                if (arr[i][j] == 0) {
                    cnt++;
                }
            }
            if (cnt == 5) {
                bingo++;
            }
        }
    }

    // 세로 체크
    static void sCheck() {
        for (int i = 0; i < 5; i++) {
            int cnt = 0;
            for (int j = 0; j < 5; j++) {
                if (arr[j][i] == 0) {
                    cnt++;
                }
            }
            if (cnt == 5) {
                bingo++;
            }
        }
    }

    // 오른 -> 왼쪽 대각선 체크
    static void rlCheck() {
        int cnt = 0;
        for (int i = 0; i < 5; i++) {
            if (arr[i][4 - i] == 0) {
                cnt++;
            }
        }

        if (cnt == 5) {
            bingo++;
        }
    }

    // 왼 -> 오른쪽 대각선 체크
    static void lrCheck() {
        int cnt = 0;
        for (int i = 0; i < 5; i++) {
            if (arr[i][i] == 0) {
                cnt++;
            }
        }

        if (cnt == 5) {
            bingo++;
        }
    }
}

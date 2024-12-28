import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int num = Integer.parseInt(br.readLine());
            int[][] arr = new int[num][2];

            for (int i = 0; i < num; i++) {
                String[] input = br.readLine().split(" "); // 한 줄씩 입력
                arr[i][0] = Integer.parseInt(input[0]); // 시작 시간
                arr[i][1] = Integer.parseInt(input[1]); // 종료 시간
            }

            System.out.println(solution(num, arr));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 백준 회의실 배정
    // arr 안에는 각 회의들의 시작하는 시간과 끝나는 시간이 있다. 아직 회의시간이 픽스되진 않은 상태
    // 회의실 대여시간을 야무지게 짜게 많은 팀이 회의실을 사용할 수 있도록 해야한다
    // 즉 회의실을 사용할 수 있는 최대 회수를 반환해야 한다
    // 오름차순하고, 회의시간이 짧은 회의부터 우선순위를 정해야 할 것 같음
    public static int solution(int n, int[][] arr) {
        // 종료 시간을 기준으로 정렬함
        // 종료시간이 같다면 시작시간을 기준으로 자강두천함
        // 람다 사용
        Arrays.sort(arr, (a, b) -> {
            if (a[1] == b[1]) {
                return Integer.compare(a[0], b[0]); // 종료 시간 같을 경우 시작 시간 기준
            }
            return Integer.compare(a[1], b[1]); // 종료 시간 기준
        });

        // 람다 미사용 -------- 시간 초과...
        // 종료시간을 기준으로 정렬
        // 만약 동타가 나온다면 시작 시간을 기준으로 자강두천함
        // for (int i = 0; i < arr.length - 1; i++) {
        // for (int j = 0; j < arr.length - 1 - i; j++) {
        // // 종료시간이 더 작으면 자리 변경
        // // 종료시간 동타. 시작시간이 더 작으면 자리 변경
        // if (arr[j][1] > arr[j + 1][1] || (arr[j][1] == arr[j + 1][1] && arr[j][0] >
        // arr[j + 1][0])) {
        // int[] temp = arr[j];
        // arr[j] = arr[j + 1];
        // arr[j + 1] = temp;
        // }
        // }
        // }

        // 회의 개수, 회의 시작 시간
        int cnt = 0, start = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] >= start) {
                start = arr[i][1];
                cnt++;
            }
        }
        return cnt;
    }
}

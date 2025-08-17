import java.util.Scanner;

public class Main {
    // 백준 2563 색종이
    // x, y 좌표에 10*10 크기의 색종이가 위치하게 됨
    // 겹치는 데 빼고 크기 반환
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 도화지 크기 100,초기값 0
        int[][] arr = new int[101][101];

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    arr[j][k] = 1;
                }
            }
        }

        int cnt = 0;
        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 101; j++) {
                if (arr[i][j] == 1) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}

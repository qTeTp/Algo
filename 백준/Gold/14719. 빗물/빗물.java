import java.util.*;

/*
백준 14719 빗물
2차원 그래프에 블록이 쌓여있고 비가 오면 그 사이에 빗물이 고임
입력 :
첫째 줄에는 2차원 세계의 세로길이와 가로 길이가 주어짐(h, w)
둘째 줄에는 가로 길이 w만큼 각 칸에 쌓여있는 블록의 높이가 주어짐(각 높이의 최대값은 h)
블록 내부의 빈 공간이 생기고 이 곳에 빗물이 고인다
2차원 세계의 바닥은 항상 막혀있다
출력 : 고이는 빗물의 총량(합)
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // h, w 입력 & 블록 높이 입력
        int h = sc.nextInt();
        int w = sc.nextInt();
        sc.nextLine();

        int[] blocks = new int[w];
        for (int i = 0; i < w; i++) {
            blocks[i] = sc.nextInt();
        }

        int totalWater = 0;
        // 각 칸마다 고이는 빗물 계산
        for (int i = 0; i < w; i++) {
            int leftMax = 0;
            int rightMax = 0;

            // 왼쪽 최대 높이 찾기
            for (int j = 0; j < i; j++) {
                if (blocks[j] > leftMax) {
                    leftMax = blocks[j];
                }
            }

            // 오른쪽 최대 높이 찾기
            for (int j = i + 1; j < w; j++) {
                if (blocks[j] > rightMax) {
                    rightMax = blocks[j];
                }
            }

            // 현재 칸에 고이는 빗물 계산
            int waterLevel = Math.min(leftMax, rightMax);
            if (waterLevel > blocks[i]) {
                totalWater += waterLevel - blocks[i];
            }
        }
        System.out.println(totalWater);
        sc.close();
    }
}

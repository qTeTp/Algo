import java.util.*;

// 프로그래머스 하노이의 탑
// 이동하는 경로를 배열에 담아 반환
// 재귀 or 스택 이용
class Solution {
    ArrayList<int[]> lst = new ArrayList<>();

    public int[][] solution(int n) {
        // 원판 개수, 출발지, 도착지
        move(n, 1, 3);
        // list to 배열
        return lst.toArray(new int[0][2]);
    }

    // 재귀
    public void move(int n, int x, int y) {
        // 1, 2, 3 기둥 번호의 합은 항상 6
        if (n > 1) {
            move(n - 1, x, 6 - x - y);
        }
        lst.add(new int[] { x, y });
        if (n > 1) {
            move(n - 1, 6 - x - y, y);
        }
    }
}
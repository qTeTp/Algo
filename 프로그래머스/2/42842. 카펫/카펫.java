// 프로그래머스 카펫
// 갈색은 카펫의 테두리 무조건 두께 1칸, 노란색은 카펫의 속알맹이일 때 카펫의 가로, 세로 길이 구하시오
// 가로길이 >= 세로길이
// 노랑 = (가로 -2) * (세로 - 2)
// 갈색 = 2 * 가로 + 2 * 세로 - 4
// 총넓이 = 노랑 가로 + 2 * 노랑 세로 + 2
// 약수 구하는 메소드 제거
import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        // i -> 가로, yellow / i 때문에 가로가 항상 더 김
        for (int i = 1; i <= yellow; i++) {
            // i -> 노랑의 약수
            if (yellow % i == 0) {
                int garo = yellow / i;
                int sero = yellow / garo;

                if (garo * sero == yellow && yellow + brown == (garo + 2) * (sero + 2)) {
                    return new int[] { garo + 2, sero + 2 };
                }
            }
        }

        return null;
    }
}
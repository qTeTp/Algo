// 프로그래머스 카펫
// 갈색은 카펫의 테두리 무조건 두께 1칸, 노란색은 카펫의 속알맹이일 때 카펫의 가로, 세로 길이 구하시오
// 가로길이 >= 세로길이
// 노랑 = (가로 -2) * (세로 - 2)
// 갈색 = 2 * 가로 + 2 * 세로 - 4
// 총넓이 = 노랑 가로 + 2 * 노랑 세로 + 2
import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        // 노랑 넓이의 약수
        int[] yak = yak(yellow);

        // 최소 넓이
        if (yak.length == 1)
            return new int[] { 3, 3 };

        // 노랑이 제곱수라면
        if (Math.sqrt(yellow) % 1 == 0) {
            return new int[] { (int) Math.sqrt(yellow) + 2, (int) Math.sqrt(yellow) + 2 };
        }

        // i -> 가로, j -> 세로. 가로가 세로보다 커야하니까 역순
        for (int i = yak.length - 1; i >= 1; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (yak[i] * yak[j] == yellow && yellow + brown == (yak[i] + 2) * (yak[j] + 2)) {
                    return new int[] { yak[i] + 2, yak[j] + 2 };
                }
            }
        }

        return null;
    }

    // 약수 구하는 메소드
    public int[] yak(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }

        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
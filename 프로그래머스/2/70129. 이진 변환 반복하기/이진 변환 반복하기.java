// 프로그래머스 이진 변환 반복하기
// 0 제거 후 남은 1의 길이 -> 이진 변환 반복
import java.util.*;

class Solution {
    public int[] solution(String s) {
        // 이진 변환 턴 회수, 제거한 0의 개수
        int turn = 0, del = 0;
        // s의 길이가 1보다 클 때만 반복
        while (s.length() > 1) {
            String tmp = "";
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    del++;
                    continue;
                }
                tmp += s.charAt(i);
            }
            s = Integer.toBinaryString(tmp.length());
            turn++;
        }

        return new int[] { turn, del };
    }
}
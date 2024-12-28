// 프로그래머스 영어 끝말잇기
// n명의 사람들이 영어 끝말잇기중이다. 흔히들 아는 끝말잇기 룰로다가. 중복x, 한글자 x, 시작 글자는 전사람의 마지막 글자
// 탈락자는 룰을 지키지 않으면 정해진다
// 탈락자가 등장하면 몇번째 사람, 몇번째 차례 인지 배열로 반환한다.
// 탙락자가 없다면 {0, 0} 반환
// map에다가 하나씩 넣으면서 있나 비교
import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        // 사람 카운트, 턴 카운트 초기값 1
        int p = 1, turn = 1;
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            // 단어 중복
            if (map.get(words[i]) == null) {
                map.put(words[i], words[i]);
            } else {
                return new int[] { p, turn };
            }
            // 전 단어의 마지막 글자랑 현 단어의 처음 글자랑 다를 때
            if (i != 0 && words[i].charAt(0) != words[i - 1].charAt(words[i - 1].length() - 1)) {
                return new int[] { p, turn };
            }
            // 단어 한글자
            if (words[i].length() == 1) {
                return new int[] { p, turn };
            }

            // 다 돌면 1번 참가자로 가고 턴은 다음 턴으로
            if (p == n) {
                p = 1;
                turn++;
                continue;
            }

            p++;
        }

        // 탈락자 없으면 0, 0 반환
        return new int[] { 0, 0 };
    }
}
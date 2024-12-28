// 프로그래머스 달리기 경주
// 선수를 추월할 때마다 이름을 부름
// 일반 배열로 등수 조회를 하면 너무 느림 죄다 for문 돌려야하니까
// map으로 해서 선수명(String), 등수(int) 이렇게 해놓음
// 등수 조회를 map으로 하고 바꾸는 거는 일반 배열을 변경
import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        // 일반 배열을 map으로 전환
        Map<String, Integer> pmap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            pmap.put(players[i], i);
        }

        // 이름 불림
        for (String c : callings) {
            // map 이용해 부른 선수의 등수 조회
            int tmprank = pmap.get(c);
            // 부른 선수의 앞 등수의 선수명을 가져옴
            String tmpname = players[tmprank - 1];

            // 선수 교체
            players[tmprank - 1] = players[tmprank];
            players[tmprank] = tmpname;
            // map 최신화
            pmap.put(players[tmprank - 1], tmprank - 1);
            pmap.put(players[tmprank], tmprank);
        }
        return players;
    }
}
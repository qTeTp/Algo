// 프로그래머스 구명보트
// 무게 제한이 있는 보트를 최소한의 이동으로 사람들을 모두 옮겨야 함
// people -> 사람들의 몸무게가 있는 배열
// limit -> 보트의 수용 최대 무게
// 일단 정렬
// 일단 최대 회수로 반복
// 무거운 애부터 태움. 근데 가벼운 애를 태울 수 있다면 같이 태움
import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);

        // 가벼운 사람, 무거운 사람
        int light = 0;
        int heavy = people.length - 1;

        for (int i = heavy; i >= light; i--) {
            if (people[i] + people[light] <= limit) {
                light++;
            }
            answer++;
        }

        return answer;
    }
}
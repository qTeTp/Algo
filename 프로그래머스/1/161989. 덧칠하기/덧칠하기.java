// 프로그래머스 덧칠하기
// n -> 페인트가 칠해져야 하는 총 섹션. 칠해진 곳, 다시 칠해져야 하는 곳이 있다
// m -> 브러쉬가 한 번에 칠할 수 있는 길이
// section -> 다시 칠해야 하는 곳
// 최소 브러쉬질이 반환되어야 함
class Solution {
    public int solution(int n, int m, int[] section) {
        // s = section 배열 길이, last = 브러쉬한 마지막 섹션
        // 반복은 n의 길이만큼 안해도 됨. section의 처음과 끝까지만 함
        int s = 0, last = 0, answer = 0;
        for (int i = section[0]; i <= section[section.length - 1]; i++) {
            if (i == section[s] && i >= last) {
                last = i + m;
                // 다음 section
                s++;
                answer++;
            }
            // 겹치는 곳은 패스
            else if (section[s] == i)
                s++;

        }
        return answer;
    }
}
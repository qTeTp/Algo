// 프로그래머스 삼총사
// 숫자 배열을 받는데 이 배열 중 숫자 세개의 합이 0이라면 삼총사
class Solution {
    public int solution(int[] number) {
        // 배열에서 삼총사가 될 수 있는 경우의 수
        int answer = 0;

        // 숫자가 겹치면 안됨
        for (int i = 0; i < number.length - 2; i++) {
            for (int j = i + 1; j < number.length - 1; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    // 세 수의 합이 0이라면 ++
                    if (number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}

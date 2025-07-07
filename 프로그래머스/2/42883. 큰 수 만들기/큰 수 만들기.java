// 프로그래머스 큰 수 만들기
// 문자열에서 k개의 숫자를 제거했을 때 만들어질 수 있는 가장 큰 숫자 반환
class Solution {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        int turn = 0;

        // k보다 긴 자릿수에서의 최대값, 위치
        // 뒤에 k만큼 남아야하니까 -k 해줌
        for (int i = 0; i < number.length() - k; i++) {
            char max = '0';
            for (int j = turn; j <= i + k; j++) {
                if (max < number.charAt(j)) {
                    max = number.charAt(j);
                    turn = j + 1;
                }
            }
            sb.append(max);
        }
        return sb.toString();
    }
}
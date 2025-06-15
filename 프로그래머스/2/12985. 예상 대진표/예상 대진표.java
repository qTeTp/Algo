// 예상 대진표
// 토너먼트 대회가 진행 중. a, b 선수가 항상 이긴다고 가장했을 때 몇 번째 경기에서 만나게 되는지 반환. 부전승 없음.
// 매개변수 n : 선수 인원수. a, b : A, B 선수 넘버
class Solution {
	public int solution(int n, int a, int b) {
		int answer = 0;

		// a, b가 같아질 때까지 반복
		while (a != b) {
			a = a / 2 + a % 2;
			b = b / 2 + b % 2;

			answer++;
		}
		return answer;
	}
}
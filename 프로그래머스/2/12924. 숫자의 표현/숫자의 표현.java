class Solution {
	public int solution(int n) {
		int answer = 0; // 자기 하나만 있는 값

		for (int i = 1; i <= n; i++) {
			int sum = 0;
			for (int j = i; j <= n; j++) {
				sum += j;

				if (sum == n) {
					answer++;
				} else if (sum > n) {
					break;
				}

			}
		}

		return answer;
	}
} // 13 6,7
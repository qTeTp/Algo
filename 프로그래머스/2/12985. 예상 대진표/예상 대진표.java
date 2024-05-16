class Solution { // 예상 대진표
	public int solution(int n, int a, int b) {
		int answer = 0; // 1라운드 시작

		for (int i = 0; i < n / 2; i++) { // 계속 싸움
			if (a == b)
				return answer;
			a = a / 2 + a % 2;
			b = b / 2 + b % 2;

			System.out.println(a + "번째 경기,  " + b + "번째 경기");

			answer++;
		}
		return answer;
	}
}

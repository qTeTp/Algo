import java.util.*;

// 소수찾기(완전탐색 재귀 사용)
// 한자리 숫자를 조합해 만들 수 있는 소수의 조합의 수를 반환
// ex) 17 -> 1, 7, 17. 즉 소수 3개. 3 반환
// ex) 011 -> 11, 101. 즉 소수 2개. 2 반환
class Solution {
	// 중복 제거를 위해 set 사용
	HashSet<Integer> set = new HashSet<>();

	public int solution(String numbers) {
		int answer = 0;
		// 모든 조합을 만듬
		f1("", numbers);

		System.out.println(set);
		// 소수의 개수를 샌다
		for (int i : set) {
			if (isPrime(i) == true) {
				answer++;
			}
		}

		set.clear();
		return answer;
	}

	public void f1(String nums, String others) {
		// 조합을 set에 추가
		if (!nums.equals(""))
			set.add(Integer.valueOf(nums));

		// 남은 숫자 중 한개를 더해 새 조합 생성
		for (int i = 0; i < others.length(); i++) {
			// str1에 계속 남은 숫자 하나씩 더해줌, i만 제외하고 str2 넘겨줌
			f1(nums + others.charAt(i), others.substring(0, i) + others.substring(i + 1));
		}
	}

	// 소수 판별 메소드
	public boolean isPrime(int n) {
		// 0, 1은 소수가 아님
		if (n == 0 || n == 1) {
			return false;
		}

		for (int i = 2; i <= (int) Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		// 소수
		return true;
	}
}
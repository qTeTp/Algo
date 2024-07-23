import java.util.*;

//연속 부분 수열 합의 개수
class Solution {
	public int solution(int[] elements) {
		// 중복값은 안들어가지까 set을 선언 나중에 사이즈만 빼와서 반환할거임
		Set<Integer> set = new HashSet<Integer>();

		// 더하는 길이
		for (int i = 1; i <= elements.length; i++) {
			// 수열 5개
			for (int j = 0; j < elements.length; j++) {
				int tmp = 0;
				// 합 구하기
				for (int u = j; u < j + i; u++) {
					tmp += elements[u % elements.length];
				}
				// set에 추가
				set.add(tmp);
			}
		}
		return set.size();
	}
}
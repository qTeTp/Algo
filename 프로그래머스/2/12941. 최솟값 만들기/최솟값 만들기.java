import java.util.*;

//프로그래머스 최솟값 만들기
class Solution {
	public int solution(int[] a, int[] b) {
		int answer = 0;
		Arrays.sort(a);
		Arrays.sort(b);

		int j = a.length - 1;
		for (int i = 0; i < a.length; i++) {
			answer = answer + a[i] * b[j];
			j--;
		}

		return answer;
	}
}
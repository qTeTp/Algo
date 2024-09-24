//프로그래머스 올바른 괄호
class Solution {
	boolean solution(String s) {
		int cnt = 0;

		System.out.println(s.charAt(0));
		if (s.charAt(0) == ')' || s.charAt(s.length() - 1) == '(') {
			return false;
		}

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				cnt++;
			} else if (s.charAt(i) == ')') {
				cnt--;
			}

			if (cnt < 0) {
				return false;
			}
		}

		if (cnt < 0 || cnt > 0) {
			return false;
		}
		return cnt == 0;
	}
}
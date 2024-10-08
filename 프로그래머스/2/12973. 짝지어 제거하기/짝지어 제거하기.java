import java.util.*;

//프로그래머스 짝지어제거하기
class Solution {
	public int solution(String s) {
		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if (st.isEmpty()) {
				st.add(s.charAt(i));
				continue;
			}
			if (st.peek() == s.charAt(i)) {
				st.pop();
				continue;
			}
			st.add(s.charAt(i));

		}
		return st.isEmpty() ? 1 : 0;
	}
}
import java.util.*;

class Solution { // 짝지어 제거하기
	public int solution(String s) {
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			if (!stack.isEmpty() && stack.peek() == s.charAt(i)) // 스택이 비어있지 않고 맨 위가 같다면
				stack.pop(); // 빼기
			else
				stack.push(s.charAt(i));
		}

		if (stack.isEmpty()) // 올클이면 1
			return 1;

		return 0;
	}
}

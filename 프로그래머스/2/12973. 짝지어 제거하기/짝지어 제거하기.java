
import java.util.*;
class Solution { // 짝지어 제거하기
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            // 스택이 비어 있지 않고, 현재 문자와 스택의 맨 위 문자가 같으면
            if (!stack.isEmpty() && stack.peek() == s.charAt(i)) {
                stack.pop(); // 스택의 맨 위 문자를 제거
            } else {
                stack.push(s.charAt(i)); // 현재 문자를 스택에 추가
            }
        }

        // 스택이 비어 있으면 모든 문자가 짝지어 제거된 것이므로 1을, 그렇지 않으면 0을 반환
        return stack.isEmpty() ? 1 : 0;
    }
}

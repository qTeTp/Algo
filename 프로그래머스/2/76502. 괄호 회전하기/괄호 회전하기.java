import java.util.*;

// 괄호 회전하기(스택)
// 매개변수로 괄호가 들어있는 문자열을 받음. 한 글자씩 돌려봤을 때 올바른 경우만 카운트해서 반환
// ex) []{}()를 받았다면 3 반환
class Solution {
    public int solution(String s) {
        int answer = 0;

        // 한칸씩 뒤로 이동시킴
        for (int i = 0; i < s.length(); i++) {
            Stack<Character> stack = new Stack<>();

            // 모든 괄호들이 정상인지 판별
            for (int j = 0; j < s.length(); j++) {
                char tmp = s.charAt(j);
                if (stack.isEmpty()) {
                    stack.push(tmp);
                } else if (tmp == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (tmp == '}' && stack.peek() == '{') {
                    stack.pop();
                } else if (tmp == ']' && stack.peek() == '[') {
                    stack.pop();
                } else {
                    stack.push(tmp);
                }
            }
            // 다 빼버려서 스택이 비어있다면 카운트
            if (stack.isEmpty()) {
                answer++;
            }
            // 괄호 회전
            s = s.substring(1, s.length()) + s.substring(0, 1);
        }

        return answer;
    }
}
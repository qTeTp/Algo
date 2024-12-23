//프로그래머스 JadenCase 문자열 만들기
class Solution {
	public String solution(String s) {
		String answer = "";

		for (int i = 0; i < s.length(); i++) {
			char tmp = Character.toLowerCase(s.charAt(i));
			if (i == 0 || s.charAt(i - 1) == ' ') {
				tmp = Character.toUpperCase(tmp);
			}
			answer = answer + tmp;
		}

		return answer;
	}
}

// 프로그래머스 둘만의 암호
// 주어진 암호화된 문자열을 복호화해 원래의 문자열로 반환.
// 암호화된 문자열을 index만큼 뒤의 알파벳으로 바꿔야 함.
// 근데 skip에 있는 알파벳을 만나면 건너뛰어야 함. s는 소문자만
import java.util.*;

class Solution {
	public String solution(String s, String skip, int index) {
		String answer = "";
		Set<Character> lst = new HashSet<>();

		// 건너뛰는 문자들 리스트에 넣음
		for (int i = 0; i < skip.length(); i++) {
			lst.add(skip.charAt(i));
		}

		// s의 한글자씩 반복
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			// index만큼 올리기
			for (int j = 0; j < index; j++) {
				// 아스키코드 up, 97 = a, 122 = z
				ch++;
				ch = ch > 122 ? ch = 97 : ch;
				// skip 중 하나랑 일치하면 한번 더
				if (lst.contains(ch) == true) {
					j--;
				}
			}
			answer += ch;
			System.out.println(" " + answer);
		}
		return answer;
	}
}
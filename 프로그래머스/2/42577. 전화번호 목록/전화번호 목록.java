import java.util.*;

// 전화번호 목록(해시)
// 여러 전화번호의 목록이 있다. 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false 반환, 없으면 true 반환
// ex) {12, 123} 이라면 false, {12, 34} 이라면 true
class Solution {
	public boolean solution(String[] phone_book) {
		HashMap<String, Integer> map = new HashMap<>();

		// 해시맵에 배열 집어넣기
		for (String str : phone_book) {
			map.put(str, 1);
		}

		// 접두어가 맵 안에 있는지 확인
		for (int i = 0; i < phone_book.length; i++) {
			for (int j = 0; j < phone_book[i].length(); j++) {
				// 만약 접두어가 맵 안에 존재한다면
				if (map.containsKey(phone_book[i].substring(0, j))) {
					return false;
				}
			}
		}

		// 접두어가 없음
		return true;
	}
}
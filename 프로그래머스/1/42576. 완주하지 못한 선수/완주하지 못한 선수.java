import java.util.*;

// 완주하지 못한 선수(해시)
// 마라톤 경주는 한 명을 제외하곤 모두가 완주 못돌아온 선수 반환
// 매개변수 : 참여한 선수 배열, 완주한 선수 배열
class Solution {
	public String solution(String[] participant, String[] completion) {
		HashMap<String, Integer> hashMap = new HashMap<>();

		// 해시맵에 배열을 넣어줌
		for (String str : participant) {
			// getOrDefault : 키가 등록이 안되어있다면 뒤의 숫자, 되어있다면 뒤의 서술이 들어감
			// ex) 아래의 경우 (a, 0) -> (a, 1) a 두번 등록 시 이렇게 됨
			hashMap.put(str, hashMap.getOrDefault(str, 0) + 1);
		}

		for (String str : completion) {
			hashMap.put(str, hashMap.get(str) - 1);
		}

		// keyset : map에서 밸류값 전체 꺼내보기
		for (String str : hashMap.keySet()) {
			// 밸류값이 0이 아니라면 그 키 반환
			if (hashMap.get(str) != 0) {
				return str;
			}
		}

		return "";
	}
}
import java.util.*;

// 완주하지 못한 선수(해시)
// 마라톤 경주는 한 명을 제외하곤 모두가 완주 못돌아온 선수 반환
// 매개변수 : 참여한 선수 배열, 완주한 선수 배열
class Solution {
	public String solution(String[] participant, String[] completion) {
		// 배열 두개 오른차순 정렬
		Arrays.sort(participant);
		Arrays.sort(completion);

		for (int i = 0; i < completion.length; i++) {
			// 둘이 다르다면 반환
			if (!participant[i].equals(completion[i])) {
				return participant[i];
			}
		}

		return participant[participant.length - 1];
	}
}
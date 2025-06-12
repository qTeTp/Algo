import java.util.*;

// 귤 고르기
// 크기별로 나눠진 귤들이 있음. 크기 차이가 많이 나지 않게 k개를 넣어서 포장하려고 함
// 가능한 최소종류의 개수 반환
// k : 한 박스에 들어갈 귤의 개수. tangerine : 귤의 크기 배열
class Solution {
	public int solution(int k, int[] tangerine) {
		int answer = 0;
		HashMap<Integer, Integer> map = new HashMap<>();

		// 해시맵에 크기별 개수 기록
		for (int i = 0; i < tangerine.length; i++) {
			map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
		}

		// 맵의 키를 리스트에 담고 귤의 개수별 내림차순 정렬
		ArrayList<Integer> lst = new ArrayList<>(map.keySet());
		lst.sort((o1, o2) -> map.get(o2) - map.get(o1));

		for (Integer i : lst) {
			if (k <= 0)
				break;

			answer++;
			k -= map.get(i);
		}

		return answer;
	}
}
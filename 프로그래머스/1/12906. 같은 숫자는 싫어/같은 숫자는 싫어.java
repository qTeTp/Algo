import java.util.*;

// 같은 숫자는 싫어(스택/큐)
// 정수형 배열에서 연속 숫자는 제거하고 반환. 하지만 순서는 유지해야 함.
// 매개변수 arr : 연속 숫자를 제거해야 하는 정수형 배열
// ex) {1, 1, 3, 0, 1, 1} -> {1, 3, 0, 1} 반환
class Solution {
	public int[] solution(int[] arr) {
		// 크기 지정 안해주는 ArrayList로 함
		ArrayList<Integer> lst = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (i != 0 && arr[i] == arr[i - 1]) {
				continue;
			}
			lst.add(arr[i]);
		}

		// Stream을 활용해서 ArrayList를 변환해서 반환
		return lst.stream().mapToInt(Integer::intValue).toArray();
	}
}
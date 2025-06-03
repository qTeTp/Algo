import java.util.*;

// 주식가격(스택/큐)
// 초 단위로 기록된 주식 가격이 담긴 배열을 매개변수로 받음
// 그 가격을 얼마동안 유지하는지 반환(오르는 건 되지만 떨구는 건 안됨)
class Solution {
	public int[] solution(int[] prices) {
		int[] answer = new int[prices.length];

		// 이중 포문으로 하면 될거 같음
		for (int i = 0; i < prices.length; i++) {
			// 각 초마다 기록된 주식 가격
			for (int j = i + 1; j < prices.length; j++) {
				// 일단 증가
				answer[i]++;
				// 가격이 전보다 떨궜으면 패스
				if (prices[i] > prices[j]) {
					break;
				}
			}
		}

		return answer;
	}
}
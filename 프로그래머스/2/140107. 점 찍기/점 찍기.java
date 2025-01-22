// 프로그래머스 점 찍기
// 원점(0, 0)을 기준으로 d만큼의 거리 이하의 지점에 점 찍기
// 피타고라스 정리를 이용해서 거리 구하기
import java.util.*;

class Solution {
	public long solution(int k, int d) {
		long answer = 0;

		// i -> x축의 증가
		for (long i = 0; i <= d; i += k) {
			// y가 될수 있는 최댓값. (x의 제곱 - y가 될수 있는 경우의 수 제곱)의 제곱근
			long max_y = (long) Math.sqrt(Math.pow(d, 2) - Math.pow(i, 2));
			// k배 단위로 y를 가질 수 있음. 0인 경우 +1
			answer += (max_y / k) + 1;
		}
		return answer;
	}
}
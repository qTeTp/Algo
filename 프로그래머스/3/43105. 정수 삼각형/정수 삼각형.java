import java.util.*;

// 정수 삼각형(DP)
// 주어진 매개변수로 조합할 수 있는 값 중 최대값 반환
class Solution {
	public int solution(int[][] triangle) {
		int answer = 0;
		// 합을 저장해두는 삼각형 배열
		int[][] arr = new int[triangle.length][triangle.length];

		// 가장 왼쪽은 미리미리
		arr[0][0] = triangle[0][0];
		for (int i = 1; i < triangle.length; i++) {
			arr[i][0] = arr[i - 1][0] + triangle[i][0];
		}

		// 가운데 채우기
		for (int i = 1; i < triangle.length; i++) {
			for (int j = 1; j < triangle[i].length; j++) {
				// 기록 삼각형의 전 배열과 삼각형의 현재 값 더해서 최대값 뽑음)
				// 기록 삼각형은 왼쪽 오른쪽에서 가져옴
				arr[i][j] = Math.max(arr[i - 1][j - 1] + triangle[i][j], arr[i - 1][j] + triangle[i][j]);
			}
		}

		// 마지막 줄에서 최대값 뽑기
		for (int i = 0; i < triangle.length; i++) {
			answer = Math.max(arr[triangle.length - 1][i], answer);
		}

		return answer;
	}
}
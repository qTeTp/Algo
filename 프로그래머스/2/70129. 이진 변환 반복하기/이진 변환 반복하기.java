class Solution { // 이진 변환 반복하기
	public int[] solution(String s) {
		int[] answer = new int[2];

		while (s.length() > 1) {

			int cnt = 0; // 1이진법 카운트
			for (int i = 0; i < s.length(); i++) {

				if (s.charAt(i) == '0') { // 0이면 제거
					answer[1]++; // '0'의 개수를 세는 변수
				} else { // 1일때
					cnt++;
				}
			}
			s = Integer.toString(cnt, 2);
			answer[0]++;
		}
		return answer;
	}
}

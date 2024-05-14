class Solution { // 다음 큰 숫자
	public int solution(int n) {
		boolean tf = false;
		int cnt = cnt1(Integer.toBinaryString(n)); // 2진수로 변환 후 1의 갯수 기록
		
		while (tf == false) { //tf가 참이 될 때까지 반복
			n++; // 다음 수

			int bn = cnt1(Integer.toBinaryString(n)); // 다음 수의 1의 갯수
			if (bn == cnt) { //1의 갯수가 같다면
				tf = true; //그만
			}
		}
		
		return n;
	}

	public int cnt1(String n) { // 1의 갯수 구하는 메소드
		int cnt = 0;
		for (int i = 0; i < n.length(); i++) {
			if (n.charAt(i) == '1') {
				cnt++;
			}
		}
		return cnt;
	}
}
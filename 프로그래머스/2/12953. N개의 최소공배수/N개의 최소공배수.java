class Solution { // N개의 최소공배수
//	public int solution(int[] arr) {
//		int answer = 0;
//		int min = Arrays.stream(arr).min().getAsInt();
//
//		for (int i = 0; i < arr.length; i++) {
//
//		}
//		return answer;
//	}

	public int solution(int[] arr) { // 최소공배수
		if (arr.length == 1) {
			return arr[0];
		}

		int gcd = getGCD(arr[0], arr[1]);
		int lcm = (arr[0] * arr[1]) / gcd;

		for (int i = 2; i < arr.length; i++) {
			gcd = getGCD(lcm, arr[i]);
			lcm = (lcm * arr[i]) / gcd;
		}

		return lcm;
	}

	public int getGCD(int num1, int num2) { // 최대공약수
		if (num1 % num2 == 0) {
			return num2;
		}
		return getGCD(num2, num1 % num2);
	}
}

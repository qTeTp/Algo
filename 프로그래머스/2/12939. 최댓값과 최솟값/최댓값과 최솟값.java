//프로그래머스 최댓값과 최솟값
class Solution {
	public String solution(String s) {
		Integer max = -10000;
		Integer min = 10000;
		String[] arr = s.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if (Integer.parseInt(arr[i]) > max) {
				max = Integer.parseInt(arr[i]);
			} else if (Integer.parseInt(arr[i]) < min) {
				min = Integer.parseInt(arr[i]);
			}
		}
		return min.toString() + " " + max.toString();
	}
}
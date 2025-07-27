import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Solution sol = new Solution();
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int[] arr = new int[a];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		sol.solution(a, arr);
	}
}

// 백준 10773
// 제로(스택)
// 장부에 돈을 기록하기 위해 한명이 불러주고 한명이 받아적음
// 잘못 부르면 0을 외쳐서 가장 최근의 수를 지움
// 모두 받아적은 수 수의 합을 반환
// 매개변수 a : 부르는 수의 양. arr : 불러주는 수  
class Solution {
	public void solution(int a, int[] arr) {
		Stack<Integer> stack = new Stack();
		for (int i : arr) {
			if (i == 0) {
				stack.pop();
			} else {
				stack.push(i);
			}
		}
		
		int sum = 0;
		int size = stack.size();
		for (int i = 0; i < size; i++) {
			int tmp = stack.pop();
			sum += tmp;
		}
		System.out.println(sum);
	}
}

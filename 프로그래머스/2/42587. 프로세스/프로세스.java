import java.util.*;

// 프로세스(큐)
// 큐에서 대기중인 프로세스를 하나씩 꺼내서 실행하는데 중요도가 더 높은 프로세스가 대기중이라면 넣고 그 프로세스를 꺼내옴.
// location의 위치에 있는 프로세스가 실행되는 순서를 반환
// 매개변수 - priorities : 중요도 배열, location : 실행 순서를 알고싶은 프로세스의 위치
// ex) {2, 1, 3, 2}, 2 를 받음. 위치 2의 중요도는 3. 가장 먼저 실행됨.
class Solution {
	public int solution(int[] priorities, int location) {
		// 우선순위 큐 생성(내림차순) 후 넣어줌
		PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
		for (int i : priorities) {
			queue.add(i);
		}

		// 순위
		int turn = 0;
		while (!queue.isEmpty()) {
			// 우선순위 큐와 매개변수 배열을 비교
			for (int i = 0; i < priorities.length; i++) {
				if (priorities[i] == queue.peek()) {
					queue.poll();
					turn++;
					// 배열의 순번과 location이 일치하면 반환
					if (i == location) {
						return turn;
					}
				}
			}
		}

		return turn;
	}
}
import java.util.*;

// 더 맵게(힙)
// 배열에 모든 음식의 스코빌 지수가 있다. k보다 낮은 음식은 섞어서 스코빌 지수를 k 이상으로 만들어버릴 거임. 섞은 회수 반환
// 할 수 없다면 -1 반환
// 공식 : 가장 안매운 음식 + (두번째 * 2).
// ex) {1, 2, 3, 9, 10, 12}, 7 은 2를 반환.
class Solution {
    public int solution(int[] scoville, int K) {
        // 우선순위 큐 사용 낮은 숫자가 가장 아래로 감
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i : scoville) {
            queue.offer(i);
        }

        int turn = 0;
        while (queue.peek() < K) {
            queue.offer(queue.poll() + (queue.poll() * 2));
            turn++;

            if (queue.peek() < K && queue.size() < 2) {
                return -1;
            }
        }

        return turn;
    }
}
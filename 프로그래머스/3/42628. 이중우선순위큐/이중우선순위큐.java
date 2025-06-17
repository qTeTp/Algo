import java.util.*;

// 이중우선순위큐(힙)
class Solution {
    public int[] solution(String[] operations) {
        // 큐 두개 사용 정방향, 역방향, q의 크기
        PriorityQueue<Integer> fqueue = new PriorityQueue<>();
        PriorityQueue<Integer> rqueue = new PriorityQueue<>(Collections.reverseOrder());
        int qSize = 0;

        for (String str : operations) {
            String[] tmp = str.split(" ");
            // I : 큐에 삽입, D : 삭제
            if (tmp[0].equals("I")) {
                fqueue.offer(Integer.parseInt(tmp[1]));
                rqueue.offer(Integer.parseInt(tmp[1]));
                qSize++;
            } else if (tmp[0].equals("D") && qSize > 0) {
                // -1 : 최솟값 삭제, 1 : 최댓값 삭제
                if (Integer.parseInt(tmp[1]) == -1) {
                    int min = fqueue.poll();
                    rqueue.remove(min);
                } else {
                    int max = rqueue.poll();
                    fqueue.remove(max);
                }
                qSize--;
            }
        }

        int[] answer = { 0, 0 };

        if (qSize > 0) {
            answer[0] = rqueue.peek();
            answer[1] = fqueue.peek();
        }

        return answer;
    }
}
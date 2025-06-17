import java.util.*;

// 이중우선순위큐(힙)
// 우선순위큐 사용
class Solution {
    public int[] solution(String[] operations) {
        // 큐 두개 사용 정방향, 역방향
        PriorityQueue<Integer> fqueue = new PriorityQueue<>();
        PriorityQueue<Integer> rqueue = new PriorityQueue<>(Collections.reverseOrder());

        for (String str : operations) {
            String[] tmp = str.split(" ");
            // I : 큐에 삽입, D : 삭제
            if (tmp[0].equals("I")) {
                fqueue.offer(Integer.parseInt(tmp[1]));
                rqueue.offer(Integer.parseInt(tmp[1]));

            } else if (tmp[0].equals("D") && fqueue.size() > 0) {
                // -1 : 최솟값 삭제, 1 : 최댓값 삭제
                if (Integer.parseInt(tmp[1]) == -1) {
                    rqueue.remove(fqueue.poll());
                } else {
                    fqueue.remove(rqueue.poll());
                }
            }
        }

        int[] answer = { 0, 0 };

        if (fqueue.size() > 0) {
            answer[0] = rqueue.peek();
            answer[1] = fqueue.peek();
        }

        return answer;
    }
}
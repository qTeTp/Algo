import java.util.*;

// 기능개발(스택/큐)
// 기능을 개발 중임. 기능들이 순서대로 있는데 배포를 나감.
// 뒤에꺼가 먼저 개발되도 앞에꺼가 다 될 때까지 기다려야 함. 그리고 같이 배포
// 배포가 몇개씩 같이 나가는지 반환
// 매개변수 progresses : 기능들의 현재까지 진행된 정도. speeds : 하루에 진행 가능한 정도
// ex) [93, 30, 55], [1, 30, 5]를 받으면
// 93은 7일 뒤, 30은 3일 뒤, 55는 9일 뒤 완성
// 30이 먼저 되지만 슨배임을 기다렸다 7일에 같이 나가고 55는 9일에 나감 [2, 1] 반환
class Solution {
    public Integer[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> lst = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        // 반복문 돌리며 계속 진행률 올림
        for (int i = 0; i < progresses.length; i++) {
            // 나머지가 0이면 당일 배포 가능
            if ((100 - progresses[i]) % speeds[i] == 0) {
                queue.offer((100 - progresses[i]) / speeds[i]);
            }
            // 아니면 다른날에 해야함
            else {
                queue.offer((100 - progresses[i]) / speeds[i] + 1);
            }
        }

        int day = queue.poll();
        int cnt = 1;

        while (!queue.isEmpty()) {
            if (day >= queue.peek()) {
                cnt++;
                queue.poll();
            } else {
                lst.add(cnt);
                cnt = 1;
                day = queue.poll();
            }
        }
        lst.add(cnt);

        return lst.toArray(new Integer[0]);
    }
}
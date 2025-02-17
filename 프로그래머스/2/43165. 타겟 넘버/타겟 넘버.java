// 프로그래머스 깊이/너피 우선 탐색(DFS/BFS)
// 양의 정수의 배열 numbers, 양의 정수 타겟 넘버 target이 배개변수로 주어짐
// numbers의 수들을 적절히 더하고 빼서 만들수 있는 target의 방법의 수를 반환
import java.util.*;

class Solution {
    static int answer = 0;

    public int solution(int[] numbers, int target) {
        // dfs
        // dfs(numbers, target, 0, 0);
        // bfs
        bfs(numbers, target);
        return answer;
    }

    // dfs - 재귀 사용
    public void dfs(int[] numbers, int target, int depth, int sum) {
        if (depth == numbers.length) {
            if (sum == target) {
                answer++;
            }
            return;
        }
        // 각각 더하고 빼줌
        // depth + 1을 해주면 즉시 + 1이 동작함.
        // depth++을 해주면 오류 발생. 현재 depth의 값을 사용한 후에 ++을 해주기 때문
        dfs(numbers, target, depth + 1, sum + numbers[depth]);
        dfs(numbers, target, depth + 1, sum - numbers[depth]);
    }

    // bfs - 큐 사용
    public void bfs(int[] numbers, int target) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        // 깊이까지
        for (int i = 0; i < numbers.length; i++) {
            // 너비까지
            int size = queue.size();
            for (int j = 0; j < size; j++) {
                int sum = queue.poll();
                // 무다무다 계속 넣어줌
                queue.add(sum + numbers[i]);
                queue.add(sum - numbers[i]);
            }
        }

        // 들어가있는거 모두 확인
        while (!queue.isEmpty()) {
            if (queue.poll() == target) {
                answer++;
            }
        }
    }
}
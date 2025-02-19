import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 백준 바이러스
// n : 컴퓨터의 수. m : 네트워크 상에 직접 연결되어 있는 컴퓨터 쌍의 수.
// m만큼 직접 연결되어 있는 컴퓨터 번호 쌍
// 노드끼리 연결되어있다면 감염 처리
// 1번 노드가 감염되었을 때, 감염된 컴퓨터의 수 반환
public class Main {
    // 1번 컴퓨터는 안침
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        // 인접행렬
        int[][] map = new int[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            map[num1][num2] = 1;
            map[num2][num1] = 1;
        }

        int[] visited = new int[n + 1];
        bfs(map, visited);
        
        System.out.println(answer);
    }

    // bfs - 큐 사용
    public static void bfs(int[][] map, int[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        visited[1] = 1;
        queue.offer(1);

        while (!queue.isEmpty()) {
            int tmp = queue.poll();

            for (int i = 0; i < map.length; i++) {
                if (map[tmp][i] == 1 && visited[i] == 0) {
                    queue.offer(i);
                    visited[i] = 1;
                    answer++;
                }
            }
        }
    }
}

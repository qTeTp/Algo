import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 백준 DFS와 BFS
// 정점의 개수 n, 간선의 개수 m, 탐색을 시작할 정점의 번호 v
// m개의 간선이 연결하는 두 정점의 번호 입력
// dfs, bfs의 결과 출력
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        // 인접행렬
        int[][] map = new int[n + 1][n + 1];
        int[] visited = new int[n + 1];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            // from 노드, to 노드
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            map[num1][num2] = 1;
            map[num2][num1] = 1;
        }
        // dfs 출력
        dfs(map, visited, v);
        System.out.println();
        visited = new int[n + 1];

        // bfs 출력
        bfs(map, visited, v);
    }

    // dfs - 재귀
    public static void dfs(int[][] map, int[] visited, int v) {
        // 방문 표시, 출력
        visited[v] = 1;
        System.out.printf(v + " ");

        for (int i = 0; i < map.length; i++) {
            // 이어짐 && 미방문 상태라면
            if (map[v][i] == 1 && visited[i] == 0) {
                dfs(map, visited, i);
            }
        }
    }

    // bfs - 큐 사용
    public static void bfs(int[][] map, int[] visited, int v) {
        Queue<Integer> queue = new LinkedList<>();
        // 시작 노드 추가, 방문처리
        visited[v] = 1;
        queue.add(v);

        while (!queue.isEmpty()) {
            int tmp = queue.poll();
            System.out.print(tmp + " ");

            for (int i = 0; i < map.length; i++) {
                if (map[tmp][i] == 1 && visited[i] == 0) {
                    queue.offer(i);
                    visited[i] = 1;
                }
            }
        }

    }
}

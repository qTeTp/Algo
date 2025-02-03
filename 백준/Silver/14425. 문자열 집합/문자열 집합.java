import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashSet;

// 백준 문자열 집합
// 정수 n와 m을 입력
// n개의 집합 s에 포함되어 있는 문자열 입력
// m개의 검사해야 할 문자열 입력
// m개의 문자열 중 s의 문자열과 몇개가 일치하는지 반환
// 일치하는 문자열의 검색 활용도를 높이기 위해 map이나 set 사용
// map은 시간 초과 나옴 set 사용
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 일치하는 수
        int answer = 0;
        HashSet<String> set = new HashSet<>();

        // n개의 비교 문자열
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        // m개의 비교해야할 문자열
        // 일치값이 존재하면 answer++
        for (int i = 0; i < m; i++) {
            if (set.contains(br.readLine())) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}

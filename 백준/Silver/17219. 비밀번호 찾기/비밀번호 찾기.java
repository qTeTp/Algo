import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashMap;

// 백준 비밀번호 찾기
// 저장된 사이트의 주소 n개, 비밀번호를 찾으려는 주소 m개
//
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 주소, 비밀번호 각 저장할 map
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            map.put(st.nextToken(), st.nextToken());
        }
        // 주소 입력하면 비밀번호 출력
        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            System.out.println(map.get(str));
        }
    }
}

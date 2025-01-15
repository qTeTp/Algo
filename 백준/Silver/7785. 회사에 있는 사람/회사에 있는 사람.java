import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

// 백준 회사에 있는 사람
// 회사에 사람들이 출근 퇴근을 한다. 출근은 enter, 퇴근은 leave.
// 회사에 남아있는 사람들을 출력하시오.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        // 방명록
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            // 출근
            if (st.nextToken().equals("enter")) {
                set.add(str);
            }
            // 퇴근
            else {
                set.remove(str);
            }
        }
        // to list, 정렬
        List<String> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

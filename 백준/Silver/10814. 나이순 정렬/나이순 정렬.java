import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// 백준 나이순 정렬
// 나이 이름순으로 사람들이 입력됨
// 나이순으로 정렬해서 출력하면 됨
// 배열에 넣고 정렬. 나이가 같다면 가입한 순으로 정렬
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String[][] arr = new String[num][2];
        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }

        // 2차원 배열 정렬
        // Comparator에 2차원 배열이니까 String[]을 넣음. 1차원이라면 String.
        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] s1, String[] s2) {
                // 둘이 나이가 같다면 가입 순서로 가야하니까 1 반환
                if (s1[0] == s2[0]) {
                    return 1;
                }
                // 나이가 다르다면 음수가 나올 때 자리 변경
                else {
                    return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
                }
            }
        });

        for (int i = 0; i < num; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}

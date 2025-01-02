import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

// 백준 그룹 단어 체커
// 그룹 단어를 체크해야 한다
// 한 단어 안에서 다른 문자 사이에 나왔던 문자가 또 나오면 그룹 단어가 아니다
// set을 활용해서 아스키 코드값을 넣음
// 전 단어랑 일치하지 않고 배열 안에 이미 동일한 아스키 코드가 있다면 추가 x
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int answer = 0;
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            HashSet<Integer> set = new HashSet<>();
            for (int j = 0; j < str.length(); j++) {
                if (j == 0) {
                    set.add((int) str.charAt(j));
                    continue;
                }
                if (str.charAt(j - 1) != str.charAt(j) && set.contains((int) str.charAt(j)) == true) {
                    answer--;
                    break;
                }
                set.add((int) str.charAt(j));
            }
            answer++;
        }
        System.out.println(answer);
    }
}

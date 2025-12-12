import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/*
백준 17413 단어 뒤집기 2
문자열 S를 뒤집어 출력
<> 태그 사이는 안 뒤집음


 */
public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static ArrayList<Integer> lst;

    public static void main(String[] args) throws Exception {
        String S = br.readLine();

        // 결과물
        StringBuilder sb = new StringBuilder();
        // 태그 On이면 true
        boolean tf = S.charAt(0) == '<';
        // 첫 단어 넣어줌
        String tmp = String.valueOf(S.charAt(0));

        // 첫 단어 이미 넣었으니 다음 단어부터
        for (int i = 1; i < S.length(); i++) {
            // 태그를 만나게 되면 tf 활성화
            if (S.charAt(i) == '>') {
                tf = false;

                tmp += S.charAt(i);
                sb.append(tmp);
                tmp = "";
            } else if (S.charAt(i) == '<') {
                tf = true;

                for (int j = 0; j < tmp.length(); j++) {
                    sb.append(String.valueOf(tmp.charAt(tmp.length() - j - 1)));
                }
                tmp = String.valueOf(S.charAt(i));

            } else if (!tf && S.charAt(i) == ' ') { // 태그 밖에서 공백을 만난 경우
                for (int j = 0; j < tmp.length(); j++) {
                    sb.append(String.valueOf(tmp.charAt(tmp.length() - j - 1)));
                }
                sb.append(S.charAt(i));
                tmp = "";
            } else {
                tmp += S.charAt(i);
            }

            // 마지막에 sb에 넣고 나오기
            if (!tf && i == S.length() - 1) {
                for (int j = 0; j < tmp.length(); j++) {
                    sb.append(String.valueOf(tmp.charAt(tmp.length() - j - 1)));
                }
            } else if (tf && i == S.length() - 1) {
                sb.append(tmp);
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}

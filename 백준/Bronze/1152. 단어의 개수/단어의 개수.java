import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 백준 단어의 개수
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        // 입력받은 문자열을 토큰화, 공백을 기준으로
        StringTokenizer st = new StringTokenizer(str, " ");
        // 토큰의 개수 반환
        System.out.println(st.countTokens());
    }
}

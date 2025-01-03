import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 크로아티아 알파벳
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = (br.readLine());
        int answer = 0;

        for (int i = 0; i < str.length(); i++) {
            char tmp = str.charAt(i);
            if ((tmp == 'c') && i < str.length() - 1) {
                if (str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-')
                    i++;
            }
            if (tmp == 'd' && i < str.length() - 2) {
                if (str.charAt(i + 1) == 'z' && str.charAt(i + 2) == '=')
                    i += 2;
            }
            if (tmp == 'd' && i < str.length() - 1) {
                if (str.charAt(i + 1) == '-')
                    i++;
            }
            if (tmp == 'l' && i < str.length() - 1) {
                if (str.charAt(i + 1) == 'j')
                    i++;
            }
            if (tmp == 'n' && i < str.length() - 1) {
                if (str.charAt(i + 1) == 'j')
                    i++;
            }
            if (tmp == 's' && i < str.length() - 1) {
                if (str.charAt(i + 1) == '=')
                    i++;
            }
            if (tmp == 'z' && i < str.length() - 1) {
                if (str.charAt(i + 1) == '=')
                    i++;
            }
            answer++;
        }
        System.out.println(answer);
    }
}

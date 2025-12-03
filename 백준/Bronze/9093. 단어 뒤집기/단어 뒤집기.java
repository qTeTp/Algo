import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
백준 9093 단어 뒤집기
문장이 주어지면 단어를 모두 뒤집어서 출력, 단어의 순서는 바꾸지 않음
 */
public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        int n = Integer.valueOf(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            String[] arr = str.split(" ");
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr[j].length(); k++) {
                    bw.write(arr[j].charAt(arr[j].length() - k - 1));
                }
                bw.write(" ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}

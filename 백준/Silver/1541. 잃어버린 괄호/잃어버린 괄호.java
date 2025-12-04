import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/*
백준 1541 잃어버린 괄호
 */
public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        String str = br.readLine();
        int result = 0;

        // 어레이리스트에 나눠담기
        ArrayList<Integer> array = new ArrayList<>();
        String tmp = "";
        for (int i = 0; i < str.length(); i++) {

            tmp += str.charAt(i);
            if (i == str.length() - 1 || str.charAt(i + 1) == '+' || str.charAt(i + 1) == '-') {
                array.add(Integer.valueOf(tmp));
                tmp = "";
            }
        }

        // -를 만나고부터는 무적권 빼버리기
        boolean tf = false;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) < 0) {
                tf = true;
            }

            if (!tf) {
                result += array.get(i);
            } else {
                result -= Math.abs(array.get(i));
            }
        }

        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}

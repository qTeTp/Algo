import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

/*
백준 18258 큐2
큐 구현
push: 추가
pop: 빼고 출력
size: 개수 출력
empty: 비면 1, 아니면 0 출력
front: 가장 앞의 정수 출력, 없으면 -1 출력
back
 */
public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        int n = Integer.valueOf(br.readLine());
        LinkedList<Integer> quArr = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String tmpStr = st.nextToken();
            if (tmpStr.equals("push")) { // 정수를 넣음
                int tmp = Integer.valueOf(st.nextToken());

                quArr.add(tmp);
            } else if (tmpStr.equals("pop")) { // 가장 앞의 정수 빼고 출력, 비었으면 -1 출력
                if (quArr.isEmpty()) {
                    // System.out.println(-1);
                    bw.write(-1 + "\n");
                } else {
                    int tmp = quArr.get(0);
                    // System.out.println(tmp);
                    bw.write(tmp + "\n");
                    quArr.remove(0);
                }
            } else if (tmpStr.equals("size")) {
                // System.out.println(quArr.size());
                bw.write(quArr.size() + "\n");
            } else if (tmpStr.equals("empty")) { // 비었으면 1, 안비었으면 0
                if (quArr.isEmpty()) {
                    // System.out.println(1);
                    bw.write(1 + "\n");
                } else {
                    // System.out.println(0);
                    bw.write(0 + "\n");
                }
            } else if (tmpStr.equals("front")) { // 맨 앞 정수 출력, 비었으면 -1
                if (quArr.isEmpty()) {
                    // System.out.println(-1);
                    bw.write(-1 + "\n");
                } else {
                    // System.out.println(quArr.get(0));
                    bw.write(quArr.get(0) + "\n");
                }
            } else if (tmpStr.equals("back")) { // 맨 뒤 정수 출력, 비었으면 -1
                if (quArr.isEmpty()) {
                    // System.out.println(-1);
                    bw.write(-1 + "\n");
                } else {
                    // System.out.println(quArr.get(quArr.size() - 1));
                    bw.write(quArr.get(quArr.size() - 1) + "\n");
                }
            }
        }

        bw.flush();
        bw.close();
    }
}

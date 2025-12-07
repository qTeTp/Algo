import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

/*
백준 28279 덱 2
덱 구현
스택, 큐를 혼합
양쪽 끝에서 삽입, 삭제를 동시에 허용
1 X: 정수 X를 덱의 앞에 넣는다. (1 ≤ X ≤ 100,000)
2 X: 정수 X를 덱의 뒤에 넣는다. (1 ≤ X ≤ 100,000)
3: 덱에 정수가 있다면 맨 앞의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
4: 덱에 정수가 있다면 맨 뒤의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
5: 덱에 들어있는 정수의 개수를 출력한다.
6: 덱이 비어있으면 1, 아니면 0을 출력한다.
7: 덱에 정수가 있다면 맨 앞의 정수를 출력한다. 없다면 -1을 대신 출력한다.
8: 덱에 정수가 있다면 맨 뒤의 정수를 출력한다. 없다면 -1을 대신 출력한다.
 */
public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static LinkedList<Integer> lst = new LinkedList<>();

    public static void main(String[] args) throws Exception {
        int n = Integer.valueOf(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int tmp = Integer.valueOf(st.nextToken());
            if (tmp == 1) {
                int tmpInt = Integer.valueOf(st.nextToken());
                lst.add(0, tmpInt);
            } else if (tmp == 2) {
                int tmpInt = Integer.valueOf(st.nextToken());
                lst.add(tmpInt);
            } else if (tmp == 3) {
                if (lst.isEmpty()) {
                    bw.write(-1 + "\n");
                } else {
                    int tmpInt = lst.get(0);
                    lst.remove(0);
                    bw.write(tmpInt + "\n");
                }
            } else if (tmp == 4) {
                if (lst.isEmpty()) {
                    bw.write(-1 + "\n");
                } else {
                    int tmpInt = lst.get(lst.size() - 1);
                    lst.remove(lst.size() - 1);
                    bw.write(tmpInt + "\n");
                }
            } else if (tmp == 5) {
                bw.write(lst.size() + "\n");
            } else if (tmp == 6) {
                if (lst.isEmpty()) {
                    bw.write(1 + "\n");
                } else {
                    bw.write(0 + "\n");
                }
            } else if (tmp == 7) {
                if (lst.isEmpty()) {
                    bw.write(-1 + "\n");
                } else {
                    int tmpInt = lst.get(0);
                    bw.write(tmpInt + "\n");
                }
            } else if (tmp == 8) {
                if (lst.isEmpty()) {
                    bw.write(-1 + "\n");
                } else {
                    int tmpInt = lst.get(lst.size() - 1);
                    bw.write(tmpInt + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

// 백준 큐
// 큐를 구현해서 풀어보겠다
// push -> 정수를 큐에 넣는 연산
// pop -> 큐에서 가장 앞의 정수를 빼고 그 수를 출력. 아무것도 없다면 -1 출력
// size -> 큐에 들어있는 정수의 개수 출력
// empty -> 큐가 비어있다면 1 출력. 아니라면 0 출력
// front -> 큐의 가장 앞의 정수 출력. 아무것도 없다면 -1 출력
// back -> 큐의 가장 뒤의 정수 출력. 아무것도 없다면 -1 출력
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 큐를 구현하기 위해 링크드 리스트 생성
        LinkedList<Integer> lst = new LinkedList<>();
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            String str = br.readLine();

            if (str.contains("push")) {
                String[] tmp = str.split(" ");
                lst.add(Integer.parseInt(tmp[1]));
            } else if (str.equals("pop")) {
                if (lst.size() == 0)
                    System.out.println(-1);
                else {
                    System.out.println(lst.getFirst());
                    lst.removeFirst();
                }
            } else if (str.equals("size")) {
                System.out.println(lst.size());
            } else if (str.equals("empty")) {
                if (lst.size() == 0)
                    System.out.println(1);
                else
                    System.out.println(0);
            } else if (str.equals("front")) {
                if (lst.size() == 0)
                    System.out.println(-1);
                else
                    System.out.println(lst.getFirst());
            } else if (str.equals("back")) {
                if (lst.size() == 0)
                    System.out.println(-1);
                else
                    System.out.println(lst.getLast());
            }
        }

    }
}

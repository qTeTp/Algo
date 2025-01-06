import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

// 백준 덱
// 스택이랑 큐랑 짬뽕해둠
// push_front -> 정수를 덱의 앞에 넣는다
// push_back -> 정수를 덱의 뒤에 넣는다
// pop_front -> 덱의 가장 앞에 있는 수를 빼고 그 수 출력. 아무것도 없다면 -1 출력
// pop_back -> 덱의 가장 뒤에 있는 수를 빼고 그 수 출력. 아무것도 없다면 -1 출력
// size -> 정수의 개수 출력
// empty -> 비면 1 아니면 0 출력
// front -> 가장 앞의 정수 출력 비었다면 -1 출력
// back -> 가장 뒤의 정수 출력 비었다면 -1 출력
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 덱이 될 링크드리스트
        LinkedList<Integer> lst = new LinkedList<>();
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            String str = br.readLine();

            if (str.contains("push_front")) {
                String[] tmp = str.split(" ");
                lst.addFirst(Integer.parseInt(tmp[1]));
            } else if (str.contains("push_back")) {
                String[] tmp = str.split(" ");
                lst.addLast(Integer.parseInt(tmp[1]));
            } else if (str.equals("pop_front")) {
                if (lst.size() == 0) {
                    System.out.println(-1);
                    continue;
                }
                System.out.println(lst.getFirst());
                lst.removeFirst();
            } else if (str.equals("pop_back")) {
                if (lst.size() == 0) {
                    System.out.println(-1);
                    continue;
                }
                System.out.println(lst.getLast());
                lst.removeLast();
            } else if (str.equals("size")) {
                System.out.println(lst.size());
            } else if (str.equals("empty")) {
                if (lst.size() == 0)
                    System.out.println(1);
                else
                    System.out.println(0);
            } else if (str.equals("front")) {
                if (lst.size() == 0) {
                    System.out.println(-1);
                    continue;
                }
                System.out.println(lst.getFirst());
            } else if (str.equals("back")) {
                if (lst.size() == 0) {
                    System.out.println(-1);
                    continue;
                }
                System.out.println(lst.getLast());
            }
        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 요세푸스 문제 0
// n k 를 입력받음
// n -> 총 인원
// k -> k만큼 돌아가면서 죽여버림
// n명의 사람들이 빙글 둘러서 앉아있다. 매 턴 k번째 사람을 죽인다.
// 한바퀴를 돌았다면 다시 1번 사람부터 죽인다. 모두 죽을 때까지 반복
// ex) 7 3 -> <3 6 2 7 5 1 4>
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 사람들의 수, 죽는 순서
        int people = Integer.parseInt(st.nextToken());
        int turn = Integer.parseInt(st.nextToken());

        // 사람 생존 여부 배열(살아있다면 0, 죽으면 1), kill 턴, 죽이는 순서(턴 증가에 따라 1씩 까임)
        int[] arr = new int[people];
        int kill = 0;
        int i = 0;
        int tmp = turn;

        // 첫번째 꺽쇠
        System.out.print("<");
        while (kill < people) {
            // i가
            if (arr[i] == 1) {
                if (i == people - 1) {
                    i = 0;
                } else {
                    i++;
                }
                continue;
            } else if (tmp == 0 && arr[i] == 0) {
                kill++;
                // 7번째가 0으로 들어감
                int p = i == 0 ? people : i;
                // 꺽쇠 컨트롤
                if (kill == people)
                    System.out.print(p + ">");
                else
                    System.out.print(p + ", ");
                arr[i] = 1;
                tmp = turn;
            }
            // i가 배열의 끝까지 가면 돌아옴
            i = (i + 1) % people;
            tmp--;
        }
    }
}

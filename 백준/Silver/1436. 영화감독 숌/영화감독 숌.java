import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 영화감독 숌
// 숌 이새기는 어떤 영화에도 넘버링 666을 넣으려고 함
// 1편은 666, 2편은 1666 요딴식
// 근데 그냥 666의 앞대가리에 숫자가 더해져서 들어가는게 아니라 n번째로 작은 666이 들어가는 수라고 하더라
// 666, 1666, 2666, 3666, 4666, 5666, 6660, 6661, 6662, 6663, 6664, 6665, 6666, 6667, 6668, 6669, 7666, 8666, 9666
// 이렇게 증가함 이게 4자릿수 끝
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        // 666이 제일 작은 상태
        int six = 666;
        int cnt = 1;
        while (cnt != num) {
            six++;
            if (String.valueOf(six).contains("666")) {
                cnt++;
            }
        }

        System.out.println(six);
    }
}

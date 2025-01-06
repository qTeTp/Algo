import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 백준 ATM
// ATM기 앞에 사람들이 있고 n분의 시간이 걸린다
// 순서를 잘 바꿔서 각자에게 걸릴 시간이 최솟값이 될 때의 시간 출력
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String[] arr = str.split(" ");
        int[] intarr = new int[num];
        for (int i = 0; i < num; i++)
            intarr[i] = Integer.parseInt(arr[i]);

        Arrays.sort(intarr);
        int answer = 0;
        int tmp = 0;

        for (int i : intarr) {
            tmp += i;
            answer += tmp;
        }
        System.out.println(answer);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 백준 보물
// 정수가 담긴 두 배열이 주어진다. 두 배열의 정수간으 곱의 합이 최솟값이 나오게 하라.
// 한 배열은 오름차순 정렬, 다른 배열은 내림차순 배열해서 서로 곱해주면 된다.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] arr1 = new int[num];
        int[] arr2 = new int[num];

        // 첫번째 배열
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr1);

        // 두번째 배열
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr2);
        // 1은 오름차순, 2는 내림차순
        int answer = 0;
        for (int i = 0; i < num; i++) {
            answer += arr1[i] * arr2[num - i - 1];
        }
        System.out.println(answer);
    }
}

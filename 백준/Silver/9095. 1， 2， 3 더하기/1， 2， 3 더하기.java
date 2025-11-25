import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 1, 2, 3 더하기
// 정수를 1, 2, 3의 합으로 나타내는 총 방법 반환
// 1 -> 1가지
// 2 -> 2가지
// 3 -> 4가지
// 4 -> 7가지
// 5 -> 13가지
// 이 패턴은 피보나치 수열과 흡사하다
// ex) 입력 5 -> 4인 경우 + 3인 경우 + 2인 경우
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            int tmp = Integer.parseInt(br.readLine());
            System.out.println(fin(tmp));
        }
    }

    public static int fin(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        if (n == 3)
            return 4;

        return fin(n - 1) + fin(n - 2) + fin(n - 3);
    }
}

/*
재귀 없이 해봄
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;


백준9095 1, 2, 3 더하기
정수 n이 주어졌을 때 n을 1, 2, 3의 합으로 구하는 방법의 수
각 수를 만드는 방법
1 - 1
2 - 2
3 - 4 (111, 12, 21, 3)
4 - 7 (1111, 112, 121, 211, 13, 22, 31)
피보나치처럼 규칙이 존재
arr[n] = arr[n-1] + arr[n-2] + arr[n-3]

public class cote {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 각 수
        int[] arr = new int[n];
        // 가장 큰 수
        int max = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            max = Arrays.stream(arr).max().getAsInt();
        }
        int[] inArr = new int[max + 1];

        // 3까진 넣어주기
        inArr[0] = 0;
        inArr[1] = 1;
        inArr[2] = 2;
        inArr[3] = 4;

        // 값 넣어주기 중복 연산 제거
        for (int i = 4; i <= max; i++) {
            inArr[i] = inArr[i - 1] + inArr[i - 2] + inArr[i - 3];
        }

        // 출력
        for (int i = 0; i < n; i++) {
            int tmp = arr[i];
            bw.write(String.valueOf(inArr[tmp] + "\n"));
        }

        bw.flush();
        bw.close();
    }
}
*/

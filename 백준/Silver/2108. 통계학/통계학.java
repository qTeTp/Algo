import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.stream.IntStream;

/*
백준 2108 통계학
정수 N은 홀수
산술평균 : N개의 수들의 합을 N으로 나눈 값
중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
최빈값 : N개의 수들 중 가장 많이 나타나는 값
범위 : N개의 수들 중 최댓값과 최솟값의 차이
N개의 수가 주어졌을 때 네가지 기본 통계값을 반환
 */
public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        int N = Integer.valueOf(br.readLine());

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        int[] arr = new int[N];
        int[] numbers = new int[8001];

        for (int i = 0; i < N; i++) {
            int tmp = Integer.valueOf(br.readLine());
            arr[i] = tmp;

            // 산술평균을 위한 합
            num1 += tmp;

            // 최빈값
            // 후에 배열 중 최댓값 반환
            // 음수 배열 처리
            numbers[tmp + 4000]++;
        }

        // 중앙값 계산
        Arrays.sort(arr);
        num2 = arr[N / 2];

        // 최빈값인 idx를 반환
        // 동타가 있을 경우 두번째로 작은 값 반환
        int num3Max = Arrays.stream(numbers).max().getAsInt();
        // 빈도가 같은 최댓값의 수
        long cntNum3Max = Arrays.stream(numbers).filter(n -> n == num3Max).count();

        // 지피티 코드... 스트림에 약한 관계로
        // 최빈값들만 index로 모아서 정렬
        num3 = IntStream.range(0, 8001)
                .filter(i -> numbers[i] == num3Max)
                .boxed()
                .sorted()
                .skip(cntNum3Max == 1 ? 0 : 1) // 단독이면 first, 동타면 second
                .findFirst()
                .orElse(0) - 4000;

        // 산술평균, 중앙값, 최빈값, 범위 출력
        // 산술평균 반올림
        // 오름차순 정렬을 해놨기 때문에 배열의 마지막 - 첫번째 하면 됨
        bw.write((int) Math.round((double) num1 / N) + "\n" + num2 + "\n" + num3 + "\n" + (arr[N - 1] - arr[0]));
        bw.flush();
        bw.close();
    }
}

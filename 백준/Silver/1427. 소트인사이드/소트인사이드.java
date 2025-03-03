import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 백준 소트인사이드
// 숫자를 내림차순 정렬해서 출력
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char[] arr = str.toCharArray();

        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print((arr[i]));
    }
}

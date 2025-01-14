import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 돌 게임
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        if (num % 2 == 1)
            System.out.println("SK");
        else
            System.out.println("CY");
    }
}

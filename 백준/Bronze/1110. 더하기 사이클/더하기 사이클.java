import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 정수를 입력받아
        // 한자리 수라면 앞에 0을 붙인다
        // 1의 자리의 수 * 10 + 각 자리의 수를 더한 합 = 새로운 수
        // 몇번을 해야지 원래대로 돌아오는지
        int a = sc.nextInt();

        // t : 10의 자리, o : 1의 자리, sum : 각 자리 합 + 오른쪽 수 *10, turn : 몇 번
        int t = a / 10;
        int o = a % 10;
        int sum = o * 10 + (t + o) % 10;
        int turn = 1;
        
        while (a != sum) {
            t = sum / 10;
            o = sum % 10;
            sum = o * 10 + (t + o) % 10;
            turn++;
        }

        System.out.println(turn);
    }
}
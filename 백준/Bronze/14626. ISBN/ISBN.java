import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ISBN
        // 13자리 숫자가 있는데 마지막은 체크기호
        // 이 마지막 숫자는 앞의 각 자리수에 1, 3, 1, 3,...을 곱한 것을 모두 더하고
        // 그 값을 10으로 나눈 나머지가 0이 되도록 만드는 숫자 m을 사용
        // 중간에 훼손된 숫자가 있을 시 그 숫자를 찾아내 리턴

        String str = sc.nextLine();

        int sum = 0;
        int starLocation = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '*') {
                starLocation = i;
                continue;
            }

            int tmp = ch - '0';
            if (i % 2 == 0) {
                sum += tmp;
            } else {
                sum += tmp * 3;
            }
        }

        for (int i = 0; i <= 9; i++) {
            int tmp = sum;
            if (starLocation % 2 == 0) {
                tmp += i;
            } else {
                tmp += (i * 3);
            }
            if (tmp % 10 == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
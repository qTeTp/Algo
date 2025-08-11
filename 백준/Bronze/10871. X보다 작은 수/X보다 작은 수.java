import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < a; i++) {
            int tmp = sc.nextInt();
            if (tmp < b) {
                System.out.print(tmp + " ");
            }
        }
    }
}
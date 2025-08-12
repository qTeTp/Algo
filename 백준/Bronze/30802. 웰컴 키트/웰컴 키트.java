import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int people = sc.nextInt();
        sc.nextLine();

        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }
        sc.nextLine();

        int t = sc.nextInt();
        int p = sc.nextInt();

        // 티 몇묶음인지
        int resultT = 0;
        for (int i = 0; i < 6; i++) {
            while (arr[i] > 0) {
                arr[i] -= t;
                resultT++;
            }
        }
        System.out.println(resultT);
        
        // 펜 몇 묶음, 몇개씩. 개수 딱맞게
        int resultP = people / p;
        int pens = people % p;

        System.out.println(resultP + " " + pens);
    }
}
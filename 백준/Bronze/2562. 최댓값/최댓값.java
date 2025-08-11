import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sc.nextLine();
        }

        int max = 0;
        int maxturn = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxturn = i + 1;
            }
        }

        System.out.println(max + "\n" + maxturn);
    }
}
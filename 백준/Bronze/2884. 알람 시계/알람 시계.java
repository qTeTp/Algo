import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int s = sc.nextInt();

        s = s - 45;
        if (s < 0) {
            h--;
            s = 60 + s;
            if (h < 0) {
                h = 24 + h;
            }
        }
        System.out.println(h + " " + s);
    }
}
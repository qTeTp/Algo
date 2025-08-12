import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 현재 시각
        int h = sc.nextInt();
        int s = sc.nextInt();
        sc.nextLine();
        // 몇분동안?
        int time = sc.nextInt();

        s += time;
        while (s >= 60) {
            h++;
            s -= 60;
        }
        while (h >= 24) {
            h -= 24;
        }
        System.out.println(h + " " + s);
    }
}
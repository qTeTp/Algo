import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < a; i++) {
            String answers = sc.nextLine();

            int score = 0;
            int combo = 1;
            for (int j = 0; j < answers.length(); j++) {
                if (answers.charAt(j) == 'O') {
                    score += combo++;
                } else {
                    combo = 1;
                }
            }
            System.out.println(score);
        }
    }
}
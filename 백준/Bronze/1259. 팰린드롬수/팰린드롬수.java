import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.nextLine();
            if (str.equals("0")) {
                break;
            }

            String reverse = "";
            for (int i = 0; i < str.length(); i++) {
                reverse += str.charAt(str.length() - i - 1);
            }
            if (reverse.equals(str)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
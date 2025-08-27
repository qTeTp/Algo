import java.util.*;

public class Main {
    // 백준 1543 문서 검색
    // 문서에 단어가 몇 번 등장하는지 반환
    // 중복x

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String doc = sc.nextLine();
        String input = sc.nextLine();
        int result = 0;

        while (doc.contains(input)) {
            doc = doc.replaceFirst(input, "*");
            result++;
        }

        System.out.println(result);
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 백준 방 번호
// 0 ~ 9까지 있는 플라스틱 숫자 세트를 번호로 표현하기 위해서 몇 개나 필요한지 반환
// ex) 6은 6, 9로 사용 가능
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        // 숫자 카운터. 6, 9는 7번째 배열을 공용으로 사용
        // 0, 1, 2, 3, 4, 5, 6, 7, 8
        int[] number_cnt = { 1, 1, 1, 1, 1, 1, 2, 1, 1 };

        // 숫자세트 초기 1개
        int set = 1;
        for (int i = 0; i < str.length(); i++) {
            // 해당하는 숫자 카운터 제거
            if (str.charAt(i) == '6' || str.charAt(i) == '9') {
                number_cnt[6]--;
            } else {
                number_cnt[Character.getNumericValue(str.charAt(i))]--;
            }

            // 아스키 코드로 나오기 때문에 Character 클래스의 getNumbericValue 함수 사용
            // -48로 대체 가능
            int tmp = (Character.getNumericValue(str.charAt(i)) == 9) ? 6 : Character.getNumericValue(str.charAt(i));

            // 다 쓰면 한 세트 추가
            if (number_cnt[tmp] < 0) {
                set++;
                for (int j = 0; j < number_cnt.length; j++) {
                    if (j == 6)
                        number_cnt[j] += 2;
                    else
                        number_cnt[j]++;
                }
            }
        }

        System.out.println(set);
    }
}

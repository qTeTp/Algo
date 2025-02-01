// 프로그래머스 신규 아이디 추천
// 아이디가 조건에 부합하지 않다면 비슷한 아이디 추천
// id는 3 ~ 15자
// 소문자, -, _, .(처음 끝 사용 불가능, 연속 사용 불가능)만 사용 가능
import java.util.*;

class Solution {
    // 전역변수 StringBuilder를 이용해 문자열 변경
    static StringBuilder sb = new StringBuilder();

    public String solution(String new_id) {
        // 1. id의 대문자를 모두 소문자로 치환
        for (int i = 0; i < new_id.length(); i++) {
            sb.append(Character.toLowerCase(new_id.charAt(i)));
        }

        f2();
        f3();
        f4();
        f5();

        // 6. 16자 이상이라면 첫 15자 이후 문자열 자르기. 제거 후 .가 끝이라면 제거
        if (sb.length() > 15) {
            sb.setLength(15);
            f4();
        }

        // 7. 2자 이하라면 마지막 문자를 길이가 3이 될때까지 반복
        if (sb.length() < 3) {
            while (sb.length() < 3) {
                sb.append(sb.charAt(sb.length() - 1));
            }
        }

        return sb.toString();
    }

    // 2. 소문자, 숫자, -, _, .을 제회한 모든 문자 제거
    public void f2() {
        char[] f2_arr = sb.toString().toCharArray();
        sb.setLength(0);
        for (char c : f2_arr) {
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '_' || c == '-' || c == '.') {
                sb.append(c);
            }
        }
    }

    // 3. '.'이 2번 이상 연속된 부분 . 하나로 치환
    public void f3() {
        for (int i = 1; i < sb.length(); i++) {
            if (sb.charAt(i) == '.' && sb.charAt(i - 1) == '.') {
                sb.deleteCharAt(i);
                i--;
            }
        }
    }

    // 4. '.'가 처음이나 끝에 위치하면 제거
    public void f4() {
        // 처음
        if (sb.charAt(0) == '.') {
            sb.deleteCharAt(0);
        }
        // 끝
        if (sb.length() != 0 && sb.charAt(sb.length() - 1) == '.') {
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    // 5. 빈 문자열이라면 'a' 대입
    public void f5() {
        if (sb.length() == 0) {
            sb.append("a");
        }
    }
}
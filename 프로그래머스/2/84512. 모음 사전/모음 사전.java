import java.util.*;

// 프로그래머스 모음사전(완전탐색)
// 사전 내에 AEIOU만 사용해서 만들 수 있는 5글자 이하의 단어가 수록되어있음.
// 첫번째 단어는 A고 마지막은 UUUUU. A, AA, AAA, AAAA, AAAAA, AAAAE 이렇게 이어짐
class Solution {
    ArrayList<String> lst = new ArrayList<>();
    String[] arr = { "A", "E", "I", "O", "U" };

    public int solution(String word) {
        dfs("");

        for (int i = 1; i < lst.size(); i++) {
            if (lst.get(i).equals(word)) {
                return i;
            }
        }

        return 0;
    }

    void dfs(String word) {
        lst.add(word);

        // 끝내기 조건. 5글자 이상 단어는 없음
        if (word.length() == 5) {
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            dfs(word + arr[i]);
        }
    }
}
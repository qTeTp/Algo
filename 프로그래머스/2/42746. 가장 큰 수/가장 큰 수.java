// 프로그래머스 가장 큰 수
// 0, 양의 정수가 주어진 배열이 주어진다.
// 이 정수를 이어붙여 만들 수 있는 가장 큰 수 반환
// 1. 람다식 이용해 풀기 2. StringBuilder 이용해서 문자열로 변환
// 일단 오름차순 정렬인데 10 이상인 수는 앞자리 기준으로 정렬해야함
import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        // 스트림을 활용해 문자열로 변환
        String[] answer = Arrays.stream(numbers)
                .mapToObj(String::valueOf) // mapToObj를 활용해 int -> String
                .toArray(String[]::new); // 새로운 String 배열

        // 람다식을 활용. 문자열로 변환한 배열이 두 수를 합쳤을 때 누가 더 큰 수인지 판별
        Arrays.sort(answer, (a, b) -> (b + a).compareTo(a + b));
        // 0으로만 이뤄진 배열인 경우
        if (answer[0].equals("0"))
            return "0";

        for (String s : answer)
            sb.append(s);
        // StringBuilder를 String으로 변환
        return sb.toString();
    }
}
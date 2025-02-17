// 프로그래머스 연속 부분 수열 합의 개수
// 자연수로 이루어진 수열이 주어진다. 이 수열들의 합으로 만들 수 있는 수의 개수 반환(단 중복 수 제외).
// 수의 개수는 1 ~ 수열의 총 개수까지
// set에다가 다 넣고 중복 알아서 걸러주니까
import java.util.*;

class Solution {
    public int solution(int[] elements) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 1; i <= elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                //
                int sum = 0;
                for (int k = j; k < j + i; k++) {
                    sum += elements[k % elements.length];
                }
                set.add(sum);
            }
        }
        return set.size();
    }
}
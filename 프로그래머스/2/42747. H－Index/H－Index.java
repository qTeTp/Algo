// 프로그래머스 H-Index
// 한 과학자의 논문 n편 중, h번 이상 인용된 논문이 h편 이상이고 나머지 논문이 h번 이하 인용되었다.
// 이때 h의 최댓값이 과학자의 H-Index
// 설명이 어렵다... 굉장히 불친절
import java.util.*;

class Solution {
    public int solution(int[] citations) {
        // h인덱스의 최대값
        int answer = 0;
        // 오름차순 정렬
        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {
            int tmp = citations.length - i;

            if (citations[i] >= tmp) {
                answer = tmp;
                break;
            }
        }
        return answer;
    }
}
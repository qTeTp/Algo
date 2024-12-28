// 프포그래머스 추억 점수
// 사진 속의 인물의 그리움 점수의 합게가 해당 사진의 추억 점수
// map으로 점수랑 이름이라 같이 씀
import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        // 멤버 리스트를 map에다가 바꿔줌. 키엔 이름, 값엔 점수를 넣어줌
        Map<String, Integer> namemap = new HashMap<>();
        // name이 yearing보다 길수도 있음
        for (int i = 0; i < yearning.length; i++) {
            namemap.put(name[i], yearning[i]);
        }

        // 이름 비교해서 점수 합
        for (int i = 0; i < photo.length; i++) {
            for (int j = 0; j < photo[i].length; j++) {
                for (int k = 0; k < name.length; k++) {
                    if (photo[i][j].equals(name[k])) {
                        answer[i] += namemap.get(name[k]);
                    }
                }
            }
        }
        return answer;
    }
}
// 프로그래머스 동영상 재생기
// 동영상 재생기의 기능은 10초 전(prev)후(next)로 이동, 오프닝 건너뛰기
// 오프닝 건너뛰기는 자동
// video_len : 동영상의 길이, pos : 기능이 수행될 때의 재생위치, op_start, op_end : 오프닝 시작, 끝나는
// 시간, commands : 사용자의 입력
// 입력이 모두 끝난 뒤 동영상의 위치 반환
class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = pos;

        // 현재 위치가 오프닝 구간이면 엔딩으로 감
        if (minToSec(answer) >= minToSec(op_start) && minToSec(answer) <= minToSec(op_end)) {
            answer = op_end;
        }

        for (int i = 0; i < commands.length; i++) {
            int sec = minToSec(answer);

            // 후로 이동
            if (commands[i].equals("next")) {
                sec += 10;

                // 동영상 총 길이보다 길면 안됨
                if (sec > minToSec(video_len))
                    sec = minToSec(video_len);

            }
            // 전으로 이동
            if (commands[i].equals("prev")) {
                sec -= 10;

                // 음수 방지, 0보다 작아지면 0으로
                if (sec < 0)
                    sec = 0;

            }

            // 오프닝 구간에 겹치면 엔딩으로 감
            if (sec >= minToSec(op_start) && sec <= minToSec(op_end)) {
                sec = minToSec(op_end);
            }

            answer = secToMin(sec);
        }

        return answer;
    }

    // 초 -> 분:초
    // 초 합계에서 60으로 나눔
    // 몫은 분, 나머지는 초로 반환
    public String secToMin(int sumSec) {
        int min = sumSec / 60;
        int sec = sumSec % 60;

        // 한자리일 때 앞자리 0 살리기
        String strmin = (min < 10) ? "0" + min : Integer.toString(min);
        String strsec = (sec < 10) ? "0" + sec : Integer.toString(sec);

        return strmin + ":" + strsec;
    }

    // 분:초 -> 초
    // :로 앞뒤 자르면 0번에는 분, 1번에는 초가 들어감
    // 분에는 *60, 초를 더해주고 초 반환
    public int minToSec(String min) {
        String[] time = min.split(":");

        return Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);
    }
}

// 프로그래머스 붕대 감기
// 피가 닳았을 때 붕대를 감아 피를 채울 수 있음
// 붕대를 감아서 얻은 수 있는 피 : t * 초 + y(풀차징 성공 시 추가 체력)
// 공격 당하면 기술이 끊김
// bandage[시전 시간, 1초당 회복량, 추가 회복량]
// health : 최대 체력
// attacks[공격 시간, 피해량]
class Solution3 {
    public int solution(int[] bandage, int health, int[][] attacks) {
        // 현재 체력
        int curhealth = health;
        // 몬스터 공격 카운터, 연속 힐링 스택
        int cnt = 0, stack = 0;

        // 마지막 몬스터 공격 시간까지 반복
        for (int i = 0; i < attacks[attacks.length - 1][0] + 1; i++) {

            // 몬스터의 공격
            if (attacks[cnt][0] == i) {
                curhealth -= attacks[cnt][1];

                // 힐링 스택 까임
                stack = 0;
                cnt++;
            }
            // 안 맞았을 때 피 회복 시도
            else {
                // 힐링 스택
                stack++;

                // 초당 피 회복
                curhealth += bandage[1];

                // 힐링 풀차징 성공
                if (stack == bandage[0]) {
                    curhealth += bandage[2];
                    // 힐링 스택 초기화
                    stack = 0;
                }

                // 오버 힐링 x
                if (curhealth > health)
                    curhealth = health;
            }
            // System.out.println("time : " + i + " health : " + curhealth);

            // 사망
            if (curhealth <= 0)
                return -1;
        }
        return curhealth;
    }
}

// 프로그래머스 지폐 접기
// 지폐마다 여러번 접어서 지갑에 넣어야 함
// 지폐는 돌려서 넣을 수도 있음
// 1. 항상 긴 쪽을 반으로 접는다
// 2. 접기 전 길이가 홀수라면 소수점 이하는 버림
// 3. 접힌 지폐가 들어간다면 그만 접는다
// 최소 접는 횟수 반환
class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;

        // 긴쪽 0으로 다 보냄
        wallet = charr(wallet);
        bill = charr(bill);

        while (true) {
            // 지갑 길이와 일치하거나 작아지면 종료, 0이 입력될 수도 있음
            if (wallet[0] >= bill[0] && wallet[1] >= bill[1])
                break;
            // 90도 돌려서 한번 더 확인 종료
            if (wallet[0] >= bill[1] && wallet[1] >= bill[0])
                break;

            // 긴 것[0]만 접음
            bill[0] = bill[0] / 2;
            answer++;

            bill = charr(bill);
        }

        return answer;
    }

    // 배열 큰게 앞으로 오게 하는 메소드
    public int[] charr(int[] arr) {

        return (arr[0] > arr[1]) ? new int[] { arr[0], arr[1] } : new int[] { arr[1], arr[0] };
    }
}
// 프로그래머스 최소직사각형(완전탐색)
// 명함의 가로, 세로 길이가 매개변수로 주어진다.
// 이 명함들이 다 들어갈 수 있는 가장 작은 지갑의 크기를 반환.
class Solution {
    public int solution(int[][] sizes) {
        int garo = 0;
        int sero = 0;

        // 큰 쪽이 가로로 가도록 정렬
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                int tmp = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = tmp;
            }
        }
        // 가장 큰 가로와 가장 큰 세로 구함
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] > garo) {
                garo = sizes[i][0];
            }
            if (sizes[i][1] > sero) {
                sero = sizes[i][1];
            }
        }

        // 넓이 반환
        return garo * sero;
    }
}
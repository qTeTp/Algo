// 자연수 뒤집어 배열로 만들기
function solution(n) {
    var answer = [];
    let num = n.toString();

    for (let i = 0; i < num.length; i++) {
        answer[i] = Number(num.charAt(num.length - i - 1));
    }

    return answer;
}
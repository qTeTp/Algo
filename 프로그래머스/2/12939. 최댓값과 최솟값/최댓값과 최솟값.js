// 최댓값과 최솟값
function solution(s) {
    var max = -10000;
    var min = 10000;
    let arr = s.split(' ');

    for (let i = 0; i < arr.length; i++) {
        let tmp = Number(arr[i]);
        if (tmp >= max) {
            max = tmp;
        }
        if (tmp <= min) {
            min = tmp;
        }
    }

    return String(min) + ' ' + String(max);
}